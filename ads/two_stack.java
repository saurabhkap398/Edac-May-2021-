import java.util.*;
class TwoStack
{
  int arr[];
  int top1, top2;
  int size;
    TwoStack (int size)
  {
    this.size = size;
    this.arr = new int[size];
      top1 = -1;
      top2 = size / 2;
  }

  public boolean isFull1 ()
  {
    if (top1 == (size / 2) - 1)
      {
	return true;
      }
    return false;
  }
  public boolean isFull2 ()
  {
    if (top2 == size - 1)
      {
	return true;
      }
    return false;
  }
  public boolean isEmpty1 ()
  {
    if (top1 == -1)
      {
	return true;
      }
    return false;
  }
  public boolean isEmpty2 ()
  {
    if (top1 == (size/2)){
	    return true;
    }
    return false;
  }
  public void push1(int data){
      if(isFull1()){
         System.out.println("Overflow first stack"); 
      }
      else{
          arr[++top1]= data;
      }
  }
  
  public void push2(int data){
      if(isFull2()){
         System.out.println("Overflow second stack"); 
      }
      else{
          arr[++top2]= data;
      }
  }
  
  public int pop1(){
      if(isEmpty1()){
          System.out.println("first stack is Empty");
      }
      int data = arr[top1--];
      return data;
  }
  
  public int pop2(){
      if(isEmpty2()){
          System.out.println("second stack is Empty");
      }
      int data = arr[top2--];
      return data;
  }
  
  public int peak1(){
      if(!isEmpty1()){
          return arr[top1];
      }
      return -1;
  }
  
  public int peak2(){
      if(!isEmpty2()){
          return arr[top2];
      }
      return -1;
  }


}

public class two_stack
{
  public static void main (String[]args)
  {
    TwoStack twostack = new TwoStack(10);
    twostack.push1(10);
    twostack.push1(20);
    twostack.push1(30);
    twostack.push1(40);
  
    twostack.push2(100);
    twostack.push2(200);
    twostack.push2(300);
    twostack.push2(400);
   
   System.out.println(twostack.pop1());
   System.out.println(twostack.peak1());
   
   System.out.println(twostack.pop2());
   System.out.println(twostack.pop2());
   
  }
}
