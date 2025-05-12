public class pylindromic_no_pyramid {
    public static void main(String[] args) {
        int side = 5;
        for (int i = 1; i <= side; i++) {
            for (int j = 1; j <= side-i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j > 1; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
