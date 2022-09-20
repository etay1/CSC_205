public class Circle extends AbstractShape {

    protected static int numCirclesCreated = 0;
    private double radius;

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
            incrementNumCirclesCreated();
            incrementNumShapesCreated();
        }
    }

    public double area() {
        double area = Math.pow(radius,2) * Math.PI;
        return area;
    }

    public double perimeter() {
        double perimeter = 2*Math.PI*radius;
        return perimeter;
    }

    public double volume() {
        return 0.0;
    }

    protected void incrementNumCirclesCreated() {
        numCirclesCreated++;
    }

    protected void incrementNumShapesCreated() {
        numShapesCreated++;
    }

    public int getNumCreated() {
        return numCirclesCreated;
    }

}

