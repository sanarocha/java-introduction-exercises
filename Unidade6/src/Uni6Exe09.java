import java.util.Scanner;

public class Uni6Exe09 {
    Scanner in;

    public Uni6Exe09() {
        in = new Scanner(System.in);;
        int totalF = 0, totalM = 0, n = 3, media = 0;
        int[] sexo = new int[n];
        int[] notaF = new int[n];
        int[] notaM = new int[n];
        int[] notaT = new int[n];
        int[] idadeF = new int[n];
        int[] idadeM = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Insira o sexo (1 = feminino, 2 = masculino): ");
            sexo[i] = in.nextInt();
            if (sexo[i] == 1) {
                System.out.print("Insira uma nota para o cinema (de 0 até 10): ");
                notaF[i] = in.nextInt();
                System.out.print("Insira a idade: ");
                idadeF[i] = in.nextInt();
                totalF++;

            } else if (sexo[i] == 2) {
                totalM++;
                System.out.print("Insira uma nota para o cinema (de 0 até 10): ");
                notaM[i] = in.nextInt();
                System.out.print("Insira a idade: ");
                idadeM[i] = in.nextInt();
            }
        }

        notaMedia(notaT, notaF, notaM, totalM, totalF, n);
        notaMediaHomens(notaM, totalM, n);
        notaMulherMaisJovem(notaF, idadeF, totalF, n);
        mulheres50NotaAcimaMedia(notaF, idadeF, n, media);

        in.close();
    }

    public int notaMedia(int[] notaT, int[] notaF, int[] notaM, int totalM, int totalF, int n) {
        int somaNota = 0;
        int total = totalM + totalF;

        for (int i = 0; i < n; i++) {
            notaT[i] = notaF[i] + notaM[i];
            somaNota += notaT[i];
        }

        int media = somaNota / total;
        System.out.println("A nota média recebida pelo cinema foi " + media);

        return media;
    }

    public void notaMediaHomens(int[] notaM, int totalM, int n){
        int somaNotaM = 0;

        for(int i = 0; i < n; i++){
            somaNotaM += notaM[i];
        }

        int mediaM = somaNotaM / totalM;
        System.out.println("A nota média atribuída por "+totalM+" homens é de "+mediaM);
    }
    public void notaMulherMaisJovem(int[] notaF, int[] idadeF, int totalF, int n){
        int notaMaisJovem = 0, idadeMaisJovem = 0; 

        for(int i = 0; i < n; i++){
            int menor = idadeF[i];
            int maior = idadeF[i];

            if(idadeF[i] <= menor){
                idadeMaisJovem = idadeF[i];
                if(notaF[i] == idadeF[i]){
                notaMaisJovem += notaF[i];
                }
            }
        }
        System.out.println("A mulher mais jovem de idade "+idadeMaisJovem+" anos, atribuiu a nota "+notaMaisJovem);
    }

    public void mulheres50NotaAcimaMedia(int[] notaF, int[] idadeF, int media, int n){
        int contMulheres50 = 0;

        for(int i = 0; i < n; i++){
            if(idadeF[i] > 50 && notaF[i] > media){
                contMulheres50++;
            }
        }
        System.out.println(contMulheres50+" mulheres com mais de 50 anos deram nota superior a média.");
    }


    public static void main(String[] args) {
        new Uni6Exe09();
    }

}
