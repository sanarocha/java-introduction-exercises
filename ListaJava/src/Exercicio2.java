import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira o preço do par de sapatos em R$: ");
        double valor = entrada.nextDouble();
        double valorDesconto, valorTotal;

        valorDesconto = (valor * 12) / 100;
        valorTotal = valor - valorDesconto;

        System.out.println("O valor do desconto é de R$ " + valorDesconto);
        System.out.println("O preço do par de sapatos com desconto é R$ " + valorTotal);

        entrada.close();
    }
    
}
