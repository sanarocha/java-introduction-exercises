import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double precoProduto = 0, quantProdUni = 0, totalVendas = 0, salario = 0;
        String nomeVendedor = "";
        int quantProdutosTotal = 0;
      
        System.out.print("Deseja digitar os dados de mais um vendedor: s(SIM) / n(NÃO)?");
        String confirmacao = in.next().trim();

        while(!confirmacao.equalsIgnoreCase("n")){

            System.out.print("Digite o nome do vendedor: ");
            nomeVendedor = in.next();
            System.out.print("Digite quantos produtos foram vendidos pelo vendedor: ");
            quantProdutosTotal = in.nextInt();

            for(int cont = 0; cont <= quantProdutosTotal - 1; cont++){

                System.out.print("Digite o preço unitário do produto: ");
                precoProduto = in.nextDouble();
                System.out.print("Digite a quantidade vendida deste produto: ");
                quantProdUni = in.nextDouble();
                totalVendas += precoProduto * quantProdUni;
            }
            salario = totalVendas + (totalVendas * 0.3);

            System.out.print("O vendedor "+nomeVendedor+" teve um total de vendas de R$ "+totalVendas+" e seu salário é de R$ "+salario+"\n");

            System.out.print("Deseja digitar os dados de mais um vendedor: s(SIM) / n(NÃO)?");
            confirmacao = in.next().trim();
        }

        

        in.close();
    }
    
}
