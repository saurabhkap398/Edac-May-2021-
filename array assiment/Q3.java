/*3. Write a program to shift every element of an array to
circularly right. E.g.-
INPUT : 1 2 3 4 5
OUTPUT : 5 1 2 3 4
4 5 1 2 3
3 4 5 1 2
2 3 4 5 1
1 2 3 4 5 */

public class Q3{
	public static void main(String args []){
		int arr [] = {1, 2, 3, 4, 5};
		int len = arr.length;
		for(int j = 1; j<=5; j++){
			int temp = arr[len-1];
			for(int i=len-1; i>0;i--){	
				arr[i] = arr[i-1];
			}
		arr[0]= temp;
		for(int a:arr) System.out.print(a+" ");
		System.out.println();
		}
		
		
	}
}