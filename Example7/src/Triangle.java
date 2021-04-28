
public class Triangle extends Shape {
	private Double heigth;
	private Double base;
	public Triangle(String color, Double heigth, Double base) {
		super(color);
		this.heigth = heigth;
		this.base = base;
	}
	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return this.heigth * this.base / 2;
	}
}
