package binarySearch;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int[] newInput = new int[array.length / 2];
		
		arraycopy(array, newInput,  array.length / 2);
		
		for (int i=5 ; i<=20 ; i++){
			System.out.println(i +" - " + search(i , array, array.length));	
		}
	}
	
	public static int search(int n , int[] input , int location){
		int j = 0;
		if(input[0] == n){
			j =0;
		}
		else if(n < input[location/2]){
			if (input.length == 2){
				j=1;
			}
			else {
				int[] newInput = new int[input.length /2];
				arraycopy(input, newInput, 0);
				j = search( n , newInput ,location/2);
			}
		}
		
		else if(input[location/2] <= n){
			int[] newInput = new int[input.length /2 + input.length %2];
			arraycopy(input, newInput, location/2);
			j =location/2 + search( n , newInput ,location/2+ input.length %2);
		}
		return j;
	}
	
	static void arraycopy(int[] src,  int[] dst, int from) {
	    for (int i = 0; i < dst.length; i++) {
	        dst[i] = src[from + i];
	    }
	}
}
