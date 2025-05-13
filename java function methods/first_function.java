import java.util.*;

public class first_function {
    private static void printmyName(String name) {
        System.out.println("My name is " + name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        printmyName(name);
        sc.close();
    }
}
