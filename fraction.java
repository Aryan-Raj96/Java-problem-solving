class fractions {
    int num;
    int deno;

    fractions(int num, int deno) {
        this.num = num;
        this.deno = deno;

    }

    void print() {
        System.out.println(num + "/" + deno);
    }
}

public class fraction {
    public static void main(String[] args) {
        fractions f1 = new fractions(3, 5);
        f1.print();
    }
}
