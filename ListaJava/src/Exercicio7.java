import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Insira quantas latas foram compradas: ");
        double latas350 = input.nextDouble() * 350;
        System.out.print("Insira quantas garrafas de 600ml foram compradas: ");
        double garrafa600 = input.nextDouble() * 600;
        System.out.print("Insira quantas garrafas de 2L foram compradas: ");
        double garrafa2 = input.nextDouble() * 2000;

        double litros = (latas350 + garrafa600 + garrafa2) / 1000;

        System.out.println("Foram comprados " + litros + " litros.");

        input.close();
    }
    
}
