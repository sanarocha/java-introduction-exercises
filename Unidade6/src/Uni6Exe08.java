import java.util.Scanner;

public class Uni6Exe08 {
    Scanner in;

    public Uni6Exe08() {
        in = new Scanner(System.in);

        System.out.print("Insira um valor inteiro menor ou igual a 20: ");
        int n = in.nextInt();
        int total = 0;

        while(n > 20) {
            System.out.println("Valor inválido");
            System.out.print("Insira um valor inteiro menor ou igual a 20: ");
            n = in.nextInt();
        }
        double[] vetor = new double[n];

        total = lerVetor(vetor, total);
        imprimirTabela(vetor);

        in.close();
    }

    public int lerVetor(double[] vetor, int total) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Informe um valor real: ");
            vetor[i] = in.nextDouble();
            total++;
        }
        return total;
    }

    public void imprimirTabela(double[] vetor) {
        int cont = 0;
        double[]repetidos = new double[vetor.length];

        for (int i = 0; i < vetor.length; i++) {
            cont = 1;
            boolean existe = false;
                for (int k = 0; k < repetidos.length; k++) {
                    if (repetidos[k] == vetor[i]) {
                        existe = true;
                        break;
                    }
                }
                if(!existe){
                    for(int j = 0; j < vetor.length; j++){
                        if(i != j){
                            if(vetor[i] == vetor[j]){
                                cont++;
                                repetidos[i] = vetor[i];
                            }
                        }
                    }
                }
            
            if(cont > 1){
                System.out.println("Valor: " + repetidos[i] + " Frequencia: " + cont);
            }  
        }
    }
    public static void main(String[] args) {
        new Uni6Exe08();
    }
}
