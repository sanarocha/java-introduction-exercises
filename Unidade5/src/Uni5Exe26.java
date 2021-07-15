import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int contTrechos = 0, contTrechosInformados = 0, contTrechos150 = 0;

        System.out.print("Digite o valor do pedágio que Astolfo se nega a pagar: ");
        double valorMax = in.nextDouble();

        System.out.print("Digite o valor do pedágio: ");
        double valorPedagio = in.nextDouble();
        double distanciaKm = 0;
        

        while(!(valorPedagio <= 0)){
            System.out.print("Digite a distância em Km do trecho: ");
            distanciaKm = in.nextDouble();
            contTrechosInformados++;

            if(valorPedagio > valorMax){
                contTrechos++;
            }

            if(distanciaKm > 150 && valorPedagio < valorMax){
                contTrechos150++;
            }

            System.out.print("Digite o valor do pedágio: ");
            valorPedagio = in.nextDouble();

        }
        System.out.println("Trechos com o valor acima do qual ele nega-se a pagar: "+contTrechos);
        System.out.println("Quantidade de trechos informados: "+contTrechosInformados);
        System.out.println("Trechos acima de 150km com o valor aceito por ele: "+contTrechos150);

        in.close();
        
    }
    
}
