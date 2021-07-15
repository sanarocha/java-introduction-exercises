import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o número de números inteiros a serem digitados: ");
        int quantNumsInt = in.nextInt();
        
        int totalPositivos = 0;
        double numeroMenor = 0;
        double positivo = 0;

        for(int cont = 0; cont <= quantNumsInt - 1; cont++){
            System.out.print("Digite um número inteiro: ");
            int numero = in.nextInt();

            if(numero <= 0 && numero < numeroMenor){
                numeroMenor = numero;
            }

            if(numero > 0){
                totalPositivos += numero;
                positivo++;
            }

        }
       System.out.println("Menor número negativo é " + numeroMenor);
       System.out.println("Média é dos números positivos é " + totalPositivos / positivo++);
       in.close();
    }
    
}
