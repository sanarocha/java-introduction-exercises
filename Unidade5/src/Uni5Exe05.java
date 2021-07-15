import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numero = 8;
        int numero1 = 0;


        System.out.print("Insira o número de termos que deseja ver da sequência: ");
        int n = in.nextInt();

        if(n > 2){
            for(int cont = 0; cont < n; cont++){
                System.out.println(numero);
                if(cont % 2 == 0){
                    numero1 = numero;
                    numero += 2;
                }else {
                    numero = numero1 * 2;
                }
            }
        }else{
            System.out.println("O valor deve ser maior que 2");
        }
        in.close();
    }
    
}
