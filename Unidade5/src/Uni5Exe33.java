import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int voto = 0, voto1 = 0, voto2 = 0, voto3 = 0, voto4 = 0, votoNulo = 0, votoBranco = 0;

        do {
            System.out.print("Digite sua opção de voto (1 a 4, 5 - nulo, 6 - branco, 0 - sair): ");
            voto = in.nextInt();
            
            switch(voto){
                case 1: voto1++;
                break;
                case 2: voto2++;
                break;
                case 3: voto3++;
                break;
                case 4: voto4++;
                break;
                case 5: votoNulo++;
                break;
                case 6: votoBranco++;
                break;
                case 0: break;
                default: System.out.println("opção incorreta");
            }
        } while (voto != 0);

        System.out.println("Total de votos para candidato 1: "+voto1);
        System.out.println("Total de votos para candidato 2: "+voto2);
        System.out.println("Total de votos para candidato 3: "+voto3);
        System.out.println("Total de votos para candidato 4: "+voto4);

        System.out.println("Total de votos nulos: "+votoNulo);
        System.out.println("Total de votos em branco: "+votoBranco);

        int total = voto1 + voto2 + voto3 + voto4 + votoNulo + votoBranco;
        float percentualBranco = (votoBranco * 100f) / total;
        System.out.println("O percentual de votos em branco: "+percentualBranco+"%");

        float percentualNulo = (votoNulo * 100f) / total;
        System.out.println("O percentual de votos nulos: "+percentualNulo+"%");


        in.close();
    }
    
}
