import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o comprimento do primeiro cateto: ");
        double cateto1 = input.nextDouble();
        System.out.print("Insira o comprimento do segundo cateto: ");
        double cateto2 = input.nextDouble();

        double hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2); 
        hipotenusa = Math.sqrt(hipotenusa);

        System.out.println("O valor do comprimento da hipotenusa eh: " + hipotenusa);
        input.close();
    }
    
}
