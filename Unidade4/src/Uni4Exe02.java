import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        // Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.
        Scanner in = new Scanner(System.in);

        System.out.print("Insira um valor inteiro maior que 0: ");
        int valor = in.nextInt();

        boolean divisivelPor2 = valor % 2 == 0;

        if(divisivelPor2) {
            System.out.println("O valor eh par!");
        }

        else {
            System.out.println("O valor eh impar!");
        }
        

        in.close();
    }
    
}
