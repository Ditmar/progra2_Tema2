
import MyMath.*;
import MyMath.MyMath;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath myMath = new MyMath();
		
		Vector a = new Vector(8.7, 5.6, 7.8);
		Vector b = new Vector(5.7, 7.6, -1.8);
		Double r = myMath.multiply(2.0, 3.5);
		Vector rv = myMath.multiply(a, b);
		System.out.println("x = " + rv.getX() + " y = " + rv.getY() + " z= " + rv.getZ());
		MyMath myMath2 = new MyMath(a, b);
		rv = myMath2.multiply();
		System.out.println("x = " + rv.getX() + " y = " + rv.getY() + " z= " + rv.getZ());
		String abc = new String("");
		
	}

}
