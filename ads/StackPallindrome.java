package ADS;
import java.util.Scanner;
public class StackPallindrome {
	int size;
	int top;
	int arr[];
		public StackPallindrome(int a){//5
			size =a;
			top=-1;
			arr =new int [a];
		}
		
		void push(int b) {//top==size 
			if(isFull()) {
				System.out.println("Stack is full");
			}
			else 
			arr[++top]=b;
		}
		
		public void pop() {//top==size
			if(isEmpty()) {
				System.out.println("Stack is empty");
			}
			else {
				//System.out.println(arr[top]);
			top--;}
		}
		
		public int peek() {
		return arr[top];
		}
		
		public boolean isEmpty() {
			if(top==-1)
				return true;
			else return false;
		}
		
		public boolean isFull() {
			if(top==size-1)
				return true;
			else return false;
		}
		public void display() {
			for(int i=0;i<=top;i++) {
				System.out.print(arr[i]+" ");
			}
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String s="ana";
			StackPallindrome st=new StackPallindrome(s.length());
			for(int i=0;i<s.length();i++) {
				st.push(s.charAt(i));
			}
			
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)==st.peek()) {
					st.pop();
				}
				else break;
			
			}
			if(st.isEmpty()) {
				System.out.println("pallindrome");
			}
			else System.out.println("not pallindrome");
			
		}

	}