public class excluir {
    public static void main(String[] args) {
        int x, y;
        x = 1;
        y = 0;
        while (y < 6) {
               x = x * (- 1);
               y = y + 1;
               if (x > 0) {
                      System.out.println(y);
               } else {
                      System.out.println(-y);
               }
        }
        System.out.println(x);
        System.out.println(y);
        }
       
    }
  
