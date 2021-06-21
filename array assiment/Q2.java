/*2. Take an array of 10 elements. Split it into the middle and
store the elements in two different arrays. E.g.-
INITIAL array :
1 2 3 4 5 6 7 8 9 10*/

public class Q2{
	public static void main(String args []){
		int arr [] = {1,2 , 3, 4, 5, 6, 7, 8, 9, 10};
		int len = arr.length;
		int arr1[] = new int[len/2];
		int arr2[] = new int[len/2];
		int x = 0, y=0;
		
		for(int i=0;i<len;i++){
			if(i<(len/2)){
				arr1[x] = arr[i];
				x++;	
			}else{
				arr2[y] = arr[i];
				y++;
			}
		}
		System.out.print("Array 1:");
		for(int a : arr1) System.out.print(a+" ");
		System.out.print("\nArray 2:");
		for(int a : arr2) System.out.print(+a+" ");
	}
}
