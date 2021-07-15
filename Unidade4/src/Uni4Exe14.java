import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean mesOk, bissexto, fevereiroBissexto, fevereiro, mesesTrintaDias, mesesTrintaeUm;
        int dia, mes, ano;

        System.out.print("Digite o dia: ");
        dia = in.nextInt();
        System.out.print("Digite o número do mês: ");
        mes = in.nextInt();
        System.out.print("Digite o ano: ");
        ano = in.nextInt();

        mesOk = mes >= 1 && mes <= 12;
        bissexto = ano % 4 == 0;
        fevereiroBissexto = mes == 2 && bissexto && dia <= 29;
        fevereiro = mes == 2 && dia <= 28;
        mesesTrintaDias = mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 && dia <= 31;
        mesesTrintaeUm = mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia <= 30;

        if(mesOk && (mesesTrintaDias || mesesTrintaeUm)){
            System.out.println("A data é válida.");
        }
        else if(mesOk && fevereiro){
            System.out.println("A data é válida.");
        }
        else if(mesOk && fevereiroBissexto){
            System.out.println("A data é válida.");
        } 
        else{
            System.out.println("A data é inválida.");
        }

    }
    
}
