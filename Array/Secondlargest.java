package Array;
//incomplete
public class Secondlargest {
public static void main(String[] args) {
	int []arr= new int[] {10,20,30};
	int max=0,max1=0;
	
	for(int i=0;i<arr.length;i++) {
		if	(arr[i]>max) 
		max=arr[i];}
		System.out.println("max  "+max);
	
for(int i=0;i<arr.length;i++) {
	if	(arr[i]>max1) 
	max1=arr[i];}
	System.out.println("second largest   "+max);

}
}
