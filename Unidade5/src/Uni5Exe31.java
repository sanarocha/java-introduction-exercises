import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = in.nextInt();

        int x = 2;

        while(n > 1){
            if(n % x == 0){
                System.out.println(n+"  "+x);
                n = n / x;
            }else{
                x++;
            }
        }
        in.close();
    }
    
}
