package MyMath;

public class MyMath {
	private Double a;
	private Double b;
	private Vector av;
	private Vector bv;
	public MyMath() {
		
	}
	public MyMath(Double a, Double b) {
		this.a = a;
		this.b = b;
	}
	public MyMath(Vector a, Vector b) {
		this.av = a;
		this.bv = b;
	}
	public Double plus() {
		return this.a + this.b;
	}
	public Double plus(Double a, Double b) {
		return a + b;
	}
	public Vector plus(Vector a, Vector b) {
		Double x = a.getX() + b.getX();
		Double y = a.getY() + b.getY();
		Double z = a.getZ() + b.getZ();
		Vector result = new Vector(x, y, z);
		return result;
	}
	public Double subtract(Double a, Double b) {
		return a - b;
	}
	public Vector subtract(Vector a, Vector b) {
		Double x = a.getX() - b.getX();
		Double y = a.getY() - b.getY();
		Double z = a.getZ() - b.getZ();
		Vector result = new Vector(x, y, z);
		return result;
	}
	public Double multiply(Double a, Double b) {
		return a * b;
	}
	public Vector multiply(Vector a, Vector b) {
		Double x = a.getY() * b.getZ() - b.getY() * a.getZ();
		Double y = -(a.getX() * b.getZ() - b.getX() * a.getZ());
		Double z = a.getX() * b.getY() - b.getX() * a.getY();
		Vector result = new Vector(x, y, z);
		return result;
	}
	public Vector multiply() {
		Double x = this.av.getY() * this.bv.getZ() - this.bv.getY() * this.av.getZ();
		Double y = -(this.av.getX() * this.bv.getZ() - this.bv.getX() * this.av.getZ());
		Double z = this.av.getX() * this.bv.getY() - this.bv.getX() * this.av.getY();
		Vector result = new Vector(x, y, z);
		return result;
	}
}
