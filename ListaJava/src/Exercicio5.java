import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //entradas: numero de frangos
        //saida: gasto total

        System.out.print("Insira o numero de frangos: ");
        int numeroFrangos = input.nextInt();
        double calculo = numeroFrangos * (4  + 3.5 + 3.5);
        System.out.println("O gasto total para marcar o(s) frango(s) eh de R$ " + calculo);

        input.close();

        
    }
    
}
