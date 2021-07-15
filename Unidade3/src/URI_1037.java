import java.util.Scanner;

public class URI_1037 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double valor = in.nextDouble();

        if (valor >= 0.00 && valor <= 25.00) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25.00 && valor <= 50.00) {
            System.out.println("Intervalo (25,50]");
        } else if (valor > 50.00 && valor <= 75.00) {
            System.out.println("Intervalo (50,75]");
        } else if (valor > 75.00 && valor <= 100.00) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }
        in.close();
    }
}
