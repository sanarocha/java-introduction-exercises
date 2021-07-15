import java.io.PrintStream;
import java.util.Scanner;

public class Uni4Exe11 {
    private static final PrintStream OUT = System.out;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int irmao1, irmao2, irmao3, idadeIrmao1, idadeIrmao2, idadeIrmao3;

        OUT.print("Digite o ano de nascimento do primeiro irmão: ");
        irmao1 = in.nextInt();
        OUT.print("Digite o ano de nascimento do segundo irmão: ");
        irmao2 = in.nextInt();
        OUT.print("Digite o ano de nascimento do terceiro irmão: ");
        irmao3 = in.nextInt();

        idadeIrmao1 = irmao1 - 2021;
        idadeIrmao2 = irmao2 - 2021;
        idadeIrmao3 = irmao3 - 2021;
        
        if(idadeIrmao1 == idadeIrmao2 && idadeIrmao1 == idadeIrmao3 && idadeIrmao2 == idadeIrmao3) {
            OUT.println("Os irmãos são trigêmeos.");
        }
        else if (idadeIrmao1 == idadeIrmao2 || idadeIrmao1 == idadeIrmao3 || idadeIrmao2 == idadeIrmao3){
            OUT.println("Dois dos irmãos são gêmeos.");
        }
        else {
            OUT.println("Apenas irmãos.");
        }
        
    }
    
}
