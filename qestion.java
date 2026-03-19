import java.util.*;

public class qestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mark's of student");
        int marks = sc.nextInt();

        int arr[] = new int[marks];
        for (int i = 0; i < marks; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < marks; i++) {
            if (arr[i] > 35) {
                System.out.println(arr[marks]);
            }

        }
    }

}
