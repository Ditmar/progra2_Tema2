import minecraft.CoalCube;
import minecraft.Cube;
import minecraft.EarthCube;
import minecraft.StoneCube;
import minecraft.WoodCube;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//CoalCube carbon = new CoalCube(7);
		//EarthCube tierra = new EarthCube(3);
		minar(new CoalCube(7));
		minar(new EarthCube(3));
		minar(new StoneCube(7));
		minar(new WoodCube(3));
	}
	public static void minar(Cube minecraftCube) {
		Integer len = minecraftCube.getHard();
		for (Integer i = 0; i < len; i++) {
			minecraftCube.picar();
		}
	}

}
