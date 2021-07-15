import java.util.Scanner;

public class URI_1004 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();

        int prod = x * y;

        System.out.println("PROD = " + prod);

        input.close();
    }
    
}
