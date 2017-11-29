package dayeleven;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialDemo1 {

	public static void main(String[] args) {
		FileOutputStream fos=null;
		ObjectOutputStream oos=null;
		try {
			Customer custmoer=new Customer("sairam", 7997564.00);
		fos=new FileOutputStream("/home/tsuser/Desktop/CustomerData.txt");
		oos=new ObjectOutputStream(fos);
		oos.writeObject(custmoer);
		System.out.println("Success");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				oos.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
