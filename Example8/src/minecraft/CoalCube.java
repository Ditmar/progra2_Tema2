package minecraft;
//Cubo de carbon
public class CoalCube extends Cube{
	public CoalCube(Integer hard) {
		super(hard);
		this.setType("Carbon");
	}

	@Override
	public void destroy() {
		System.out.println("Se rompe y me da, un carbon");
	}

	@Override
	public void crafting() {
		// TODO Auto-generated method stub
		System.out.println("No pasa nada");
	}
	
}
