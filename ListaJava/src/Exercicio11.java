import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double fahrenheit = input.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;

        System.out.println(fahrenheit + " graus Fahrenheit sao " + celsius + " 2graus Celsius");

        input.close();
    }
    
}
