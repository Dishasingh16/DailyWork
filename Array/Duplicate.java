package Array;

public class Duplicate {
public static void main(String[] args) {
	int []arr= new int[] {10,20,10};
	int count = 0;
	
	for(int i=0;i<arr.length;i++) {
		for ( int j=arr.length-1;j>=0;j--) {
		
		if	(arr[i]==arr[j]) {
		++count;		
		//System.out.println();
		
		}}}System.out.println(count+" duplicate value " );
		

	

}}