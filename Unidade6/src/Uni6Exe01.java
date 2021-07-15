import java.util.Scanner;
public class Uni6Exe01 {
    public Uni6Exe01(){
        int [] vetor = new int[10];

        lerValores(vetor);
        escreverValores(vetor);
    }

    public void lerValores(int[] vetor){
        Scanner in = new Scanner(System.in);

        for(int indice = 0; indice < 10; indice++){
            System.out.print("Digite um número: ");
            vetor[indice] = in.nextInt();
        }

        in.close();
    }

    public void escreverValores(int[] vetor){
        for(int indiceInverso = vetor.length - 1; indiceInverso >= 0; indiceInverso--){
            System.out.println("Vetor["+indiceInverso+"]: "+vetor[indiceInverso]);
        }
    }
    public static void main(String[] args) {
      new Uni6Exe01();
    }
    

}
