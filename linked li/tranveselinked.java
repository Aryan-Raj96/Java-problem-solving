class node {
    int val;
    node next;

    node(int val) {
        this.val = val;
    }
}

public class tranveselinked {
    public static void display(node head) {
        node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        node a = new node(10);
        node b = new node(20);
        node c = new node(30);
        node d = new node(40);
        node e = new node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
    }

}
