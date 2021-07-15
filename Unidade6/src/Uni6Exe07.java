import java.util.Scanner;

public class Uni6Exe07 {
    Scanner in;

    public Uni6Exe07() {
        in = new Scanner(System.in);

        System.out.print("Digite um valor inteiro menor ou igual a 20: ");
        int n = in.nextInt();
        int total = 0;

        while (n > 20) {
            System.out.println("Valor inválido!");
            System.out.print("Digite um valor inteiro menor ou igual a 20: ");
            n = in.nextInt();
        }
        int[] vetor = new int[n];

        total = inserirValores(vetor, total);
        ordenarVetor(vetor, total);
        informarVetor(vetor, total);

        in.close();
    }

    public int inserirValores(int[] vetor, int total) {
        boolean repetido = false;
        int cont = 0;
        int numero = 0;

        while(cont < vetor.length){
            System.out.print("Digite um número para inserir no vetor: ");
            numero = in.nextInt();
            
            for(int i = 0; i < vetor.length; i++){
                if(vetor[i] == numero){
                    repetido = true;
                    break;
                }else {
                    repetido = false;
                }
            }
            if(!repetido){
                System.out.println("O número foi inserido com sucesso!");
                vetor[cont] = numero;
                total++;
                cont++;
            }else{
                System.out.println("Esse número já existe no vetor! Não foi possível inserí-lo.");
            }
        }
        return total;
    }

    public void ordenarVetor(int[] vetor, int total) {
        int valorAntes = 0;

        System.out.print("Vetor origem: ");
        for (int i = 0; i < total; i++) {
            System.out.print("[" + vetor[i] + "] ");
        }
        for(int i = 0; i < total; i++){
            int posicao = (i + 1);
            for(int x = posicao; x <= (total - 1); x++){
                if(vetor[i] > vetor[posicao]){
                    valorAntes = vetor[i];
                    vetor[i] = vetor[posicao];
                    vetor[posicao] = valorAntes;
                }
                posicao++;
            }
        }
    }

    public void informarVetor(int[]vetor, int total) {
        System.out.print("Vetor ordenado: ");
        for (int posicao = 0; posicao < total; posicao++) {
            System.out.print("[" + vetor[posicao] + "] ");
        }
    }

    public static void main(String[] args) {
        new Uni6Exe07();
    }

}
