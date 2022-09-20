public class Sphere extends AbstractShape {

    private double radius;
    protected static int numSpheresCreated;

    public Sphere (double radius) {
        if (radius > 0) {
            this.radius = radius;
            incrementNumSpheresCreated();
            incrementNumShapesCreated();
        }
    }

    public double area() {
        double area = 4.0*Math.PI*radius*radius;
        return area;
    }

    public double perimeter() {
        return 0.0;
    }

    public double volume() {
        double volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);
        return volume;
    }

    protected void incrementNumSpheresCreated() {
        numSpheresCreated++;
    }

    protected void incrementNumShapesCreated() {
        numShapesCreated++;
    }

    public int getNumCreated() {
        return numSpheresCreated;
    }

}
