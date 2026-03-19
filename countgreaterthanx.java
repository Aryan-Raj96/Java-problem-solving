public class countgreaterthanx {
    public static void main(String[] args) {
        int arr[] = { 12, 34, 56, 32, 55, 22, 45 };
        int count = 0;
        int x = 8;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        System.out.println(count);

    }

}
