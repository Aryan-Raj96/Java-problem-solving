class car {
    String name;
    int wheel;
    double length;
}

public class objclasscar {
    public static void main(String[] args) {
        car c1 = new car();
        c1.name = "Innova";
        c1.wheel = 4;
        c1.length = 400;

        car c2 = new car();
        c2.name = "Swift";
        c2.wheel = 4;
        c2.length = 200;

        car c3 = new car();
        c3.name = "Fortuner";
        c3.length = 500;
        c3.wheel = 4;

        System.out.println(c3.name);
        c3.name = "Defender";
        System.out.println(c3.name);
    }
}