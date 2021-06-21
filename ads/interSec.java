class node1
{
		     int data;
		node1 next;
		node1 head;

		node1()
		{
			data=0;
			next = null;
			head = null;
		}
	
		node1(int x)
		{
		data = x;
		next = null;
		}
	
	void addE(int x)
	{
			//node1 head;
			node1 newnode = new node1(x);
			if(head==null)
				{
					head=newnode;
				}
			else
				{
					node1 temp = head;
					while(temp.next !=null)
						{
						temp = temp.next;
						}
						temp.next = newnode;
				}
	 }
	 
	 
	 void display()
		{
			node1 temp = head;
			while(temp !=null)
			{
			System.out.print(temp.data +" ");
			temp = temp.next;
			}
			
		}
		
	

	void intr(node1 l1, node1 l2)
	{
		node1 temp1 = l1.head;
		node1 temp2 = l2.head;
		while (temp1!=null)
		{
			while(temp2!=null)
			{
				if(temp1.data != temp2.data)
				{
				temp2= temp2.next;
				}
				else
				{
				System.out.print(temp1.data + " ");
				break;
				}
			}
			temp2= l2.head;
			temp1= temp1.next;

		}
	 }
}

public class interSec{

public static void main (String [] args)
{
node1 l1 = new node1();
l1.addE(10);
l1.addE(20);
l1.addE(30);
l1.addE(40);



l1.display();
System.out.println();

node1 l2 = new node1();
l2.addE(110);
l2.addE(220);
l2.addE(30);
l2.addE(420);
l2.display();

System.out.println();

l2.intr(l1,l2);

}}