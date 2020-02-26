package Array;

public class Sorting {
public static void main(String[] args) {
	int []arr= new int[] {40,20,30,11};
	int temp;
	
	for(int i=0;i<arr.length;i++) {
		
		for ( int j=0;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
				}
		}
	}
		for ( int i=0;i<arr.length; i++) {
			System.out.println(arr[i]+"");
		}
				
	}
}

