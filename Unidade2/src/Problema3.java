import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("digite o valor de A: ");
        float a = entrada.nextFloat() * 3.5f;

        System.out.print("digite o valor de B: ");
        float b = entrada.nextFloat() * 7.5f;

        float soma = (b + a)/11;

        System.out.println("média = " +soma);

    }

}