class node {
    int val;
    node next;

    node(int val) {
        this.val = val;
    }
}

public class displaylinkedlist {
    public static void display(node head) {
        System.out.print(head.val + " ");
        System.out.print(head.next.val + " ");
        System.out.print(head.next.next.val + " ");
        System.out.print(head.next.next.next.val + " ");
        System.out.print(head.next.next.next.next.val);
    }

    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(50);
        node f = new node(60);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
    }

}
