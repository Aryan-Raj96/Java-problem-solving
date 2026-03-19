class Complex {
    int x;
    int y;

    Complex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print() {
        if (y >= 0) {
            System.out.println(x + " +" + y + "i");
        } else {
            System.out.println(x + " " + y + "i");
        }
    }
}

public class complexnumber {
    public static void main(String[] args) {
        Complex c1 = new Complex(5, -1000);
        c1.print();
    }
}
