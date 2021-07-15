import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 

        System.out.print("Digite o raio: ");

        float raio = entrada.nextFloat();
        float pi = 3.1415f;

        float area = pi * raio * raio;
        float area2 = 3.1415f * raio * raio;

        System.out.println("Area1: " + area);
        System.out.print("Area2: " + area2);

    }

}