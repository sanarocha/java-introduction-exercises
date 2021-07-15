import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        //Dados dois valores inteiros, escreva um algoritmo que informe se eles são múltiplos ou não.
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro valor inteiro: ");
        int valor1 = in.nextInt();
        System.out.print("Digite o segundo valor inteiro: ");
        int valor2 = in.nextInt();

        boolean primeiroValorMaior = valor1 >= valor2;
        boolean segundoValorMaior = valor2 >= valor1;

        if(primeiroValorMaior && valor1 % valor2 == 0){
            System.out.println("Os valores são múltiplos entre si.");
        }
        else if(segundoValorMaior && valor2 % valor1 ==0){
            System.out.println("Os valores são múltiplos entre si.");
        }
        else {
            System.out.println("Os valores não são múltiplos entre si.");
        }
        in.close();
    }
    
}
