public class Circle extends Shape2D {	//concrete class
	private double radius;

	public Circle(String name, double radius){
		super(name);
		this.radius = radius;
	}

	public double getRadius(){
		return radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}

	public double getArea(){
		return Math.PI * radius * radius* radius*4/3; // 4/3(πr3)


	}

	public static void main(String[] args){
		Circle c = new Circle("C1", 2);
		System.out.println("Area of " +  c.getName() + " is " + c.getArea());
	}
}