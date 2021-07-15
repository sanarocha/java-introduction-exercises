import java.util.Scanner;

public class Uni6Exe02 {
    
    public Uni6Exe02() {
        float[] vetor = new float[12];

        float soma = lerValores(vetor);
        float media = calcularMedia(soma, vetor.length);

        maioresValores(vetor, media);
    }

    public float lerValores(float[] vetor){
        Scanner in = new Scanner(System.in);
        float soma = 0;

        for(int indice = 0; indice < vetor.length; indice++){
            System.out.print("Digite um valor real: ");
            vetor[indice] = in.nextFloat();
            soma += vetor[indice];
        }

        in.close();
        return soma;

    }

    public float calcularMedia(float soma, int tamanhoVetor){
        float media = soma / tamanhoVetor;
        System.out.println("Média: "+media);

        return media;
    }

    public void maioresValores(float[] vetor, float media){
        String maiores = "";
        for(int indice = 0; indice < vetor.length; indice++){
            if(vetor[indice] > media){
                maiores += vetor[indice] + "\n";
            }
        }

        System.out.print(maiores);
    }

    public static void main(String[] args) {
    new Uni6Exe02();
}
}
