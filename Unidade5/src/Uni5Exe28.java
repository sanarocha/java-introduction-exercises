import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int voto = 0, votosTotais = 0, nenhumDNos = 0, cpm = 0, skank = 0, jota = 0;
        double percentualN = 0, percentualC = 0, percentualS = 0, percentualJ = 0;

        System.out.print("mais um voto: s (SIM) / n (NÃO)?");
        String confirmacao = in.next().trim();
        String vencedor = "";

        while(!confirmacao.equalsIgnoreCase("n")){
            System.out.print("Digite seu voto: \n 1 - Nenhum de nós\n 2 - CPM22\n 3 - Skank\n 4 - Jota Quest");
            voto = in.nextInt();

            if(voto == 1){
                votosTotais++;
                nenhumDNos++;
            }else if(voto == 2){
                votosTotais++;
                cpm++;
            }else if(voto == 3){
                votosTotais++;
                skank++;
            }else if(voto == 4){
                votosTotais++;
                jota++;
            }else{
                System.out.print("Voto inválido.");
            }

            percentualN = (nenhumDNos * 100) / votosTotais;
            percentualC = (cpm * 100) / votosTotais;
            percentualS = (skank * 100) / votosTotais;
            percentualJ = (jota * 100) / votosTotais;

            System.out.print("mais um voto: s (SIM) / n (NÃO)?");
            confirmacao = in.next().trim();
        }

        if(nenhumDNos > cpm && nenhumDNos > skank && nenhumDNos > jota){
            vencedor = "Nenhum de Nós";
        }else if(cpm > nenhumDNos && cpm > skank && cpm > jota){
            vencedor = "CPM22";
        }else if(skank > nenhumDNos && skank > cpm && skank > jota){
            vencedor = "Skank";
        }else if(jota > nenhumDNos && jota > cpm && jota > skank){
            vencedor = "Jota Quest";
        }

        System.out.println("O total de votos para Nenhum de Nós: "+nenhumDNos+". Percentual: "+percentualN+"%");
        System.out.println("O total de votos para CPM22: "+cpm+". Percentual: "+percentualC+"%");
        System.out.println("O total de votos para Skank: "+skank+". Percentual: "+percentualS+"%");
        System.out.println("O total de votos para Jota Quest: "+jota+". Percentual: "+percentualJ+"%");
        System.out.println("O vencedor da votação é: "+vencedor);

        in.close();
    }
    
}
