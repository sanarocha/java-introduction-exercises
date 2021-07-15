import java.util.Scanner;

public class URI_1003 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        int soma = x + y;
        System.out.println("SOMA = " + soma);
        input.close();
    }
}
