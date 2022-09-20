public class Cuboid extends AbstractShape {

    protected static int numCuboidsCreated;
    private double length;
    private double width;
    private double height;

    public Cuboid(double length, double width, double height) {
        if (length > 0 && width > 0 && height > 0 ) {
            this.length = length;
            this.width = width;
            this.height = height;
            incrementNumCuboidsCreated();
            incrementNumShapesCreated();
        }
    }

    public double area() {

        double area = 2 * (length * width + width * height + height * length);
        return area;
    }

    public double perimeter() {

        return 0.0;
    }

    public double volume() {

        double volume = length * width * height;
        return volume;
    }

    protected void incrementNumCuboidsCreated() {
        numCuboidsCreated++;
    }

    protected void incrementNumShapesCreated() {
        numShapesCreated++;
    }

    public int getNumCreated() {

        return numCuboidsCreated;
    }

}
