public class Uni5Exe22 {
    public static void main(String[] args) {

        double salario = 2000;
        int ano = 1995;
        double aumento = 1.5;


        while(!(ano == 2021)){
            salario = salario + (salario * aumento / 100);
            aumento = aumento * 2;
            ano++;
        }

        System.out.println(salario);

    }
    
}
