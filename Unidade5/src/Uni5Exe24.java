import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite o limite diário (em kg): ");
        double limite = in.nextDouble();
        System.out.print("Deseja informar o peso de mais um peixe: s(SIM) / n(NÃO)?");
        String confirmacao = in.next().trim();

        double pesoPeixe = 0, pesoTotalGramas = 0, pesoTotalKg = 0;

        while(!confirmacao.equalsIgnoreCase("n")){
            System.out.print("Digite o peso em gramas do peixe: ");
            pesoPeixe = in.nextInt();

            pesoTotalGramas += pesoPeixe;

            pesoTotalKg = pesoTotalGramas / 1000;

            System.out.print("O peso total de pesca obtido é de "+pesoTotalGramas+" gramas. \n");

            if(pesoTotalKg >= limite){
                System.out.print("O peso total alcançou o limite diário estabelecido. \n");
            }

            System.out.print("Deseja informar o peso de mais um peixe: s(SIM) / n(NÃO)?");
            confirmacao = in.next().trim();
        }

        in.close();
    }
}
