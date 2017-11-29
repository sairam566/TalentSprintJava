package dayeleven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) {

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream("/home/tsuser/Desktop/CustomerData.txt");
			ois = new ObjectInputStream(fis);
			Object obj = ois.readObject();
			Customer customer = (Customer) obj;
			System.out.println(customer);
		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
