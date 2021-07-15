import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double raio, altura, pi, volume;

        System.out.print("Insira a medida do raio da lata: ");
        raio = input.nextDouble();
        System.out.print("Insira a medida da altura da lata: ");
        altura = input.nextDouble();
        pi = 3.14159;

        volume = pi * (raio * raio) * altura;
        System.out.println("O volume total da lata de oleo eh de: " + volume);

        input.close();
    }
    
}
