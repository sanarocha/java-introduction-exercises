import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Em que dia da semana cai o primeiro dia do mês?");
        int primeiroDia = in.nextInt();
        System.out.print("Qual o número de dias do mês?");
        int diasMes = in.nextInt();
        System.out.println("  D  S  T  Q  Q  S  S");
        System.out.println("\n");

        for(int cont = 1; cont < primeiroDia; cont++){
            System.out.print("   ");
        }

        for(int cont = 1; cont <= diasMes; cont++){
           
            if(cont < 10){
                System.out.print("  "+cont);
            }else{
                System.out.print(" "+cont);
            }
            if(primeiroDia == 7){
                primeiroDia = 1;
                System.out.print("\n");
            }else{
                primeiroDia++;
            }
        }
        in.close();
        
    }
    
}
