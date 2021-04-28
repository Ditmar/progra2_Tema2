
public class Circle extends Shape{
	private Double radio;
	public Circle(String color, Double radio) {
		super(color);
		this.radio = radio;
	}
	@Override
	public Double area() {
		// TODO Auto-generated method stub
		return Math.PI * this.radio * this.radio;
	}
	
}
