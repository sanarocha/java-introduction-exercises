import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: " );
        int valor1 = in.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = in.nextInt();
        System.out.print("Digite o terceiro valor: ");
        int valor3 = in.nextInt();

        System.out.print("Informe a opção desejada: \n1 (decrescente), 2 (crescente), 3 (maior no meio): ");
        int opcao = in.nextInt();

        switch(opcao){
            case 1:
            if(valor1 > valor2 && valor1 > valor3){
                System.out.println(valor1);
                if(valor2>valor3){
                    System.out.println(valor2);
                    System.out.println(valor3);
                } else {
                    System.out.println(valor3);
                    System.out.println(valor2);
                }

            } else {
                if(valor2 > valor1 && valor2 > valor3){
                    System.out.println(valor2);
                    if(valor1>valor3){
                        System.out.println(valor1);
                        System.out.println(valor3);
                    } else {
                        System.out.println(valor3);
                        System.out.println(valor1);
                    }
                } else {
                    System.out.println(valor3);
                    if(valor1 > valor2){
                        System.out.println(valor1);
                        System.out.println(valor2);
                    } else {
                        System.out.println(valor2);
                        System.out.println(valor1);
                    }
                }
            }
            break;
            case 2: 
            if(valor1 < valor2 && valor1 < valor3){
                System.out.println(valor1);
            } else{
                if(valor2 < valor1 && valor2 < valor3){
                    System.out.println(valor2);
                }else{
                    System.out.println(valor3);
                }
            }

            if((valor1 > valor2 && valor1 < valor3) || (valor1 > valor3 && valor1 < valor2)){
                System.out.println(valor1);
            }else {
                if((valor2 > valor1 && valor2 < valor3) || (valor2 > valor3 && valor2 < valor1)){
                    System.out.println(valor2);
                } else {
                    System.out.println(valor3);
                }
            }

            if(valor1 > valor2 && valor1 > valor3){
                System.out.println(valor1);
            }else {
                if(valor2 > valor1 && valor2 > valor3){
                    System.out.println(valor2);
                }else {
                    System.out.println(valor3);
                }
            }
            break;
            case 3:
                
                if (valor1 > valor2 && valor1 > valor3) {
                    System.out.println(valor2);
                    System.out.println(valor1);
                    System.out.println(valor3);
                } else {
                    if (valor2 > valor1 && valor2 > valor3) {
                        System.out.println(valor1);
                        System.out.println(valor2);
                        System.out.println(valor3);
                    } else {
                        System.out.println(valor1);
                        System.out.println(valor3);
                        System.out.println(valor2);
                    }
                }
                break;
        default: System.out.println("Opção inválida.");


    }
    
}
}