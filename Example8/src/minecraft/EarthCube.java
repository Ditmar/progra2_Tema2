package minecraft;
//Cubo de tierra
public class EarthCube extends Cube {
	public EarthCube(Integer hard) {
		super(hard);
		this.setType("Tierra");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Me da un cubo de tierra");
	}

	@Override
	public void crafting() {
		// TODO Auto-generated method stub
		System.out.println("No pasa nada");
	}
	
}
