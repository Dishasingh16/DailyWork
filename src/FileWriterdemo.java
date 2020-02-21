import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileWriterdemo {

	public static void main(String[] args) throws IOException {
		String path="C:\\\\\\\\Users\\\\\\\\seed\\\\\\\\Desktop\\\\\\\\javascript\\\\\\\\file handling\\\\\\\\as.txt";
		Scanner sc = new Scanner(System.in);
		
		FileWriter out = new FileWriter(path, true);
		InputStreamReader ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(ir);
		String msg ="File writen data";
		String bookName ="Taken";
		String authorName ="john";
		String price ="200";
		
		System.out.println("1. display");
		System.out.println("2. add book");
		
		int c=sc.nextInt();
		switch (c) {
		
		case 1 :
				
				out.write(bookName+"\t"+authorName+"\t"+price+"\n");
				
				break;
		case 2 :
		
		   System.out.println("Enter the book name = ");
		   String bookname=br.readLine();
		   System.out.println("Enter the author namer = ");
		   String authorname=br.readLine();
		   System.out.println("Enter the price = ");
		   price=br.readLine();
		   
		   String message= bookname + " "+authorname + " "+price+ " \n" ;
			 
			   
				out.write(message);
				out.flush();
				
		}
		out.close();
	}
}
