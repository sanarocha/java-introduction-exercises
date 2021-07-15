import java.util.Scanner;

public class Uni6Exe06 {
    public Uni6Exe06(){
        Scanner in = new Scanner(System.in);
        System.out.print("Informe um valor N inteiro: ");
        int n = in.nextInt();
        double[] vetor = new double[n];

        lerVetor(vetor);
        boolean valorVetor = encontrarValor(vetor);

        if(valorVetor){
            System.out.println("O valor inserido está no vetor!");
        }else{
            System.out.println("O valor inserido não está no vetor!");
        }
    }

    public void lerVetor(double[] vetor){
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Informe um valor real: ");
            vetor[i] = in.nextDouble();
        }
    }

    public boolean encontrarValor(double[] vetor){
        Scanner in = new Scanner(System.in);

        System.out.print("Informe outro valor real: ");
        float valorX = in.nextFloat();

        in.close();

        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] == valorX){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        new Uni6Exe06();
    }
}
