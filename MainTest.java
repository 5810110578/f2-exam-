import java.util.ArrayList;

public class MainTest {// test function
    public MainTest(){
		//polymorhism

        ArrayList<Shape2D> shapes = new ArrayList<Shape2D>();
        Rectangle r1 = new Rectangle("R1", 2, 8);
		
		shapes.add(r1);
		//shapes.add(new Rectangle("R2", 3, 5));
        //shapes.add(new Circle("C1", 3));
        System.out.printf("Total area = %.2f\n", r1.getArea());
	}
}