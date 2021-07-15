import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a idade de Marquinhos: ");
        int marquinhos = in.nextInt();
        System.out.print("Digite a idade de Zezinho: ");
        int zezinho = in.nextInt();
        System.out.print("Digite a idade de Luluzinha: ");
        int luluzinha = in.nextInt();

        if(marquinhos < zezinho && marquinhos < luluzinha) {
            System.out.println("Marquinhos é o irmão caçula.");
        }
        else if (zezinho < marquinhos && zezinho < luluzinha){
            System.out.println("Zezinho é o irmão caçula.");
        }
        else if(luluzinha < zezinho && luluzinha < marquinhos){
            System.out.println("Luluzinha é a irmã caçula.");
        }

    }
    
}
