public class solid_rombus {
    public static void main(String[] args) {
        int side = 5;
        for (int i = side; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= side; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
