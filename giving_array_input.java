import java.util.*;

public class giving_array_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking Size of Array input
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();

        // Taking Array input
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Taking output of array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

}
