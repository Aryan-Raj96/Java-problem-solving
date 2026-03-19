class Cricketer {
    final String Country = "India";
    int runs;
    String Name;
    double avg;

}

public class finalandstatic {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer();
        System.out.println(c1.Country);
        // c1.Country = "England";
        System.out.println(c1.Country);
    }

}
