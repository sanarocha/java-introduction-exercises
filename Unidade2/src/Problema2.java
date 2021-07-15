import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) {

        //entradas: num. funcionario, num. de horas trabalhadas, valor recebido por hora

        //saidas: numero, salario

        //testes:
        //numero funcionario | numero horas | valor
        // 1 | 10 | 50 -> 1 - 500
        // 2 | 40 | 25 -> 2 - 1000
        // 3 | 120 | 30 -> 3 - 3600

        //algoritmo JAVA:

        Scanner entradas = new Scanner(System.in);

        System.out.print("digite o número do funcionário: ");
        int numeroFuncionario = entradas.nextInt();

        System.out.print("digite a quantidade de horas trabalhadas no mês: ");
        int horasTrabalhadas = entradas.nextInt();

        System.out.print("digite o valor da hora: ");
        int valorHora = entradas.nextInt();

        int salario = horasTrabalhadas * valorHora;

        System.out.println("número funcionário: " + numeroFuncionario + " salário: R$" + salario);

    }

}