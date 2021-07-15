import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        //entradas: peso prato cliente (em kg)
        //saida: valor total - 750g 
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o peso do prato montado em kg (exemplo de formato: 1.560; 0,345): ");
        double pratoCliente = input.nextDouble() - 0.75;
        double valorTotal = pratoCliente * 25;

        System.out.println("O valor a pagar eh R$: " + valorTotal);

        input.close();

}
}
