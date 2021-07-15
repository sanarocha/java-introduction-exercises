import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double comprimento = input.nextDouble();
        double altura = input.nextDouble();

        double area = comprimento * altura;
        double azulejos = area * 9;
        azulejos = azulejos * 12.50;

        System.out.println("Valor gasto com a compra de azulejos: R$ " + azulejos);
        
    }
    
}
