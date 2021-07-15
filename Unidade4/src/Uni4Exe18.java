import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        

        System.out.print("Digite o dia do vencimento: ");
        double diaVencimento = in.nextInt();
        System.out.print("Digite o dia do pagamento: ");
        double diaPagamento = in.nextInt();
        System.out.print("Digite o valor da prestação: ");
        double valor = in.nextDouble();


        if(diaPagamento <= diaVencimento){
            double desconto = valor * 0.10;
            valor -= desconto;
            System.out.println("O pagamento está em dia! Com o desconto de 10% o valor da prestação fica: R$ " + valor);
        }
        else if(diaPagamento <= (diaVencimento + 5)){
            System.out.println("Atraso de até cinco dias. Valor da prestação: R$ "+valor);
        }
        else{
            double multa = valor * 0.02 * (diaPagamento - diaVencimento);
            valor += multa;
            System.out.println("Atraso de mais de cinco dias. Valor com multa: R$ " +valor);
        }
        
    }
    
}
