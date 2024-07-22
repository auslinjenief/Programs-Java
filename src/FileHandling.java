import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		File f = new File("demo.txt");
		//creating a new file
		if(f.createNewFile()){
			System.out.println("File created");
		}
		else {
			System.out.println("Already created :"+f.getName());
		}
		
		//writing
		String in[] = {
				"Hii",
				"Hello, nice to meet you",
				"Good....!!"
		};
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		for(String str : in) {
			dos.writeUTF(str);
		}
		System.out.println("File updated successfully");
		
		//read
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		while(dis.available()>0) {
			String s = dis.readUTF(dis);
			System.out.println(s);
		}
		
		//Methods
		System.out.println(f.getName());
		System.out.println(f.getAbsolutePath());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.length());
		
		//delete
//		f.delete();
		
		dos.close();
		dis.close();
	}

}
 