import java.util.Scanner;
import java.text.DecimalFormat;


public class URI_1010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int a = input.nextInt();
        int b = input.nextInt();
        double c = input.nextDouble();
        int d = input.nextInt();
        int e = input.nextInt();
        double f = input.nextDouble();

        double valorTotal = (b * c) + (e * f);

        System.out.println("VALOR A PAGAR: R$ " + df.format(valorTotal));

        input.close();
    }
    
}
