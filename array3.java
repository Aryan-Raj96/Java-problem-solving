public class array3 {
    public static void main(String[] args) {
        int arr[] = { 23, 42, 13, 12, 21223, 3, 342, 44, 23, 22, 3, 32 };
        int x = 32;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                flag = true;
                break;
            }
        }
        if (flag == false) {
            System.out.println("Nahi mila");
        } else {
            System.out.println("mil gaya");
        }
    }
}
