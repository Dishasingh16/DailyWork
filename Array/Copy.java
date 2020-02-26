package Array;

public class Copy {
public static void main(String[] args) {
	int []arr1=new int[] {10,11,12};
	int arr2[]=new int[arr1.length];
	int i;
	for( i=0;i<arr1.length;i++) {
		arr2[i]=arr1[i];
	}
	for( i=0;i<arr1.length;i++) {
System.out.println("elements of array 1 :" +arr1[i]);}
	for( i=0;i<arr2.length;i++) {
System.out.println("elements of array 2 :" +arr2[i]);
	}
}
}

