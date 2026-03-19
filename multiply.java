import java.util.*;

public class multiply {
    public static int multiplyoftwonumber(int a, int b) {
        int result = a * b;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int product = multiplyoftwonumber(a,b);
        System.out.println(multiplyoftwonumber(a, b));
    }

}
