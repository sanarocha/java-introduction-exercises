import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double massaInicialKg = 0, massaInicial = 0, massaFinal = 0, segundos = 0;

        System.out.print("Digite o valor inicial da massa em kg: ");
        massaInicialKg = in.nextDouble();

        massaInicial = massaInicialKg * 1000;
        massaFinal = massaInicial;

        while(massaFinal > 0.5){
            massaFinal /= 2;
            segundos += 50;
        }
        System.out.println("A massa inicial é de "+massaInicial+" gramas.");
        System.out.println("A massa final é de "+massaFinal+" gramas.");
        System.out.println("O tempo foi de "+segundos+" segundos.");

        in.close();
    }
    
}
