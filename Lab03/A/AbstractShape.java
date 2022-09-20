public abstract class AbstractShape implements TwoDShape,ThreeDShape {

    protected static int numShapesCreated = 0;

    protected void incrementNumShapesCreated() {
        numShapesCreated++;
    }

    static int getNumShapesCreated() {
        return numShapesCreated;
    }

    public abstract double area();
    public abstract double perimeter();
    public abstract double volume();

}
