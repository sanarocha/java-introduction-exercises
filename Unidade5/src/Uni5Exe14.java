import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double totalPc = 0, totalPv = 0, lucroTotal = 0, lucro = 0, pc = 0, pv = 0;
        int lucroMenor = 0, lucroMedio = 0, lucroMaior = 0;
        String nome = "";

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o nome do produto: ");
            nome = in.next();
            System.out.print("Digite o preço de compra: ");
            pc = in.nextDouble();
            System.out.print("Digite o preço de venda: ");
            pv = in.nextDouble();

            totalPc += pc;
            totalPv += pv;

            lucro = (pv - pc) / pc * 100;
            lucroTotal += lucro;

            if (lucro <= (pc * 0.1)) {
                lucroMenor++;
            } else if (lucro >= (pc * 0.1) && lucro <= (pc * 0.2)) {
                lucroMedio++;
            } else if (lucro > (pc * 0.2)) {
                lucroMaior++;
            }
        }

        System.out.println("O valor total de compra é de: " + totalPc);
        System.out.println("O valor total de venda é de: " + totalPv);
        System.out.println("O lucro total é de: " + lucroTotal);
        System.out.println("Número de produtos com menos de 10% de lucro: " + lucroMenor);
        System.out.println("Número de produtos com lucro entre 10% e 20%: " + lucroMedio);
        System.out.println("Número de produtos com mais de 20% de lucro: " + lucroMaior);

        in.close();

    }

}
