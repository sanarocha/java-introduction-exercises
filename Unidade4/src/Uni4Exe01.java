import java.util.Scanner;

public class Uni4Exe01 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("horas trabalhadas no mes: ");
        int horasTrabalhadas = input.nextInt();

        System.out.print("valor da hora: ");
        float valorHora = input.nextFloat();

        float salario = horasTrabalhadas * valorHora;

        boolean trabalhouAMais = horasTrabalhadas > 160;

        if (trabalhouAMais)  {
            float salarioExtra = (horasTrabalhadas - 160) * (valorHora + (valorHora / 2));
            salario += salarioExtra; 
        }

        System.out.println("o salario total eh: R$ " + salario);
        input.close();

    }
}