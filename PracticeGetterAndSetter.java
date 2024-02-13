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

public class PracticeGetterAndSetter {
    public static void main(String[] args) {
        myCylinder cyn = new myCylinder(9,5);
        // cyn.setHeight(9);
        System.out.println("Height of the cylinder is: " + cyn.getHeight());
        // cyn.setRadius(5);
        System.out.println("Radius of the cylinder is: " + cyn.getRadius());
        System.out.println("Surface area of a Cylinder is: " + cyn.surfaceOfCylinder());
        System.out.println("Volume of a Cylinder is: " + cyn.volumeOfCylinder());
    }
}
