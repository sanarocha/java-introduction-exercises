import java.util.Scanner;

public class Uni6Exe04 {
    public Uni6Exe04(){
        int[] vetor1 = new int[3];
        int[] vetor2 = new int[3];
        int[] vetor3 = new int[3];

        lerVetores(vetor1, vetor2);
        somarVetores(vetor1, vetor2, vetor3);
        escreverVetores(vetor1, vetor2, vetor3);
    }

    public void lerVetores(int[] vetor1, int[] vetor2){
        Scanner in = new Scanner(System.in);
        for(int  i = 0; i < vetor1.length; i++){
            System.out.print("Digite um valor inteiro do primeiro vetor: ");
            vetor1[i] = in.nextInt();
        }
        for(int  i = 0; i < vetor2.length; i++){
            System.out.print("Digite um valor inteiro do segundo vetor: ");
            vetor2[i] = in.nextInt();
        }
        in.close();
    }

    public void somarVetores(int[] vetor1, int[] vetor2, int[] vetor3){
        for(int i = 0; i < vetor3.length; i++){
            vetor3[i] += vetor1[i] + vetor2[i];
        }
    }

    public void escreverVetores(int[] vetor1, int[] vetor2, int[] vetor3){
        System.out.println("Vetor 1: ");
        for(int i = 0; i < vetor3.length; i++){
        System.out.println(vetor1[i]+" ");
    }
    System.out.println("Vetor 2: ");
    for(int i = 0; i < vetor3.length; i++){
        System.out.println(vetor2[i]+" ");
    }
    System.out.println("Vetor 3: ");
    for(int i = 0; i < vetor3.length; i++){
        System.out.println(vetor3[i]+" ");
    }
    }

    public static void main(String[] args) {
        new Uni6Exe04();
    }
    
}
