import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        double x = in.nextDouble();
        System.out.print("Digite o segundo número: ");
        double y = in.nextDouble();
        System.out.println("Escolha uma opção: \n "+
        "1 - Soma de dois números \n" +
        "2 - Diferença entre dois números \n" +
        "3 - Produto entre dois números \n" +
        "4 - Divisão ente dois números");
        int opcao = in.nextInt();

        switch(opcao){
            case 1: 
            double soma = x + y;
            System.out.println("A soma dos dois números é: " +soma);
            break;
            case 2:
            double diferenca = x - y;
            System.out.println("A diferença entre os dois números é de: " +diferenca);
            break;
            case 3:
            double multiplicacao = x * y;
            System.out.println("O produto entre os dois números é: " +multiplicacao);
            break;
            case 4:
            double divisao = x / y;
            System.out.println("A divisão entre dos dois números é: "+divisao);
            break;
            default: System.out.println("Opção inválida.");
        }
    }
    
}
