import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        String caractere = in.next();
        caractere = caractere.toUpperCase();
        caractere = caractere.trim(); //remove espaço das bordas

        char primeiraLetra = caractere.charAt(0);

        if(primeiraLetra == 'F') {
            System.out.println("Feminino");
        }
        else if (primeiraLetra == 'M') {
            System.out.println("Masculino");
        }
        else if (primeiraLetra == 'I') {
            System.out.println("Nao Informado");
        }
        else {
            System.out.println("Entrada Incorreta");
        }
        in.close();
    }
    
}
