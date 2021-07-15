import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat ("0.00");
        
        System.out.print("Insira o gênero (M ou F): ");
        String genero = in.next().trim().toLowerCase();
        System.out.print("Insira a altura em cm: ");
        double altura = in.nextDouble();

        double totalAlturaM = 0, mediaAlturaM = 0, totalAlturaH = 0, mediaAlturaH = 0, mediaAlturaTotal = 0;
        int totalHomens = 0, totalMulheres = 0;

        while(!(altura == 0)){
            if(genero.equalsIgnoreCase("F")){
                totalMulheres++;
                totalAlturaM += altura;
                mediaAlturaM = totalAlturaM / totalMulheres;
            }
            if(genero.equalsIgnoreCase("M")){
                totalHomens++;
                totalAlturaH += altura;
                mediaAlturaH = totalAlturaH / totalHomens;
            }
            mediaAlturaTotal = mediaAlturaH + mediaAlturaM;

            System.out.print("Insira o gênero (M ou F): ");
            genero = in.next().trim().toLowerCase();
            System.out.print("Insira a altura em cm: ");
            altura = in.nextDouble();

        }
        System.out.println("A média de altura das mulheres é: "+df.format(mediaAlturaM));
        System.out.println("A média de altura total do grupo é: "+df.format(mediaAlturaTotal));

        in.close();
    }
    
}
