import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o quantidade de números inteiros a ser inserida: ");
        int quantidadeNums = in.nextInt();
        int num = 0;
        int maior = 0;
        int menor = 999999999;

        for(int i = 1; i <= quantidadeNums; i++){
            System.out.print("Digite um número inteiro: ");
            num = in.nextInt();
        
            if(num > maior){
                maior = num;
            }if(num < menor){
                menor = num;
            }
        }
        System.out.println("O menor número inserido foi "+menor);
        System.out.println("O maior número inserido foi "+maior);

        in.close();
    }
    
}
