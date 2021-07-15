import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        for(int quant = 0; quant < 20; quant++){
            System.out.println("Digite um número: ");
            int num = in.nextInt();

            if(num % 2 == 0){
                System.out.println("número par");
            }else {
                System.out.println("número ímpar");
            }
        }
        in.close();
    
}
}
