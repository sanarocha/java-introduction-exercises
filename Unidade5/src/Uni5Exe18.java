import java.util.Scanner;

public class Uni5Exe18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantidadeCanal4 = 0, quantidadeCanal5 = 0, quantidadeCanal9 = 0, quantidadeCanal12 = 0, quantTotalPessoas = 0, totalDeCanais = 0;
        int pc4 = 0, pc5 = 0, pc9 = 0, pc12 = 0;

        System.out.print("Digite o canal (4, 5, 9, 12): "); //4, 5, 9, 12
        int canal = in.nextInt();
        System.out.print("Digite a quantidade de pessoas: ");
        int quantPessoas = in.nextInt();

        while(!(canal == 0)){
            totalDeCanais++;
            if(canal == 4){
                quantidadeCanal4 += quantPessoas;
                quantTotalPessoas += quantPessoas;
            }else if(canal == 5){
                quantidadeCanal5 += quantPessoas;
                quantTotalPessoas += quantPessoas;
            }else if(canal == 9){
                quantidadeCanal9 += quantPessoas;
                quantTotalPessoas += quantPessoas;
            }else if(canal == 12){
                quantidadeCanal12 += quantPessoas;
                quantTotalPessoas += quantPessoas;
            }

            System.out.print("Digite o canal (4, 5, 9, 12): "); 
            canal = in.nextInt();
            System.out.print("Digite a quantidade de pessoas: ");
            quantPessoas = in.nextInt();
        }
        pc4 = ((quantidadeCanal4 * 100)/quantTotalPessoas);
        pc5 =  ((quantidadeCanal5 * 100)/quantTotalPessoas);
        pc9 = ((quantidadeCanal9 * 100)/quantTotalPessoas);
        pc12 = ((quantidadeCanal12 * 100)/quantTotalPessoas);
        
        System.out.println("Porcentagem de audiência do canal 4: "+pc4+"%");
        System.out.println("Porcentagem de audiência do canal 5: "+pc5+"%");
        System.out.println("Porcentagem de audiência do canal 9: "+pc9+"%");
        System.out.println("Porcentagem de audiência do canal 12: "+pc12+"%");

        in.close();
    }
    
}