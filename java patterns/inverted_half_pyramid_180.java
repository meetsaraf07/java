public class inverted_half_pyramid_180 {
    public static void main(String[] args) {
        int c = 5;
        for (int i = 1; i <=c; i++) {
            for (int j = 1; j <= c-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
