package minecraft;
//Cubo de piedra
public class StoneCube extends Cube {
	public StoneCube(Integer hard) {
		super(hard);
		this.setType("Piedra");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("Me da un cubo de Piedra");
	}

	@Override
	public void crafting() {
		// TODO Auto-generated method stub
		System.out.println("No pasa nada");
	}
	
}
