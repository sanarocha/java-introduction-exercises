import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1014 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        int distanciaPercorrida = entrada.nextInt();
        double combustivelGasto = entrada.nextDouble();

        double kmPorLitro = distanciaPercorrida / combustivelGasto;

        System.out.println(df.format(kmPorLitro) + " km/l");

        entrada.close();
    }
    
}
