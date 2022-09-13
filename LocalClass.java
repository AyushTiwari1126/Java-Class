class Outer {
    public void display() {
        class Inner {
            public void show() {
                System.out.println("Hello");
            }
        }
        // Inner i = new Inner();
        new Inner().show();
        // i.show();
    }
}

public class LocalClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();
    }
}
