import java.util.Scanner;

public class Uni6Exe10 {
    Scanner in;

    public Uni6Exe10() {
        in = new Scanner(System.in);
        int[] vetor = new int[50]; // mudar pra 50
        int total = 0;
        int menu = 0;

        do {
            System.out.print("Digite uma das opções: \n1 - Inserir valor\n2 - Pesquisar valor\n"
                    + "3 - Alterar valor\n4 - Excluir valor\n5 - Mostrar valores\n6 - Ordenar valores\n"
                    + "7 - Sair do sistema");
            menu = in.nextInt();

            switch (menu) {
                case 1:
                    if (inserir(vetor, total)) {
                        System.out.println("Valor inserido.");
                        total++;
                    } else {
                        System.out.println("Vetor está cheio.");
                    }
                    break;
                case 2:
                    pesquisar(vetor, total);
                    break;
                case 3:
                    alterar(vetor, total);
                    break;
                case 4:
                    total = excluir(vetor, total);
                    break;
                case 5:
                    mostrar(vetor, total);
                    break;
                case 6:
                    ordenar(vetor, total);
                    break;
                case 7:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Digite novamente.");
            }

        } while (menu != 7);

    }

    public boolean inserir(int[] vetor, int total) {
        System.out.print("Digite um valor para incluir no vetor: ");
        int numero = in.nextInt();

        if (total < 50) {
            vetor[total] = numero;
            return true;
        }
        return false;
    }

    public int pesquisar(int[] vetor, int total) {
        System.out.println("Digite um valor a ser pesquisado: ");
        int valor = in.nextInt();

        for (int posicao = 0; posicao < total; posicao++) {
            if (vetor[posicao] == valor) {
                System.out.println("Valor encontrado na posição " + posicao);
                return posicao;
            }
        }
        System.out.println("Valor não encontrado no vetor.");
        return -1;
    }

    public void mostrar(int[] vetor, int total) {
        for (int posicao = 0; posicao < total; posicao++) {
            System.out.print("[" + vetor[posicao] + "] ");
        }
    }

    public void alterar(int[] vetor, int total) {
        int indice = pesquisar(vetor, total);

        if (indice != -1) {
            System.out.print("Informe o novo valor para essa posição: ");
            int valor = in.nextInt();
            vetor[indice] = valor;
            System.out.println("O valor foi alterado");
        }
    }

    public int excluir(int[] vetor, int total) {
        int indice = pesquisar(vetor, total);

        if (indice > -1) {
            for (int i = indice; i < total; i++) {
                vetor[i] = vetor[i + 1];
            }
            total--;
            System.out.println("Número excluído com sucesso!");
        }
        return total;
    }

    public void ordenar(int[] vetor, int total){
        int valorAntes = 0;

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

    public static void main(String[] args) {
        new Uni6Exe10();
    }

}
