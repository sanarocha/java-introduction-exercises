import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1012 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double pi = 3.14159;

        double areaTriangulo = (a * c) / 2;
        double areaCirculo = pi * (c * c);
        double areaTrapezio = ((a + b) * c) / 2;
        double areaQuadrado = b * b;
        double areaRetangulo = a * b;

        System.out.println("TRIANGULO: " + df.format(areaTriangulo));
        System.out.println("CIRCULO: " + df.format(areaCirculo));
        System.out.println("TRAPEZIO: " + df.format(areaTrapezio));
        System.out.println("QUADRADO: " + df.format(areaQuadrado));
        System.out.println("RETANGULO: " + df.format(areaRetangulo));

        input.close();

    }
    
}
