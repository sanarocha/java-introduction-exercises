import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float media = 0;
        float totalAltura = 0;

        System.out.print("Digite a altura: ");
        float altura = in.nextFloat();

        for(int cont = 0; cont <= 20; cont++){
            if(cont < 19){
                totalAltura += altura;
                System.out.print("Digite a altura: ");
                altura = in.nextFloat();
            }else if(cont == 20){
                totalAltura += altura;
                media = totalAltura/20;
                System.out.println("A média das alturas é: "+media);

            }
        }
       

        in.close();
    }
    
}
