import java.util.Scanner;

public class RossanaRochaDaSilva_2 {
    private RossanaRochaDaSilva_2() {
        Scanner in = new Scanner(System.in);

        final int vetorTamanho = 9;
        int vetor1[] = new int[vetorTamanho];
        int vetor2[] = new int[vetorTamanho];
        int vetorSoma[] = new int[vetorTamanho];

        vetorLer(vetor1, vetor2, in);
        vetorSomaCruzada(vetor1, vetor2, vetorSoma, vetorTamanho);
        vetorEscrever(vetorSoma);

        in.close();
    }

    private void vetorLer(int[] vetor1, int[] vetor2, Scanner in) {
        System.out.println("__ Leitura do Vetor1 __");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print("Vetor1[" + i + "]: ");
            vetor1[i] = in.nextInt();
        }

        System.out.println("__ Leitura do Vetor2 __");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print("Vetor2[" + i + "]: ");
            vetor2[i] = in.nextInt();
        }
    }

    private void vetorSomaCruzada(int[] vetor1, int[] vetor2, int[] vetorSoma, int vetorTamanho) {

        int[] vetorSomaInvertida = new int[vetorTamanho];

        for (int j = 0; j < vetorTamanho; j++) {
            vetorSoma[j] += vetor1[j];
        }

        for (int i = vetorTamanho - 1; i >= 0; i--) {
            vetorSomaInvertida[i] += vetor2[i];
        }

        for (int j = 0; j < vetorTamanho ; j++) {
            for (int i = 0; i < vetorTamanho; i++) {
                vetorSoma[i] = vetorSomaInvertida[j] + 1;
            }
        }
    }

    public void vetorEscrever(int[] vetorSoma) {
        System.out.println("__ Resultado da Soma __");
        for (int i = 0; i < vetorSoma.length; i++) {
            System.out.println("VetorSoma[" + i + "]: " + vetorSoma[i]);
        }
    }

    public static void main(String[] args) {
        new RossanaRochaDaSilva_2();
    }
}