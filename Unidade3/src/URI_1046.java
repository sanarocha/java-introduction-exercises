import java.util.Scanner;

public class URI_1046 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int inicio = in.nextInt();
        int fim = in.nextInt();

        if(inicio > fim){
            int total = 24 - (inicio - fim);
            System.out.println("O JOGO DUROU "+total+" HORA(S)");
        }else if(fim > inicio){
            int total = fim - inicio;
            System.out.println("O JOGO DUROU "+total+" HORA(S)");
        }else{
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        in.close();

    }
    
}
