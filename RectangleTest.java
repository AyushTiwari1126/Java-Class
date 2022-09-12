class Rectangle {
    private double length;
    private double width;

    public double getlength() {
        return length;
    }

    public double getwidth() {
        return width;
    }

    public void setlength(double l) {
        if (l >= 0)
            length = l;
        else
            length = 0;
    }

    public void setwidth(double w) {
        if (w >= 0)
            width = w;
        else
            length = 0;
    }

    public double area() {
        // return length * width;
        return getlength() * getwidth();
    }

    public double perimeter() {
        return 2 * (length + width);
    }

    public boolean isSquare() {
        if (length == width) {
            return true;
        } else {
            return false;
        }
    }
}

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        // r.length = 5;
        // r.width = 5;

        r.setlength(-10.5);
        r.setwidth(5.2);

        System.out.println("Area : " + r.area());
        System.out.println("perimeter : " + r.perimeter());
        System.out.println("Is it a square : " + r.isSquare());

        System.out.println("Length : " + r.getlength());
        System.out.println("Width : " + r.getwidth());
    }
}
