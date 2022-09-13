public class Circle extends AbstractShape {

	private static int numCirclesCreated = 0;
	
	private double radius;
	
	public Circle(double rad) {
		
		radius = rad;
		incrementNumCirclesCreated();
		incrementNumShapesCreated();
	}
	
	public double area() {
		double area = (radius*radius)*Math.PI;
		return area;
	}
	
	public double perimeter() {
		double perimeter = 2*Math.PI*radius;
		return perimeter;
	}
	
	public double volume() {
		return 0.0;
	}
	
	private void incrementNumCirclesCreated() {
		numCirclesCreated++;
	}
	
	protected void incrementNumShapesCreated() {
		numShapesCreated++;
	}
	
	public int getNumCreated() {
		return numCirclesCreated;
	}
	
	
}

public class Cuboid extends AbstractShape {

	static int numCuboidsCreated;
	private double length;
	private double width;
	private double height;
	
	public Cuboid(double len, double wid, double hght) {
		
		length = len;
		width = wid;
		height = hght;
		incrementNumCuboidsCreated();
		incrementNumShapesCreated();
	}
	
	public double area() {
		
		double area = 2*(length*width+width*height+height*length);
		return area;
		
	}
	
	public double perimeter() {
		
		return 0.0;
		
	}
	
	public double volume() {
		
		double volume = length*width*height;
		return volume;
		
	}
	
	private void incrementNumCuboidsCreated() {
		numCuboidsCreated++;
	}
	
	protected void incrementNumShapesCreated()
	 {
		numShapesCreated++;
	 }
	
	public int getNumCreated() {
		
		return numCuboidsCreated;
		
	}
	
	
}

public class Sphere extends AbstractShape {
	
	private double radius;
	static int numSpheresCreated;
	
	public Sphere(double rad) {
		radius = rad;
		incrementNumSpheresCreated();
		incrementNumShapesCreated();
	}
	
	public double area() {
		
		double area = 4.0*Math.PI*radius*radius;
		return area;
		
	}
	
	public double perimeter() {
		return 0.0;
	}
	
	public double volume() {
		
		double volume = 4.0*Math.PI*radius*radius*radius;
		return volume;
		
	}
	
	private void incrementNumSpheresCreated() {
		numSpheresCreated++;
	}
	
	protected void incrementNumShapesCreated()
	 {
		numShapesCreated++;
	 }
	
	public int getNumCreated() {
		return numSpheresCreated;
	}
	
	
}

