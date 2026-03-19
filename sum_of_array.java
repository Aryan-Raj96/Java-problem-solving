import java.util.*;

public class sum_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();

        System.out.println("Enter the 1st Array's Element");
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the 2nd Array's Element");
        int arr2[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }

        int sum[] = new int[n];
        for (int i = 0; i < n; i++) {
            sum[i] = arr1[i] + arr2[i];
        }

        System.out.println("the sum of two array is");
        for (int i = 0; i < n; i++) {
            System.out.print(sum[i] + " ");
        }
    }

}
