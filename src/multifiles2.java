import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class multifiles2 {


	public static void main(String[] args) throws IOException {
		String path1="C:\\Users\\seed\\Desktop\\javascript\\file handling\\cse.txt";
		String path2="C:\\Users\\seed\\Desktop\\javascript\\file handling\\it.txt";
		String path3="C:\\Users\\seed\\Desktop\\javascript\\file handling\\ec.txt";
		String path4="C:\\Users\\seed\\Desktop\\javascript\\file handling\\me.txt";
		
		
		FileInputStream fin1 = new FileInputStream(path1);
		FileInputStream fin2 = new FileInputStream(path2);
		
	
	
	
	SequenceInputStream sis = new SequenceInputStream(fin1,fin2);
	int i;
	while((i=sis.read()) !=-1) {
		
		System.out.print((char)i);
		
	}
	
	
	
	}
}