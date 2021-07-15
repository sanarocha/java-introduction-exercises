import java.util.Scanner;

public class URI_1018 {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);

        int valorInteiro = valor.nextInt();

        System.out.println(valorInteiro);
        System.out.println(valorInteiro / 100 + " nota(s) de R$ 100,00");
        valorInteiro = valorInteiro % 100;

        System.out.println(valorInteiro / 50 + " nota(s) de R$ 50,00");
        valorInteiro = valorInteiro % 50;

        System.out.println(valorInteiro / 20  + " nota(s) de R$ 20,00");
        valorInteiro = valorInteiro % 20;

        System.out.println(valorInteiro / 10 + " nota(s) de R$ 10,00");
        valorInteiro = valorInteiro % 10;

        System.out.println(valorInteiro / 5  + " nota(s) de R$ 5,00");
        valorInteiro = valorInteiro % 5;
        
        System.out.println(valorInteiro / 2  + " nota(s) de R$ 2,00");
        valorInteiro = valorInteiro % 2;
        System.out.println(valorInteiro / 1  + " nota(s) de R$ 1,00");

        valor.close();
    }
    
}
