public class floyds_triangle {
    public static void main(String[] args) {
        int num = 1;
        int c = 5;
        for (int i = 1; i <=c; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
