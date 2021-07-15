import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1009 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        String nomeVendedor = input.next();
        double salarioFixo = input.nextDouble();
        double totalVendas = input.nextDouble();

        double total = salarioFixo + totalVendas * 0.15;

        System.out.println("TOTAL = R$ " + df.format(total));

        input.close();

    
    }
    
}
