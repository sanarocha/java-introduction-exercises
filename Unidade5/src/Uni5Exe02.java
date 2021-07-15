public class Uni5Exe02 {
    public static void main(String[] args) {

        int somaPar = 0;
        int somaImpar = 0;

        for(int cont = 1; cont <= 100; cont +=1){
            if(cont % 2 == 0){
                somaPar = somaPar + cont;
            }else {
                somaImpar = somaImpar + cont;
            }

        }
        System.out.println(somaPar);
        System.out.println(somaImpar);
    }    

    
}
