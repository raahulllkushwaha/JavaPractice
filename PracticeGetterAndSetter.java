class myCylinder {
    private int height;
    private int radius;

    public myCylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double surfaceOfCylinder() {
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius;
    }

    public double volumeOfCylinder() {
        return Math.PI * radius * radius * height;
    }
}

// Second class for Rectangle

class Rectangle {
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 5;
        this.breadth = 6;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class PracticeGetterAndSetter {
    public static void main(String[] args) {
        myCylinder cyn = new myCylinder(9, 5);
        Rectangle r = new Rectangle();
        Rectangle r1 = new Rectangle(4, 5);
        // cyn.setHeight(9);
        System.out.println("Height of the cylinder is: " + cyn.getHeight());
        // cyn.setRadius(5);
        System.out.println("Radius of the cylinder is: " + cyn.getRadius());
        System.out.println("Surface area of a Cylinder is: " + cyn.surfaceOfCylinder());
        System.out.println("Volume of a Cylinder is: " + cyn.volumeOfCylinder());
        // r.setLength(0);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());
    }
}
