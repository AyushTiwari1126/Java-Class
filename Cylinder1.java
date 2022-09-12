class Cylinder {
    public float radius;
    public float height;

    public float lidArea() {
        return (float) Math.PI * radius * radius;
    }

    public float totalSA() {
        return (float) Math.PI * 2 * radius * (height + radius);
    }

    public float volume() {
        return (float) Math.PI * radius * radius * height;
    }

    public float curvedSA() {
        return 2 * (float) Math.PI * radius * height;
    }
}

public class Cylinder1 {
    public static void main(String[] args) {

        Cylinder c = new Cylinder();

        c.radius = 2.52f;
        c.height = 6.2f;

        System.out.println("Lid Area : " + c.lidArea());
        System.out.println("Total SA : " + c.totalSA());
        System.out.println("Curved SA : " + c.curvedSA());
        System.out.println("Volume : " + c.volume());
    }
}
