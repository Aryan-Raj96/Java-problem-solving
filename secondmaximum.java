public class secondmaximum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 3, 4, 8, 6, 7, 8, 5 };
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondmax && arr[i] != max)
                secondmax = arr[i];
        }
        System.out.println(max);
        System.out.println(secondmax);
    }
}
