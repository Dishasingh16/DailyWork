import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputDemo {

	public static void main(String[] args)throws IOException {
		String path="C:\\\\\\\\Users\\\\\\\\seed\\\\\\\\Desktop\\\\\\\\javascript\\\\\\\\file handling\\\\\\\\fone.txt";
		String newPAth="C:\\Users\\seed\\Desktop\\javascript\\file handling\\newfone.txt";
		File file = new File(path);
		FileInputStream in= new FileInputStream(file);
		BufferedInputStream bin = new BufferedInputStream(in);
		FileOutputStream out = new FileOutputStream(newPAth);
		BufferedOutputStream bout = new BufferedOutputStream(out);
		int i;
		while((i=in.read()) !=-1) {
			out.write(i);
			//System.out.println((char) i);
		}
		
		bout.close();close();
		/*System.out.println("FIlE Name : " +file.getName());
		System.out.println("FIlE length : " +file.length());
		System.out.println("FIlE Name : " +file.getParent());*/
		
	}
}
