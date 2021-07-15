import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        // Dados dois números inteiros descreva um algoritmo 
        //para informar o maior valor entre eles.
        Scanner in = new Scanner(System.in);

        System.out.print("Insira o primeiro valor inteiro: ");
        int valor1 = in.nextInt();
        System.out.print("Insira o segundo valor inteiro: ");
        int valor2 = in.nextInt();

        boolean valorMaior = valor1 > valor2;

        if(valorMaior) {
            System.out.println("O primeiro valor inserido ("+ valor1 + ") eh o maior.");
        }
        else {
            System.out.println("O segundo valor inserido (" + valor2 + ") eh o maior.");

        }

        in.close();
    }
}
