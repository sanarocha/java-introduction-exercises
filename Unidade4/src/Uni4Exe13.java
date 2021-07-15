import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Informe as 3 cartas");
        int carta1 = in.nextInt();
        int carta2 = in.nextInt();
        int carta3 = in.nextInt();

        int qtdCartasBoas = 0;

        //ele verifica carta por carta e adiciona na variavel caso o boolean for verdade, if por if
        if(carta1 == 1  || carta2 == 2  || carta1 == 3){
            qtdCartasBoas++; // qtdCartasBoas = qtdCartasBoas + 1
        }
        if(carta2 == 1  || carta2 == 2  || carta2 == 3){
            qtdCartasBoas++;
        }
        if(carta3 == 1  || carta3 == 2  || carta3 == 3){
            qtdCartasBoas++;
        }

        //verifica o numero de cartas boas!
        if(qtdCartasBoas == 1){
            System.out.println("TRUCO");
        } else{
            if(qtdCartasBoas == 2){
                System.out.println("SEIS");
            } else {
                if(qtdCartasBoas == 3){
                    System.out.println("NOVE");
                }
            }
        }
        in.close();
    }
    
}
