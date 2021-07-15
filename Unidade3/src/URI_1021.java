import java.util.Scanner;

public class URI_1021 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valor = entrada.nextDouble();
        int notas = (int) valor;
        int moedas = (int) ((valor - notas) * 100);

        int d100, d50, d20, d10, d5, d2;
        
        d100 = (int) valor / 100;
        valor = valor % 100;
        d50 = (int) valor / 50;
        valor = valor % 50;
        d20 = (int) valor / 20;
        valor = valor % 20;
        d10 = (int) valor / 10;
        valor = valor % 10;
        d5 = (int) valor / 5;
        valor = valor % 5;
        d2 = (int) valor / 2;
        valor = valor % 2;

        int m01, m050, m025, m010, m005, m001;

        m01 = (int) valor;
        valor = m01 % 1;
        m050 = moedas / 50;
        moedas = moedas % 50;
        m025 = moedas / 25;
        moedas = moedas % 25;
        m010 = moedas / 10;
        moedas = moedas % 10;
        m005 = moedas / 5;
        moedas = moedas % 5;
        m001 = moedas;

        System.out.println("NOTAS:");
        System.out.println(d100 + " nota(s) de R$ 100.00");
        System.out.println(d50 + " nota(s) de R$ 50.00");
        System.out.println(d20  + " nota(s) de R$ 20.00");
        System.out.println(d10 + " nota(s) de R$ 10.00");
        System.out.println(d5 + " nota(s) de R$ 5.00");
        System.out.println(d2  + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println(m01 + " moeda(s) de R$ 1.00");
        System.out.println(m050 + " moeda(s) de R$ 0.50");
        System.out.println(m025  + " moeda(s) de R$ 0.25");
        System.out.println(m010+ " moeda(s) de R$ 0.10");
        System.out.println(m005 + " moeda(s) de R$ 0.05");
        System.out.println(m001  + " moeda(s) de R$ 0.01");
        
        

        entrada.close();
    }
    
}