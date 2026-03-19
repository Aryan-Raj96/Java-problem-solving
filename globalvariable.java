public class globalvariable {
    static int x = 10;

    public static void main(String[] args) {
        fun();
        x = 9;
        System.out.println(x);
        x = 6;
    }

    public static void fun() {
        x = 20;
        System.out.println(x);

    }

}
