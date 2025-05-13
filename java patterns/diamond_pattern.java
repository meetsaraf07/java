public class diamond_pattern {
   public static void main(String[] args) {
    int side = 5;
        // solution using 3 parts
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 1; j--) {
                System.out.print("*");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // solution using 2 parts
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j < i ; j++) {
                System.out.print("-");
            }
            for (int j = 0; j <=(side-i)*2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
   } 
}
