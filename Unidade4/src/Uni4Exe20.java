import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double prova1, prova2, prova3, exercicios, media;

        System.out.print("Digite a nota do aluno na primeira prova: ");
        prova1 = in.nextDouble();
        System.out.print("Digite a nota do aluno na segunda prova: ");
        prova2 = in.nextDouble();
        System.out.print("Digite a nota do aluno na terceira prova: ");
        prova3 = in.nextDouble();
        System.out.print("Digite a nota do aluno nos exercícios: ");
        exercicios = in.nextDouble();

        media = (prova1+(prova2*2)+(prova3*3)+exercicios)/7;

        if(media >= 9.0){
            System.out.println("Conceito A");
            System.out.println("Aluno aprovado.");
        }
        else if(media >= 7.5 && media < 9.0){
            System.out.println("Conceito B");
            System.out.println("Aluno aprovado.");
        }
        else if(media >= 6.0 && media < 7.5){
            System.out.println("Conceito C");
            System.out.println("Aluno aprovado.");
        }
        else if(media >= 4.0 && media < 6.0){
            System.out.println("Conceito D");
            System.out.println("Aluno reprovado.");
        }
        else if(media < 4.0){
            System.out.println("Conceito E");
            System.out.println("Aluno reprovado.");
        }
        in.close();
    }
    
}
