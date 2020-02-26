package Array;

public class OddEven {
public static void main(String[] args) {
	int []arr= new int[] {10,20,30,11};
	int []arr1= new int[] {};
	int []arr2= new int[] {};
	int max=0,min=0;
	
	for(int i=0;i<arr.length;i++) {
		if	(arr[i]%2==0) {
			
			System.out.println("evenn"+arr[i]);
		}if	(arr[i]%2!=0) {
			
			System.out.println("odd"+arr[i]);}
		//else
			
		//System.out.println(+arr[i]);
	}
		
			
}
}
