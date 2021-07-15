import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira o nome do funcionario: ");
        String nome = input.nextLine();
        System.out.print("Insira a quantia de horas trabalhadas no mes: ");
        double hrsTrabalhadas = input.nextDouble();
        System.out.print("Insira o numero de dependentes do funcionario: ");
        double numDependentes = input.nextDouble();

        double salarioBruto = (hrsTrabalhadas * 10) + (numDependentes * 60);
        double inss = 8.5 / 100.0;
        double imposto = 5.0 / 100.0;
        double descontos = inss + imposto;
        double salarioLiquido = salarioBruto - (descontos * salarioBruto);

        System.out.println("Funcionario: " + nome);
        System.out.println("Salario bruto: R$ " + salarioBruto);
        System.out.println("Salario liquido: R$ " + salarioLiquido);

input.close();

}
}
