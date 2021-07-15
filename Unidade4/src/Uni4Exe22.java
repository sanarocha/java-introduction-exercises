import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o número do seu curso: \n" +
        "1 - Ciência da Computação\n2 - Licenciatura da Computação\n" +
        "3 - Sistemas de Informação: ");
        int curso = in.nextInt();

        switch(curso){
            case 1: System.out.println("Bacharel em Ciência da Computação");
            break;
            case 2: System.out.println("Licenciado em Computação");
            break;
            case 3: System.out.println("Bacharel em Sistemas de Informação");
            break;
            default: System.out.println("Curso inválido");
    }
    in.close();
    
}
}
