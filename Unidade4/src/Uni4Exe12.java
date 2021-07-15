import java.io.PrintStream;
import java.util.Scanner;

public class Uni4Exe12 {
    private static final PrintStream OUT = System.out;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double lado1, lado2, lado3;

        OUT.print("Digite o comprimento do primeiro lado: ");
        lado1 = in.nextDouble();
        OUT.print("Digite o comprimento do segundo lado: ");
        lado2 = in.nextDouble();
        OUT.print("Digite o comprimento do terceiro lado: ");
        lado3 = in.nextDouble();

        boolean trianguloCondicao = lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2;
        boolean equilatero = lado1 == lado2 && lado2 == lado3 && lado3 == lado1;
        boolean isoscele = lado1 == lado2 || lado2 == lado3 || lado3 == lado1;
        boolean escaleno = lado1 != lado2 && lado2 != lado3 && lado3 != lado1;

        if(trianguloCondicao && equilatero){
            OUT.println("O triângulo é equilátero");
        }
        else if(trianguloCondicao && isoscele){
            OUT.println("O triângulo é isóscele");
        }
        else if(trianguloCondicao && escaleno){
            OUT.println("O triângulo é escaleno");
        }
        else {
            OUT.println("Não satisfaz a condição de existência.");
        }
        in.close();
    }
    
}
