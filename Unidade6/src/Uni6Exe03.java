import java.util.Scanner;

public class Uni6Exe03 {

    public Uni6Exe03(){
      float[] vetorValores = new float[12];

      lerValores(vetorValores);
      ajustarValores(vetorValores);
      escreverValores(vetorValores);

    }

    public void lerValores(float[] vetorValores){
        Scanner in = new Scanner(System.in);

        for(int i = 0; i < vetorValores.length; i++){
            System.out.print("Digite um valor real: ");
            vetorValores[i] = in.nextFloat();
        }
        in.close();
    }

    public void ajustarValores(float[] vetorValores){
        String pares = "";
        String impares = "";

        for(int i = 0; i < vetorValores.length; i++){
            if(vetorValores[i] % 2 == 0){
                vetorValores[i] += vetorValores[i] * (2 / 100f);
                pares += vetorValores[i] + "\n";
            }else{
                vetorValores[i] += vetorValores[i] * (5 / 100f);
                impares += vetorValores[i] + "\n";
            }
            
        }
    }

    public void escreverValores(float[] vetorValores){
       for(int i = 0; i < vetorValores.length; i++){
        System.out.println(vetorValores[i]);
       }
        
    }
    public static void main(String[] args) {
        new Uni6Exe03();
    }
    
}
