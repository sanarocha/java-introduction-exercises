import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o valor de Y: ");
        double y = in.nextDouble();
        System.out.print("Digite o valor de X: ");
        double x = in.nextDouble();

        if(x == 0 && y == 0){
            System.out.println("Quadrante: 0");
        }
        else if(x > 0 && y > 0){
            System.out.println("Quadrante: 1");
        }
        else if(x > 0 && y < 0){
            System.out.println("Quadrante: 2");
        }
        else if(x < 0 && y < 0){
            System.out.println("Quadrante: 3");
        }
        else if(x < 0 && y > 0){
            System.out.println("Quadrante: 4");
        }
        in.close();

    }
    
}
