import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        /* Implemente o problema da mochila. Tendo-se uma sequência decrescente de 
        números inteiros positivos que inicia em N, com decremento inteiro positivo K, 
        deseja-se empacotá-los em uma mochila com tamanho M, de forma que se coloque dentro
         dela preferencialmente os maiores valores, até que ela esteja cheia. N e K são inteiros
          e devem ser definidos pelo usuário. Faça um algoritmo que imprima:

         os elementos a serem colocados na mochila;
         os elementos que entraram na mochila;
         os que ficaram fora da mochila;
         qual é a soma dos elementos que entraram na mochila;
         qual a soma dos elementos que não entraram na mochila.*/

        int colocadosMochila = 0, entraramMochila = 0, foraMochila = 0, somaEntraramMochila = 0, somaForaMochila = 0;

        System.out.print("Informe o valor N: "); //primeiro numero da sequencia
        int n = in.nextInt();
        colocadosMochila += n;
        System.out.print("Informe o valor K: "); //numero que vai ir diminuido a sequencia
        int k = in.nextInt();
        System.out.print("Informe o tamanho da mochila: ");
        int m = in.nextInt();

        while(n > k){
            if(m > n){
                entraramMochila += n;
                m -= n;
                n -= k;
            }else {
                foraMochila += n;
            }
        }

        System.out.println("Os elementos a serem colocados na mochila: "+colocadosMochila);
        System.out.println("")

        
    }
    
}
