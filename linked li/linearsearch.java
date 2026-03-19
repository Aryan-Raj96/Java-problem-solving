import java.util.*;

public class linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Element of Array");

        int n = sc.nextInt();
        int arr[] = new int[n];
        int element = 5;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == element) {
                System.out.println("found that element in that array");
            } else {
                System.out.println("not found that element in that array");
            }
        }
    }

}
