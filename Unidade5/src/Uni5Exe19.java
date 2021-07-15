import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double valorTotal = 0;

        System.out.print("Insira o valor da compra: ");
        double valorCompra = in.nextDouble();

        while(!(valorCompra == 0)){
            if(valorCompra > 500){
                double desconto = valorCompra * 0.2;
                valorCompra -= desconto;
                System.out.println("O valor a pagar pela compra é de R$ "+valorCompra);
                valorTotal += valorCompra;
            }
            else if(valorCompra <= 500){
                double desconto = valorCompra * 0.15;
                valorCompra -= desconto;
                System.out.println("O valor a pagar pela compra é de R$ "+valorCompra);
                valorTotal += valorCompra;
            }
        
            System.out.print("Insira o valor da compra: ");
            valorCompra = in.nextDouble();
        }
        System.out.println("O valor total recebido pela loja ao final do dia foi de R$ "+valorTotal);
        in.close();
    }
    
}
