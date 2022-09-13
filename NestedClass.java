class Outer {
    int x = 10;
    Inner i = new Inner();
    class Inner {
        int y = 20;

        public void InnerDisplay() {
            System.out.println("x : " + x);
            System.out.println("y : " + y);
        }
    }

    public void OuterDisplay() {
        // Inner i = new Inner();
        i.InnerDisplay();
        System.out.println("Compile time class file created : " + i);
    }
}

public class NestedClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.OuterDisplay();
        Outer.Inner i = new Outer().new Inner();
    }
}
