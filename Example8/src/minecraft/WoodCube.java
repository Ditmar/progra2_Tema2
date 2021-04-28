package minecraft;
//Cubo de madera
public class WoodCube extends Cube{
	public WoodCube(Integer hard) {
		super(hard);
		this.setType("Madera");
	}
	
	@Override
	public void destroy() {
		System.out.println("Me da un cubo de madera");
		
	}

	@Override
	public void crafting() {
		// TODO Auto-generated method stub
		System.out.println("Me da cuatro cubos de tablones");
	}
	
}
