public class hollow_box {
    public static void main(String[] args) {
        int c = 5;
        int r= 5;
        for (int i = 1; i <=c; i++) {
            for (int j = 1; j <= r; j++) {
                if (i==1||i==c||j==r||j==1) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
