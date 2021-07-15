import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int confirmacao = 0, dia = 0, pecasManha = 0, pecasTarde = 0;
        double valorRecebido = 0, valorRecebidoManha = 0, valorRecebidoTarde = 0;

        System.out.print("Novo funcionário (1.sim 2.não)?");
        confirmacao = in.nextInt();

        while(!(confirmacao == 2)){
        System.out.print("Digite o dia do mês: ");
        dia = in.nextInt();

        if(dia >= 1 && dia <= 30){
            System.out.print("Digite o total de peças produzidas no turno da manhã: ");
            pecasManha = in.nextInt();
            System.out.print("Digite o total de peças produzidas no turno da tarde: ");
            pecasTarde = in.nextInt();

            if(dia >= 1 && dia <= 15){
                int totalPecas = pecasManha + pecasTarde;
                if(totalPecas > 100 && pecasManha > 30 && pecasTarde > 30){
                    valorRecebido = totalPecas * 0.80;
                }else{
                    valorRecebido = totalPecas * 0.50;
                }
            }else if(dia >= 16 && dia <= 30){
                valorRecebidoManha = pecasManha * 0.40;
                valorRecebidoTarde = pecasTarde * 0.30;
                valorRecebido = valorRecebidoTarde + valorRecebidoManha;
            }
            
        }else {
            System.out.print("Dia inválido \n");
        }

        System.out.print("Valor recebido: R$ "+valorRecebido+"\n");

        System.out.print("Novo funcionário (1.sim 2.não)?");
        confirmacao = in.nextInt();
        }

     in.close();   
    }
    
}
