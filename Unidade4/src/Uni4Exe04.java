import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        //Dado um número de ponto flutuante maior do que 0, 
        //informe se foram digitadas ou não casas decimais no número.
        Scanner in = new Scanner(System.in);
        
        System.out.print("Insira um valor maior que 0: ");
        double valor = in.nextFloat();

        String numeroS = String.valueOf(valor);
        int posicaoPonto = numeroS.indexOf(".");
        String parteDecimal = numeroS.substring(posicaoPonto, numeroS.length());

        if(!parteDecimal.equals(".0")) {
            System.out.println("O numero tem casas decimais.");
        }
        else {
            System.out.println("O numero nao tem casas decimais.");
        }
        in.close();
    }
    
}
