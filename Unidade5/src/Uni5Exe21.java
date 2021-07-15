public class Uni5Exe21 {
    public static void main(String[] args) {
        
        double alturaChico = 1.50;
        double alturaZe = 1.10;
        int anos = 0;

        while(!(alturaZe > alturaChico)){
            alturaChico += 0.2;
            alturaZe += 0.3;
            anos++;
        }

        System.out.println("Serão necessários "+anos+" anos para que Zé seja maior que Chico.");

    }
    
}
