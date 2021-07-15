import java.util.Scanner;

public class Problema5 {
    public static void main(String[] args) {

        /*faca um progama que calcule e mostre o volume
        de uma esfera sendo fornecido o valor de seu 
        raio (R). a formula para calcular o volume eh:
        (4/3) * pi * R3. considere (atribua) para o pi
        o valor de 3.14159.

        dica: ao utilizar a formula procure usar 
        (4/3.0) ou (4.0/3) pois algumas linguagens
        assumem que o resultado da divisao entre
        dois inteiros eh outro inteiro. */

        // analise: sim!

        // o que nao eh necessario:

        //entradas: raio (R)
        
        //saidas: volume (vol)

        //processo: 
        // pi = 3.14159
        // volume = (4.0/3) * pi * r3

        //testes: 
        //  raio   |    volume
        //   5     |    523.6
        //   18    |    24429.02


        //algoritmo:

        Scanner entrada = new Scanner(System.in); 

        System.out.print("Digite o raio da esfera: ");
        int r = entrada.nextInt();

        double pi = 3.14159f;
        double volume = (4/3.0) * pi * Math.pow(r,3);

        System.out.println("O volume da esfera eh de: " + volume);
    

    }
    
}
