import java.util.*;

public class addfunction {
    public static int plus(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // System.out.println(plus(3, 4, 5));
        System.out.println(plus(a, b, c));
    }

}
