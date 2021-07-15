import java.util.Scanner;

public class RossanaRochadaSilva_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        double nota1, nota2, nota3, notaBaixa, notaMedia, notaAlta, mediaSimples, mediaPonderada;
        
        System.out.print("Digite as três notas: ");
        nota1 = in.nextDouble();
        nota2 = in.nextDouble();
        nota3 = in.nextDouble();

        notaAlta = 0;
        notaMedia = 0;
        notaBaixa = 0;

        if(nota1 > nota2 && nota1 > nota3){ 
            notaAlta = nota1 + 0.3;
            if(nota2 > nota3){
                notaMedia = nota2 + 0.2;
                notaBaixa = nota3 + 0.1;
            }else if(nota3 > nota2){
                notaMedia = nota3 + 0.2;
                notaBaixa = nota2 + 0.1;
            }
        }else if(nota2 > nota1 && nota2 > nota3){
            notaAlta = nota2 + 0.3;
            if(nota1 > nota3){
                notaMedia = nota1 + 0.2;
                notaBaixa = nota3 + 0.1;
            }else if(nota3 > nota1){
                notaMedia = nota3 + 0.2;
                notaBaixa = nota1 + 0.1;
            }
        }else if(nota3 > nota1 && nota3 > nota2){
            notaAlta = nota3 + 0.3;
            if(nota1 > nota2){
                notaMedia = nota1 + 0.2;
                notaBaixa = nota2 + 0.1;
            }else if(nota2 > nota1){
                notaMedia = nota2 + 0.2;
                notaBaixa = nota1 + 0.1;
            }
        }

        System.out.println("_Menu\n"+
        "a) média simples\n" +
        "b) média ponderada");
        String opcao = in.next().trim().toUpperCase();

        switch(opcao){
            case "A": 
            mediaSimples = (nota1 + nota2 + nota3) / 3;
            System.out.println("O valor da média simples do aluno: "+mediaSimples);
            break;
            case "B":
            mediaPonderada = (notaBaixa * 0.7) + (notaMedia * 0.1) + (notaAlta * 0.2);
            System.out.println("O valor da média ponderada do aluno: "+mediaPonderada);
            break;
            default:
            System.out.println("Valor inválido do Menu");
        }
        in.close();

    }
    
}
