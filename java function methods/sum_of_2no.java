import java.util.*;

public class sum_of_2no {
    private static int sum2(int a, int b) {
        int c = a+b;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no.: ");
        int a = sc.nextInt();
        System.out.println("Enter second no.: ");
        int b = sc.nextInt();
        System.out.println("total:"+sum2(a,b));
        sc.close();
    }
}
