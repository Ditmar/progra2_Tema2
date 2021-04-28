package minecraft;
//Cubo base
public abstract class Cube {
	private Integer heigth;
	private Integer width;
	private Integer x;
	private Integer y;
	private Integer z;	
	private String type;
	private Integer hard;
	
	
	public Cube(Integer hard) {
		this.heigth = 1;
		this.width = 1;
		this.hard = hard;
	}
	public Integer getHeigth() {
		return heigth;
	}
	public Integer getWidth() {
		return width;
	}
	public String getType() {
		return type;
	}
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	public Integer getZ() {
		return z;
	}
	public void setZ(Integer z) {
		this.z = z;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Integer getHard() {
		return this.hard;
	}
	public void setHard(Integer hard) {
		this.hard = hard;
	}
	public void picar() {
		if (this.hard > 1) {
			this.hard--;
			System.out.println("Picando " + this.hard);
		} else {
			this.destroy();
		}
	}
	public abstract void destroy();
	public abstract void crafting();
}
