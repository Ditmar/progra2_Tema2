package MyMath;

public class test {
	//7! = 7*6*5*4*3*2*1
	public test() {
		
	}
	public Integer factorial(Integer f) {
		if (f == 1) {
			return 1;
		}
		return factorial(f - 1) * f ;
	}
}
