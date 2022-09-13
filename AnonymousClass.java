// abstract class myClass 
interface myClass {
    public void show();
}

class Outer {
    public void display() {
        // myClass my = new myClass()
        new myClass() {
            public void show() {
                System.out.println("Hello");
            }
        }.show();
        // my.show();
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.display();
    }
}
