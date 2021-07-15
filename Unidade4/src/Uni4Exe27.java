import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
       int hrEntrada, minEntrada, hrSaida, minSaida, hrFinal, minFinal, tempoMin, tempoHr, valorEx;


        System.out.print("Digite a hora de chegada: ");
        hrEntrada = in.nextInt();
        System.out.print("Digite o minuto de chegada: ");
        minEntrada = in.nextInt();
        System.out.print("Digite a hora de saída: ");
        hrSaida = in.nextInt();
        System.out.print("Digite o minuto de saída: ");
        minSaida = in.nextInt();

        if(hrEntrada > hrSaida){
            hrFinal = (hrSaida + 24) - hrEntrada;
        }else{
            hrFinal = hrSaida - hrEntrada;
        }
        if(minEntrada > minSaida){
            minFinal = (minSaida + 60) - minEntrada;
        }else {
            minFinal = minSaida - minEntrada;
        }
        System.out.println("O carro ficou estacionado por "+hrFinal+" horas e  "+minFinal+" minutos.");

        tempoMin = (hrFinal * 60) + minFinal;

        if(tempoMin <= 120){
            if(tempoMin <= 60){
                System.out.println("O valor da tarifa é de R$5,00");
            }
            else{
                System.out.println("O valor da tarifa é de R$10,00");
            }
        }
        else if(tempoMin <= 240){
            if(tempoMin <= 180){
                System.out.println("O valor da tarifa é de R$17,50");
            }
            else {
                System.out.println("O valor da tarifa é de R$25,00");
            }
        }
        else {
            tempoHr = tempoMin / 60;
            valorEx = 25 + ((tempoHr - 4) * 2);
            System.out.println("O valor da tarifa é de R$ "+valorEx);
        }





        in.close();
    }
    
}
