import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");

        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double calculo = ((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        double distancia = Math.sqrt(calculo);

        System.out.println(df.format(distancia));
        input.close();
    
    }
    
}
