class Outer {
    static int x = 10;
    int y = 20;

    static class Inner {
        void display() {
            System.out.println("x : " + x);
            // System.out.println("y : " + y);
            // (Cannot make a static reference to the non-static field y)
        }
    }
}

public class StaticClass {
    public static void main(String[] args) {
        Outer.Inner i = new Outer.Inner();
        i.display();
    }
}
