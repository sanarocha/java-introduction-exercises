import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite a idade do primeiro homem: ");
        int homem1 = in.nextInt();
        System.out.print("Digite a idade do segundo homem: ");
        int homem2 = in.nextInt();
        System.out.print("Digite a idade da primeira mulher: ");
        int mulher1 = in.nextInt();
        System.out.print("Digite a idade da segunda mulher: ");
        int mulher2 = in.nextInt();

        // homem mais velho + mulher mais nova
        // homem mais novo * mulher mais velha

        if(homem1 > homem2 && mulher1 > mulher2) {
            int soma = homem1 + mulher2;
            int multi = homem2 * mulher1;
            System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: "+ soma);
            System.out.println("O produto da idade do homem mais novo com a mulher mais velha é: "+ multi);
        }
        else if(homem1 < homem2 && mulher1 < mulher2) {
            int soma = homem2 + mulher1;
            int multi = homem1 * mulher2;
            System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: "+ soma);
            System.out.println("O produto da idade do homem mais novo com a mulher mais velha é: "+ multi);
        }
        else if(homem1 < homem2 && mulher1 > mulher2) {
            int soma = homem2 + mulher2;
            int multi = homem1 * mulher1;
            System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: "+ soma);
            System.out.println("O produto da idade do homem mais novo com a mulher mais velha é: "+ multi);
        }
        else if(homem1 > homem2 && mulher1 < mulher2) {
            int soma = homem1 + mulher1;
            int multi = homem2 * mulher2;
            System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: "+ soma);
            System.out.println("O produto da idade do homem mais novo com a mulher mais velha é: "+ multi);
        }
        in.close();
    }
    
}
