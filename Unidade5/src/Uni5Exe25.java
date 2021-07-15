import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o código do ponto (D ou E): ");
        String codigoPonto = in.next().trim();
        int quantPontos = 1;

        int pontosD = 0, pontosE = 0;


        while(!(quantPontos >= 21)){

            if(codigoPonto.equalsIgnoreCase("d")){
                pontosD++;
            }
            if(codigoPonto.equalsIgnoreCase("e")){
                pontosE++;
            }

            if((pontosE == 21)  ||  (pontosE >= 21) && (pontosE - pontosD >= 2)){
                System.out.println("O jogador do lado esquedo é o vencedor.");
            }
            else if((pontosD == 21) ||  (pontosD >= 21) && (pontosD - pontosE >= 2)){
                System.out.println("O jogador do lado direito é o vencedor.");
            }

            System.out.print("Digite o código do ponto (D ou E): ");
            codigoPonto = in.next().trim().toLowerCase();
            quantPontos++;
        }

        in.close();
    }
 
}
