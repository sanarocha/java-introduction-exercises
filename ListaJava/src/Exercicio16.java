import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insira o valor da compra: ");
        int valorCompra = input.nextInt();
        System.out.print("Insira o valor recebido: ");
        int valorRecebido = input.nextInt();

        int trocoTotal = valorRecebido - valorCompra;
        int troco = trocoTotal;
        int troco100 = troco / 100;
        troco = troco % 100;
        int troco10 = troco / 10;
        troco = troco % 10;
        int troco1 = troco;

        System.out.println("Valor da compra: R$ " + valorCompra);
        System.out.println("Valor recebido: R$ " + valorRecebido);
        System.out.println("Troco: R$ " + trocoTotal);
        System.out.println("Notas de R$100 necessarias para o troco: " + troco100);
        System.out.println("Notas de R$10 necessarias para o troco: "+ troco10);
        System.out.println("Notas de R$1 necessarias para o troco: " + troco);

        input.close();
    }
    
}
