import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a quantidade de meses que o funcionário foi admitido: ");
        int meses = in.nextInt();
        System.out.print("Digite o salário do funcionário: ");
        int salario = in.nextInt();

        if(meses <= 12){
            double salarioReajuste = salario * 0.5;
            salario += salarioReajuste;
            System.out.println("O reajuste salarial é de R$ " + salarioReajuste + ". Salário total = R$ " + salario);
        }
        else if(meses >= 13 || meses <= 48){
            double salarioReajuste = salario * 0.7;
            salario += salarioReajuste;
            System.out.println("O reajuste salarial é de R$ " + salarioReajuste + ". Salário total = R$ " + salario);
        }
        in.close();
    }
    
}
