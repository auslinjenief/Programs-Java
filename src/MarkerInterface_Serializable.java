
//serializable --> It is used for permission purpose

import java.io.*;

class save implements Serializable
{
	int i;
}
public class MarkerInterface_Serializable {

	public static void main(String[] args) throws Exception {
		save obj1 = new save();
		obj1.i = 10;
		System.out.println("Value of object 1 is : "+obj1.i);
		
		File f  = new File("myfile.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj1);
		
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		save obj2 = (save)ois.readObject();
		System.out.println("Value of obj 2 is : "+obj2.i);
		
	}

}
