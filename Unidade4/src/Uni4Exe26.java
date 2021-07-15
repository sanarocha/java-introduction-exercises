import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Escreva um caractere (T, Q, R ou C): ");
        String caractere = in.next().trim().toUpperCase();

        double base, altura, area, raio, lado;
       

        switch(caractere){
            case "T": 
            System.out.print("Digite a base do triângulo: ");
            base = in.nextInt();
            System.out.print("Digite a altura do triângulo: ");
            altura = in.nextInt();
            area = (base * altura) / 2;
            System.out.println("A área do triângulo é "+area);
            break;
            case "Q":
            System.out.print("Digite o comprimento do lado do quadrado: ");
            lado = in.nextInt();
            area = lado * lado;
            System.out.println("A área do quadrado é: "+area);
            break;
            case "R":
            System.out.print("Digite o comprimento da base do retângulo: ");
            base = in.nextInt();
            System.out.print("Digite o comprimento da altura do retângulo: ");
            altura = in.nextInt();
            area = base * altura;
            System.out.println("A área do retângulo é: "+area);
            break;
            case "C": System.out.print("Digite o comprimento do raio do círculo: ");
            raio = in.nextInt();
            area = 3.14 * (raio * raio);
            System.out.println("A área do círculo é: "+area);
            break;
            default: System.out.println("Caractere inválido.");


        }
    }
    
}
