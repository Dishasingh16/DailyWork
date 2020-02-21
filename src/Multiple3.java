import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class Multiple3 {


	public static void main(String[] args) throws IOException {
		String path1="C:\\Users\\seed\\Desktop\\javascript\\file handling\\cse.txt";
		String path2="C:\\Users\\seed\\Desktop\\javascript\\file handling\\it.txt";
		String path3="C:\\Users\\seed\\Desktop\\javascript\\file handling\\ec.txt";
		String path4="C:\\Users\\seed\\Desktop\\javascript\\file handling\\me.txt";
		
		
		FileInputStream fin1 = new FileInputStream(path1);
		FileInputStream fin2 = new FileInputStream(path2);
		FileInputStream fin3 = new FileInputStream(path3);
		FileInputStream fin4 = new FileInputStream(path4);
		
		Vector vector =new Vector();
		vector.add(fin1);
		vector.add(fin2);
		vector.add(fin3);
		vector.add(fin4);
	 
		Enumeration en = vector.elements();
		
	SequenceInputStream sis = new SequenceInputStream(en);
	int i;
	while((i=sis.read()) !=-1) {
		
		System.out.print((char)i);
		
	}
}
}