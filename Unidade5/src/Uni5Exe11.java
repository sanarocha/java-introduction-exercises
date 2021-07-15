public class Uni5Exe11 {
    public static void main(String[] args) {
        int hr = 1, biscoito = 0, total = 0;

        for(hr = 1; hr <= 16; hr++){
        
            if(hr == 1){
                biscoito++;
                total += biscoito;
            }
            else if(hr == 2){
                biscoito += 3;
                total += biscoito;
            }
            else if(hr >= 3){
            biscoito *= 3;
            total += biscoito;
            }
        }
        System.out.println("Ao final do dia foram quebrados "+total+" biscoitos.");
    }
    
}
