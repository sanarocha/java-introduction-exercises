import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Insira a distancia percorrida: ");
        double distanciaPercorrida = input.nextDouble();
        System.out.print("Insira o tempo gasto: ");
        double tempoGasto = input.nextDouble();

        double velMedia = distanciaPercorrida / tempoGasto;
        double combustivel = distanciaPercorrida / 12;

        System.out.println("Velocidade media: " + velMedia + " km/h.");
        System.out.println("Quantidade de combustivel gasta: " + combustivel + " litros.");

        input.close();
        
    }
    
}
