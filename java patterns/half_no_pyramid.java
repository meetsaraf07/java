public class half_no_pyramid {
    public static void main(String[] args) {
        int c = 5;
        for (int i = 1; i <=c; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
