public class pascal_triangle {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            int count = 1;
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count=count*(i-j)/(j);
            }
            System.out.println();
        }
    }
}
