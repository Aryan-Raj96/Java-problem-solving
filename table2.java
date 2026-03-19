import java.util.*;

public class table2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int table_number = sc.nextInt();
        int multiplication;
        for (int i = 1; i <= 10; i++) {
            multiplication = table_number * i;
            System.out.println(multiplication);
        }

    }

}
