import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite a opção desejada:\n");
        System.out.print("(1) encerrar a conta do hóspede\n");
        System.out.print("(2) verificar número de contas encerradas\n");
        System.out.print("(3) sair");
        int opcao = in.nextInt();

        int contas = 0;
        String nomeHospede = "";
        double diarias = 0, valor = 0;

        do{
            switch(opcao){
                case 1: 
                contas++;
                System.out.print("Digite o nome do hóspede: ");
                nomeHospede = in.next();
                System.out.print("Digite o número de diárias: ");
                diarias = in.nextInt();
                if(diarias < 15){
                    valor = diarias * 7.50;
                }else if(diarias == 15){
                    valor = diarias * 6.50;
                }else if(diarias > 15){
                    valor = diarias * 5;
                }
                System.out.println("O hóspede "+nomeHospede+" deve pagar R$ "+valor+" pela sua estadia.");
                break;
                case 2: System.out.println("O total de contas fechadas é de: "+contas);
                break;
                default: System.out.println("Opção inválida");
            }
            System.out.print("Digite a opção desejada:\n");
            System.out.print("(1) encerrar a conta do hóspede\n");
            System.out.print("(2) verificar número de contas encerradas\n");
            System.out.print("(3) sair");
            opcao = in.nextInt();

        }while(opcao != 3);
        in.close();
    }
    
}
