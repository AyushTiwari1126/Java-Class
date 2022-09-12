class Circle {
    public double radius;

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return Math.PI * 2 * radius;
    }

    public double circumference() {
        return perimeter();
    }
}

public class Circle1 {
    // properties : radius
    // methods : area(), perimeter(), circumference()
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        c1.radius = 10;
        c2.radius = 5;

        System.out.println("Area : " + c1.area());
        System.out.println("Perimeter : " + c1.perimeter());
        System.out.println("Circumference : " + c1.circumference());
        System.out.println();
        System.out.println("Area : " + c2.area());
        System.out.println("Perimeter : " + c2.perimeter());
        System.out.println("Circumference : " + c2.circumference());
    }
}
