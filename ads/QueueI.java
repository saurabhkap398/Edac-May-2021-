public class QueueI {

	int size;
	int arr[];
	int front;
	int rear;
	int n;
	
	public QueueI(int s) {
		size=s;
		arr=new int[s];
		front=0;
		rear=0;
		n=0;
	}
	public int peek() {
		return arr[front];
	}
	public void enque(int a) {
		if(rear<=size-1&&n<size) {
			arr[rear]=a;
			rear++;
			n++;
			//System.out.println(n+"  "+rear);
		}
		else 
			System.out.println("Que is full");
	}
	public void deque() {
		if(isEmpty()) {
			System.out.println("Que is Empty");
		}
		else
		if(n>0) {
			int temp=arr[front];
			for(int i=front;i<rear-1;i++) {
				arr[i]=arr[i+1];
			}
			rear--;
			n--;
			//System.out.println(n+"  "+rear);
			System.out.println("Element removed = " +temp);
		}
		
	}
	public boolean isEmpty() {
		if(n==0)
			return true;
		else return false;
	}
	
	public boolean isFull() {
		if(n==size)
			return true;
		else return false;
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Que empty");
		}
		else {
		for(int i=front;i<rear;i++) {
			if(arr[i]>0) {
				System.out.print(arr[i]+" ");
			}
		}}
	}
	
	public void stackInsert(QueueI b,int data) {//10,20,30,40,
		b.enque(data);
		
		for(int i=0;i<b.rear-1;i++) {
			int temp=b.peek();
			b.deque();
			b.enque(temp);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		//---------------------------stack using Queue-------------
		
		QueueI second=new QueueI(5);
		
	
		second.stackInsert(second, 40);
		second.stackInsert(second, 30);
		second.stackInsert(second, 50);
    second.deque();
		second.display();
	}

}