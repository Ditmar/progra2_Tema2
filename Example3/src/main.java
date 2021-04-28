import MyReader.MyReader;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ejemplo 2");
		MyReader myReader = new MyReader();
		Integer number = myReader.readerInt();
		System.out.println(number);
		Double numberDouble = myReader.readerDouble();
		System.out.println(numberDouble);
	}

}
