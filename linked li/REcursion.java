public class REcursion {
    public static void main(String[] args) {
        // message();
        message2();

    }

message();{

    static void message() {
        System.out.println("hello world");
        message1();
    }

    static void message1() {
        System.out.println("hello world");
    }

    static void message2() {
        System.out.println("hello world");
        message3();
    }

    static void message3() {
        System.out.println("hello world");
    }
}
}
