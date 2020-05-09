
public class Cylinder extends Shape3D {	//concrete class
    private double radius;
    private double hight;

	public Cylinder(String name, double radius,double hight){
		super(name);
        this.radius = radius;
        this.hight = hight;
	}

	public double getRadius(){
		return radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
    }

    public double getHight(){
		return hight;
	}

	public void setHight(double hight){
		this.hight = hight;
	}

	public double getArea(){
		return (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * hight); 
    }

    public double getVolume(){
		return Math.PI * radius * radius * hight; 
    }

}