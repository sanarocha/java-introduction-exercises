import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira um numero de ate 3 digitos: ");
        int numero = input.nextInt();

        int centena = numero / 100;
        numero = numero % 100;

        int dezena = numero / 10;
        numero = numero % 10;

        int unidade = numero;

        System.out.println(centena + " centena(s)");
        System.out.println(dezena + " dezena(s)");
        System.out.println(unidade + " unidade(s)");

        input.close();
    }
    
}
