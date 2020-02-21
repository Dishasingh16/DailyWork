import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {

	public static void main(String[] args) throws FileNotFoundException , IOException{
		String path="";
		FileOutputStream out = new FileOutputStream(path,true);
		
		String message = "this is a new day";
		byte b[]=message.getBytes();
		out.write(b);
		out.close();
	}
}
