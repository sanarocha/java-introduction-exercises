import java.util.Scanner;

public class Uni5Exe15 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = s.next();

        while(!nome.equalsIgnoreCase("Fim")){
            
        System.out.print("Digite a nota 1: ");
        float n1 = s.nextFloat();
        System.out.print("Digite a nota 2: ");
        float n2 = s.nextFloat();

        float media = (n1+n2)/2;
        System.out.println("A média do aluno " +nome+" é "+media);

        System.out.print("Digite o nome do aluno: ");
        nome = s.next();

        }

        s.close();

    }
    
}
