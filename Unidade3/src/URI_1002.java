import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1002 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");

        double raio = entrada.nextDouble();
        double pi = 3.14159;
        double area = pi * (raio * raio);

        System.out.println("A=" + df.format(area));

        entrada.close();

    }
}
