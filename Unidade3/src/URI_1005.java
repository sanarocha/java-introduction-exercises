import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1005 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00000");
        
        double a = input.nextDouble();
        double b = input.nextDouble();

        double media = (a * 3.5 + b * 7.5)/11;

        System.out.println("MEDIA = " + df.format(media));

        input.close();

    }
}
