class Cricketer {
    final static String Country = "nz";
    int runs;
    String name;
    double avg;

    static void greet() {
        System.out.println("Jassi bahi");
    }
}

public class sstatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        // c1.Country = "India";
        System.out.println(c1.Country);
        fun();
        c1.greet();
        Cricketer.greet();
    }

    public static void fun() {
        System.out.println("this is fun");
    }

}
