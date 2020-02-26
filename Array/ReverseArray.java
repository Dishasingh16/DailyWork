package Array;

public class ReverseArray {
public static void main(String[] args) {
	int i,j;
	int[] arr= new int[]{10,20,30};
	System.out.println("before  " );
	
	for(i=0;i<arr.length;i++) {
		System.out.println(+arr[i]);
	}
	System.out.println("after  " );
	for ( j=arr.length-1;j>=0;j--) {
		System.out.println( +arr[j]);
	}
}
}
