import java.util.Scanner;

public class RossanaRochadaSilva_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite a renda anual: ");
        float rendaAnual = in.nextFloat();
        System.out.print("Digite a quantidade de dependentes: ");
        int qtDependentes = in.nextInt();

        float rendaLiquida = rendaAnual - (rendaAnual * qtDependentes * 0.02f);

        float impostoAPagar = 0;

        if(rendaLiquida > 2000 && rendaLiquida <= 5000){
            impostoAPagar = rendaLiquida * 0.05f;
            System.out.println("O imposto a pagar equivale a: "+ impostoAPagar);
        }
        else if(rendaLiquida > 5000 && rendaLiquida <= 10000){
            impostoAPagar = rendaLiquida * 0.01f;
            System.out.println("O imposto a pagar equivale a: "+ impostoAPagar);
        }
        else if(rendaLiquida > 10000){
            impostoAPagar = rendaLiquida * 0.15f;
            System.out.println("O imposto a pagar equivale a: "+ impostoAPagar);
        }
        in.close();
        
    }
}
