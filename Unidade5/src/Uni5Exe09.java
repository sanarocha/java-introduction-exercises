import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos da turma: ");
        int quantAlunos = in.nextInt();

        int quantAcima20 = 0;
        String listaNome = "";


        for(int i = 1; i <= quantAlunos; i++){
            System.out.print("Digite o nome do aluno: ");
            String nome = in2.nextLine().trim();

            System.out.print("Digite a idade do aluno: ");
            int idade = in.nextInt();

            if(idade == 18){
                listaNome += nome + " ";
            }else if(idade >= 20){
                quantAcima20++;
            }
        }
        System.out.println("Os alunos que possuem 18 anos são: "+listaNome);
        System.out.println("A quantidade de alunos que possuem mais que 20 anos é: "+quantAcima20+" aluno(s).");
        in.close();
        in2.close();

    }
    
}
