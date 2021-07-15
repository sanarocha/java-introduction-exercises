import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int kmRodadoTotal = 0;
        int combustivelTotal = 0;

        System.out.print("Digite a quantidade total de reabastecimentos: ");
        int reabastecimentos = in.nextInt();
       

        for(int cont = 0; cont < reabastecimentos; cont++){

            System.out.print("Digite a quantidade de combustível em litros: ");
            int combustivel = in.nextInt();
            System.out.print("Digite as medidas do odômetro: ");
            int odometro = in.nextInt();

            kmRodadoTotal += odometro;
            combustivelTotal += combustivel;
        }

        int kmMediaCadaParada = (kmRodadoTotal / combustivelTotal) / reabastecimentos;
        System.out.println("A quilometragem obtida por litro de combustível em cada parada foi de "+kmMediaCadaParada+" km/L");
        int kmMediaTotal = kmRodadoTotal / combustivelTotal;
        System.out.println("A quilometragem média obtida por litro de combustível durante toda viagem foi de "+kmMediaTotal+" km/L");

        in.close();
    }
    
}
