import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        int tempoGasto = input.nextInt();
        int velocidadeMedia = input.nextInt();

        double distancia = tempoGasto * velocidadeMedia;
        double quantidadeLitros = distancia / 12;

        System.out.println(df.format(quantidadeLitros));

        input.close();
         
    }
    
}
