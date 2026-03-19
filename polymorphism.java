class human {
    void speak() {
        System.out.println("Hello");
    }
}

class lion {
    void speak() {
        System.out.println("Grrr");
    }
}

class cat {
    void speak() {
        System.out.println("Meoww");
    }
}

class pickachu {
    void speak() {
        System.out.println("piku piku");
    }
}

public class polymorphism {
    public static void main(String[] args) {
        human h = new human();
        h.speak();

        cat c = new cat();
        lion l = new lion();
        pickachu p = new pickachu();

        c.speak();
        l.speak();
        p.speak();

    }

}
