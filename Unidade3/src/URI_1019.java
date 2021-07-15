import java.util.Scanner;

public class URI_1019 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int tempoSegundos = entrada.nextInt();

       
        int horas = tempoSegundos / 3600;
        tempoSegundos = tempoSegundos % 3600;

        int minutos = tempoSegundos / 60;
        tempoSegundos = tempoSegundos % 60;

        int segundos = tempoSegundos;


        System.out.println(horas+ ":" +minutos+ ":"+segundos);


        entrada.close();

    }
    
}
