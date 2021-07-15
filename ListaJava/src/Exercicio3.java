import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        //entrada: preco do litro da gasolina, valor gasto em litros
        //saida: quantos litros foram colocados

        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("Insira o preco do litro da gasolina em R$: ");
        double precoGasolina = entrada.nextDouble();
        System.out.print("Insira a quantia em R$ paga: ");
        double quantiaPaga = entrada.nextDouble();

        double valorTotal = quantiaPaga / precoGasolina;

        System.out.println("Foram colocados " + df.format(valorTotal) + " litros.");

        entrada.close();
        
    }
    
}
