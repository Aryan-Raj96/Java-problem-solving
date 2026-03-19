public class arraysum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 50 };
        int sum = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            System.out.print(sum + arr[i]);
        }
    }

}
