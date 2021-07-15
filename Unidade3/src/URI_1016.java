import java.util.Scanner;

public class URI_1016 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int velocidadeX = 60;
        int velocidadeY = 90;
        int distancia = input.nextInt();

        velocidadeY = distancia * 2;

        System.out.println(velocidadeY + " minutos");
        input.close();

    }
    
}
