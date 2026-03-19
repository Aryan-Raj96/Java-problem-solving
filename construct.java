class Car {
    int price;
    String Name;

    Car(String s, int p) {
        Name = s;
        price = p;
    }

    Car(int t, String k) {
        price = t;
        Name = k;
    }

    void print() {
        System.out.println(Name + " " + price);
    }

}

public class construct {
    public static void main(String[] args) {
        Car c1 = new Car("lord alto", 40000);
        c1.print();

        Car c2 = new Car(1250000, "Kia sonet");
        c2.print();
    }

}
