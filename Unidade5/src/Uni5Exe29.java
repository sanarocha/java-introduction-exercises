import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe um valor: ");
        int valor = in.nextInt();

        int nota1 = 0, nota2 = 0, nota5 = 0, nota10 = 0, nota20 = 0;

        while(valor > 0){

        if(valor >= 20){
            nota20++;
            valor -= 20;
        }else if(valor >= 10){
            nota10++;
            valor -= 10;
        }else if(valor >= 5){
            nota5++;
            valor -= 5;
        }else if(valor >= 2){
            nota2++;
            valor -= 2;
        }else if(valor >= 1){
            nota1++;
            valor -= 1;
        }
        }
        System.out.println(nota20+" notas de 20 reais.");
        System.out.println(nota10+" notas de 10 reais.");
        System.out.println(nota5+" notas de 5 reais.");
        System.out.println(nota2+" notas de 2 reais.");
        System.out.println(nota1+" notas de 1 reais.");

        in.close();
    }
    
}
