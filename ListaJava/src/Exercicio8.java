import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Insira o valor entregue em $ ");
        double dolares = input.nextDouble();
        System.out.print("Insira o valor da cotacao do dolar: ");
        double cotacao = input.nextDouble();

        double reais = dolares * cotacao;
        System.out.println("O valor que deve ser entregue eh de R$ " + reais);

        input.close();

    }
    
}
