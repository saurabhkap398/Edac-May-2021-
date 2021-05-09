//Que 6

import java.util.*;
import java.lang.*;
public class calculation1
  {
   public static void main(String args [])
   {
   
	Scanner Sc =new Scanner (System.in);
    
	System.out.print("input first number :");
	int i = Sc.nextInt();
	
	System.out.print("input second number :");
	int j = Sc.nextInt();
	
	int k = i+j;
	System.out.println("125 + 24 ="+k);
    k = i-j;
	System.out.println("125 - 24 ="+k);
	 k = i*j;
	System.out.println("125 * 24 ="+k);
	 k = i/j;
	System.out.println("125 / 24 ="+k);
	 k = i%j;
	System.out.print("125 mod 24 ="+k);
	}
	}