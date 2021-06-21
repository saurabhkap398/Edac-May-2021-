class stack
{
	int top=-1;
	int size;
	char a[];
	
	stack(int len)
	{
	size = len;
	a=new char[size];
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
			System.out.print("Full");
		}
		else{
		a[++top]=x;
		}
	}
	char pop()
	{
	char t = ' ';
	if (isEmpty())
	{
		System.out.print("Empty");
	}
		else{
		t=a[top--];}
		return t;
	}
	
	void display()
	{
	for(int i=0;i<size;i++)
	{
	System.out.print(a[i]+" ");
	}
	}
	
}

class re_stack
{
	public static void main(string []args)
	{
	String str= "saurabh";
	Stack st = new Stack(str.lenght);
	for (int i=0;i<str.lenght();i++)
		{
		char temp = str.charAt(i);
		st.display();
		System.out.println();
		for (int i= 0;i<str.lenght;i++)
		{
		System.out.print(st.pop()+" ");
		}
		}
		}
		}
		
