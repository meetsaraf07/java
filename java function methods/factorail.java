import java.util.*;

public class factorail {
    private static int fact(int a) {
        if (a<=1) {
            return 1;
        }
        return a*fact(a-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.: ");
        int a = sc.nextInt();
        System.out.println("factorial :"+ fact(a));
        sc.close();
    }
}
