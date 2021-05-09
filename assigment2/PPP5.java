class PPP5
{ 
	public static void main(String args[])
	 {   int i,j,k;
	     for (i=9;i>=1;i--)
		 { 
			for(j=2;j<=i;j++)
			{
				System.out.print(" ");
		    }
		   for(k=i;k<=9;k++)
			{
				System.out.print(k);
		    }
			
		   for( k=k-2;k>=i;k--)
			{
			System.out.print(k);
		    }
			
			System.out.println();
		  
	     
		 } 
	
	 }
}
