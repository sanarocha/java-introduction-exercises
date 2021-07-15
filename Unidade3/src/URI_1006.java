import java.util.Scanner;
import java.text.DecimalFormat;
public class URI_1006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");

        double a = input.nextDouble() * 2;
        double b = input.nextDouble() * 3;
        double c = input.nextDouble() * 5;

        double media = (a + b + c) / 10;

        System.out.println("MEDIA = " + df.format(media));
        input.close();
        
    }
    
}
