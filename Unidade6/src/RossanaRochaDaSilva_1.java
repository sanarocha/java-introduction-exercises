import java.util.Scanner;

public class RossanaRochaDaSilva_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao, totalContas = 0;
        String nomeHospede = "";
        double diarias = 0, valorTotalDiarias = 0;

        System.out.println("_________ Controle de Hóspedes _________");
        System.out.println("Digite a opção desejada: \n1. encerrar a conta do hóspede \n2. verificar número de contas encerradas \n3. sair");
        System.out.print("__ opção: ");
        opcao = in.nextInt();

        do {
            switch (opcao) {
                case 1:
                totalContas++;
                System.out.println("_ Hóspede _");
                System.out.print("nome: ");
                nomeHospede = in.next();
                System.out.print("diárias: ");
                diarias = in.nextDouble();
                System.out.println("____________");

                if(diarias > 5){
                    valorTotalDiarias = (diarias * 75) + 10;
                }else if(diarias == 5){
                    valorTotalDiarias = (diarias * 75) + 12.50;
                }else if(diarias < 5){
                    valorTotalDiarias = (diarias * 75) + 14.50;
                }

                System.out.println("Nome: "+nomeHospede);
                System.out.println("Total: "+valorTotalDiarias);
                    break;
                case 2: 
                System.out.println("_ Número de contas encerradas: "+totalContas);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("opção errada!");
            }

            System.out.println("_________ Controle de Hóspedes _________");
            System.out.println("Digite a opção desejada: \n1. encerrar a conta do hóspede \n2. verificar número de contas encerradas \n3. sair");
            System.out.print("__ opção: ");
            opcao = in.nextInt();

        } while (opcao != 3);

        in.close();
    }
}