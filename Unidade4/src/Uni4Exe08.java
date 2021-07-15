import java.util.Scanner;

public class Uni4Exe08 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Escreva uma letra: ");
        String letra = in.next().trim().toUpperCase();

        char vogalChar = letra.charAt(0);

        boolean vogal = letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U");

        if (vogal) {
            System.out.println("É vogal.");

        }
        else {
            System.out.println("Não é vogal.");

        }
        in.close();
    }
    
}
