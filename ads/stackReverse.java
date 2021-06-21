class stack
{
	int top =-1;
	int size;
	char a[];
	char b[];
	
	stack(int len)
	{
		size = len;
		a = new char[size];
		b = new char[size];
	}
	
	boolean isFull()
	{
		if(top==size-1)
			return true;
		return false;
	}
	
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		return false;
	}
	
	void push(char x)
	{
		if(isFull())
		{
			System.out.println("FULL");
		}
		else
		{
			a[++top] = x;
		}
	}
	
	char pop()
	{
		char t=' ';
		if(isEmpty())
		{
			System.out.println("EMpty");
		}
		else
		{
			 t = a[top--] ;
			//System.out.println(t+"is popped");
		}
		
		return t;
		
	}
	
	void display()
	{
		for(int i=0;i<=top;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	
	void deletemid(int count)
	{
		int n = count/2;
		char b[] = new char[n];
		for(int i =0 ;i<n;i++)
		{
			b[i] = pop();
			
		}
		
		pop();
		
		for(int i =b.length-1 ;i>=0;i--)
		{
			push(b[i]);
		}
	}
	/*
	void MaxElement()
	{
		char max =0;
		
		for(int i=top;i>=0;i--)
		{
			if(a[i]>max)
			{
				max =a[i];
			}
		}
		System.out.println("max "+max);
		
	}*/
}
public class stackReverse {

	public static void main(String[] args) {
		String str =  "12345";
		int count=0;
		
		stack st = new stack(str.length());
		
		for(int i=0;i<str.length();i++)
		{
			char temp = str.charAt(i);
			
			st.push(temp);
			count++;
			
		}
		st.display();
		System.out.println();
		
		//deleting mid
		 
		  st.deletemid(count); st.display();
		 
		System.out.println();
		//st.MaxElement();
		
		//*reverse of stack*//
		
	/*  for(int i=0;i<str.length();i++) 
		  { 
			  System.out.print(st.pop()+" "); 
		  }
		
		*/
	}

}