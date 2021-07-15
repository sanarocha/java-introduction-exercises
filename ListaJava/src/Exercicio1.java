import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //entradas: dimensoes terreno
        //saidas: area

        System.out.println("Insira a medida da base do terreno: ");
        double base = entrada.nextDouble();
        System.out.println("Insira a medida da altura do terreno: ");
        double altura = entrada.nextDouble();

        double area = base * altura;
        System.out.println("A area total do terreno eh: " + area);

        entrada.close();

    }
    
}
