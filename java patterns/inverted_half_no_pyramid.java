public class inverted_half_no_pyramid {
    public static void main(String[] args) {
        int c = 5;
        for (int i = c; i >0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
