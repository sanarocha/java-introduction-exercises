import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1011 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        
        double raio = entrada.nextDouble();
        double pi = 3.14159;

        double volumeEsfera = (4.0 / 3) * pi * raio * raio * raio;
        System.out.println("VOLUME = " + df.format(volumeEsfera));

        entrada.close();
    }
    
}
