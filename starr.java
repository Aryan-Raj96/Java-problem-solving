import java.util.*;

public class starr {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of row's star");
        int row = sc.nextInt();

        System.out.println("Enter the no of column star's");
        int column = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
