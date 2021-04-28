package MyReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class MyReader extends BufferedReader {
	public MyReader(Reader reader) {
		super(reader);
	}
	public MyReader() {
		super(new InputStreamReader(System.in));
	}
	public Integer readerInt() {
		try {
			Integer data = Integer.parseInt(this.readLine());
			return data;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public Double readerDouble() {
		try {
			Double data = Double.parseDouble(this.readLine());
			return data;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
