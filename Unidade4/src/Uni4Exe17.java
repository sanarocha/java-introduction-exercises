import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double rendaAnual, dependentes, rendaLiquida, imposto;

        System.out.print("Insira a renda anual: ");
        rendaAnual = in.nextDouble();
        System.out.print("Insira o número de dependentes: ");
        dependentes = in.nextDouble();

        rendaLiquida = rendaAnual * (dependentes * 0.02);
        rendaLiquida += rendaAnual;
         if(rendaLiquida < 2.000) {
             System.out.println("O contribuinte não paga imposto. ");
         }
         else if(rendaLiquida > 2.000 && rendaLiquida < 5.0000){
             imposto = rendaLiquida * 0.05;
             rendaLiquida += imposto;
             System.out.println("O imposto é de R$ "+imposto+". A renda total é R$ "+rendaLiquida);
         }
         else if(rendaLiquida > 5.000 && rendaLiquida < 10.000) {
             imposto = rendaLiquida * 0.10;
             rendaLiquida += imposto;
             System.out.println("O imposto é de R$ "+imposto+". A renda total é R$ "+rendaLiquida);
         }
         else if(rendaLiquida > 10.000) {
             imposto = rendaLiquida * 0.15;
             rendaLiquida += imposto;
             System.out.println("O imposto é de R$ "+imposto+". A renda total é R$ "+rendaLiquida);
         }
        
    }
    
}
