import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1008 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int numeroFuncionario = input.nextInt();
        int horasTrabalhadas = input.nextInt();
        double valorHora = input.nextDouble();

        double salario = horasTrabalhadas * valorHora; 

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.println("SALARY = U$ " + df.format(salario));

        input.close();

    }
    
}
