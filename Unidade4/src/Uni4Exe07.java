import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        System.out.print("Insira o peso da carta em gramas: ");
        double peso = in.nextDouble();

        double custoSelo = 0.45;

        if (peso > 50) {
            double valorAMais = (peso - 50) * 0.0225; 
            custoSelo += valorAMais;
        }
        System.out.println("O custo do selo eh: R$ " + df.format(custoSelo));
    }
    
}
