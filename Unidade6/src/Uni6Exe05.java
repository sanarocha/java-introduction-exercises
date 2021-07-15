import java.util.Scanner;

public class Uni6Exe05 {

    public Uni6Exe05(){
        String[] respostasRapaz = new String[5];
        String[] respostasMoça = new String[5];
        int afinidade = 0;

        lerRespostas(respostasRapaz, respostasMoça);
        afinidade = calcularAfinidade(respostasRapaz, respostasMoça, afinidade);

        if(afinidade == 15){
            System.out.println("Casem!");
        }else if(afinidade >= 10 && afinidade <= 14){
            System.out.println("Vocês têm muita coisa em comum!");
        }else if(afinidade >= 5 && afinidade <= 9){
            System.out.println("Talvez não dê certo :(");
        }else if(afinidade >= 0 && afinidade <= 4){
            System.out.println("Vale um encontro.");
        }else if(afinidade >= -1 && afinidade <= -9){
            System.out.println("Melhor não perder tempo");
        }else if(afinidade == -10){
            System.out.println("Vocês de odeiam!");
        }
    }

    public void lerRespostas(String[] respostasRapaz, String[] respostasMoça){
        Scanner in = new Scanner(System.in);

        System.out.println("Insira as respostas das perguntas. Primeiro a do rapaz e após a da garota. As alternativas são SIM, NAO OU IND (indiferente).");
        System.out.print("Gosta de música sertaneja? ");
        respostasRapaz[0] = in.next();
        respostasMoça[0] = in.next();

        System.out.print("Gosta de futebol? ");
        respostasRapaz[1] = in.next();
        respostasMoça[1] = in.next();

        System.out.print("Gosta de seriados? ");
        respostasRapaz[2] = in.next();
        respostasMoça[2] = in.next();

        System.out.print("Gosta de redes sociais? ");
        respostasRapaz[3] = in.next();
        respostasMoça[3] = in.next();

        System.out.print("Gosta da Oktoberfest? ");
        respostasRapaz[4] = in.next();
        respostasMoça[4] = in.next();


        in.close();

    }

    public int calcularAfinidade(String[] respostasRapaz, String[] respostasMoça, int afinidade){
        afinidade = 0;
        for(int i = 0; i < respostasRapaz.length; i++){
            if((respostasRapaz[i].equalsIgnoreCase("SIM") && respostasMoça[i].equalsIgnoreCase("SIM") || (respostasRapaz[i].equalsIgnoreCase("NAO") && respostasMoça[i].equalsIgnoreCase("NAO")))){
                afinidade += 3;
            }else if((respostasRapaz[i].equalsIgnoreCase("IND") && (respostasMoça[i].equalsIgnoreCase("NAO") || respostasMoça[i].equalsIgnoreCase("SIM")))){
                afinidade += 1;
            }else if((respostasMoça[i].equalsIgnoreCase("IND") && (respostasRapaz[i].equalsIgnoreCase("NAO") || respostasRapaz[i].equalsIgnoreCase("SIM")))){
                afinidade += 1;
            }else if(respostasRapaz[i].equalsIgnoreCase("SIM") && respostasMoça[i].equalsIgnoreCase("NAO")){
                afinidade -= 2;
            }else if(respostasMoça[i].equalsIgnoreCase("SIM") && respostasRapaz[i].equalsIgnoreCase("NAO")){
                afinidade -= 2;
            }  
        }
        return afinidade;
    }

    public static void main(String[] args) {
        new Uni6Exe05();
    }
    
}
