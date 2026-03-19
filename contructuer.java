class Cars {
    String name;
    int seat;
    double Model;

    Cars(String s, int n, double m) {
        name = s;
        seat = n;
        Model = m;
        System.out.println(name + " " + seat + " " + Model);
    }
}

public class contructuer {
    public static void main(String[] args) {

        Cars c1 = new Cars("Kiasonet", 5, 2026);
        Cars c2 = new Cars("Kia seltos", 5, 2025);
        Cars c = new Cars("Toyata Fortuner", 8, 2026);
        System.out.println(c.name);

    }

}
