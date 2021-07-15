
public class Uni5Exe10 {
    public static void main(String[] args) {
        
         int i = 0, d1 = 0, d2 = 0;

        for(i =0; i <= 10000; i++){
            d1 = i % 100;
            d2 = i / 100;
            if((d1 + d2) * (d1 + d2) == i){
                System.out.println(i);
            }
        }
        
    }
    
}
