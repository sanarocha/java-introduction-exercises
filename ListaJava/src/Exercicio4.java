import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);

        System.out.print("Insira a nota da primeira prova: ");
        double nota1 = notas.nextDouble() * 5;
        System.out.print("Insira a nota da segunda prova: ");
        double nota2 = notas.nextDouble() * 3;
        System.out.print("Insira a nota da terceira prova: ");
        double nota3 = notas.nextDouble() * 2;

        double mediaFinal = nota1 + nota2 + nota3 / 9;
        System.out.println("A media ponderada eh: " + mediaFinal);

        notas.close();

    }
    
}
