import java.util.Scanner;

public class Problema4 {
    public static void main(String[] args) {
        
        /*calcular e mostrar a quantidade de litros de
        combustivel gastos em uma viagem ao utilizar um
        automovel que faz 12 km/l. 
        para efetuar o calculo deve-se fornecer o tempo 
        gasto na viagem (em horas) e a velocidade media
        durante a mesma (km/h)
        saida seria o calculo de quantos litros seriam
        necessarios */

        //entradas: tempo (h). velocidadeMedia (km/h)

        //saidas: quantidadeLitro

        //processo:
        //distanciaPercorrida (km) = tempo (h) * velocidadeMedia (km/h)
        //quantidade litros = distancia percorrida / 12 (km/l)

        //testes:
        // tempo   |    velocidade media  | quantidade litros
        //   2h    |          60 km/h     |        10 L
        //  56h    |         40 km/h      |       186,6 L

        //algoritmo:

        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o tempo gasto na viagem (em horas): ");
        float tempo = entrada.nextFloat();

        System.out.print("Digite a velocidade media do veiculo durante a viagem (em km/h): ");
        float velocidadeMedia = entrada.nextFloat();
        
        float distanciaPercorrida = tempo * velocidadeMedia;
        float quantidadeLitros = distanciaPercorrida / 12f; 

        System.out.println("A quantidades de litros necessarios para realizar a viagem eh de " + quantidadeLitros + "litros.");




    }
    
}
