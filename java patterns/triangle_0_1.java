public class triangle_0_1 {
    public static void main(String[] args) {
        int c = 5;
        for (int i = 1; i <=c; i++) {
            for (int j = 1; j <= i; j++) {
                if ((j+i)%2==0) {
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
