
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle triangle = new Triangle("#000000", 25.5, 45.6);
		System.out.println(triangle.area());
		Circle circle = new Circle("#000000", 25.5);
		System.out.println(circle.area());
		
		//Polimorfismo
		Shape triangle2 = new Triangle("#000000", 25.5, 45.6);
		System.out.println(triangle2.area());
		Shape circle2 = new Circle("#000000", 25.5);
		System.out.println(circle2.area());
	}

}
