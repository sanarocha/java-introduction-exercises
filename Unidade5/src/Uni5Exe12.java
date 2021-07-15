import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Insira o número de linhas a serem impressas: ");
        int linhas = in.nextInt();
        int n = 0;

        for(int i = 1; i <= linhas; i++){
        
            for(int x = 1; x <= i; x++){
                System.out.print(" " + n);
                n++;
            }
            System.out.println("");
        }
        
        in.close();
    }
    
}
