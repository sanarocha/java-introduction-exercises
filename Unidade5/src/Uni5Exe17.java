import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int numInscricao = 0, altura = 0, numInscricaoAlto = 0, alturaAlto = 0, numInscricaoBaixo = 0, alturaBaixo = 0;
        int alturaTotal = 0, media = 0, atletas = 0, alturaMaior = 0, alturaMenor = 9999999;

        System.out.print("Insira o número de inscrição: ");
        numInscricao = in.nextInt();

        while(!(numInscricao == 0)){
            System.out.print("Insira a altura em cm: ");
            altura = in.nextInt();

            alturaMenor += altura;
            alturaMaior += altura;
            
            if(altura <= alturaMenor){
                alturaAlto = altura;
                numInscricaoAlto = numInscricao;

                alturaTotal += altura;
                atletas++;
            }
            if(altura >= alturaMaior){
                alturaBaixo = altura;
                numInscricaoBaixo = numInscricao;

                alturaTotal += altura;
                atletas++;
            }
            media = alturaTotal / atletas;

            System.out.print("Insira o número de inscrição: ");
            numInscricao = in.nextInt();

        }
        System.out.println("O atleta do num. de inscrição "+numInscricaoAlto+" e altura de "+alturaAlto+" cm é o mais alto.");
        System.out.println("O atleta do num. de inscrição "+numInscricaoBaixo+" e altura de "+alturaBaixo+" cm é o mais baixo.");
        System.out.println("A média de alturas é: "+media);

        in.close();
    }
    
}
