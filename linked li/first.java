class node {
    int val;
    node next;

    node(int val) {
        this.val = val;

    }
}

public class first {
    public static void main(String[] args) {
        node a = new node(20);
        // a.val = 20;
        node b = new node(30);
        // b.val = 30;
        node c = new node(40);
        // c.val = 40;
        node d = new node(50);
        // d.val = 50;

        a.next = b;
        b.next = c;
        c.next = d;

        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(a.next);
        // System.out.println(c);
        // System.out.println(b.next);

        System.out.println(c);
        System.out.println(b.next);
        System.out.println(a.next.next);
        System.out.println(a.next.next.next.val);

    }

}
