class prime1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=50;i++)
		{
			int k;
			for(k=2;k<i;k++)
			{
			
		        int l=i%j;
				if(l==0)
					break;
				
		    }
		   if(i==k)
		 	
		   System.out.println(i);
		} 
	}
}

class prime2 extends Thread
{
	int num;
	B(String n)
	{
		num=Integer.parseInt(n);
		
	}
	public void run()
	{
		for(i=50;i<=num;i++)
		{
			int a;
			for(a=2;a<i;a++)
			{
				int m=i%a;
				if(m==0)
					break;
			}
			if(i==a)
				System.out.println(i);
				
		}
		
	}	
}

class primethread
{
	public static void main(String args[])
	{
		prime1 s1=new prime1();
		prime2 s2=new prime2(args[0]);
		System.out.println("\n first 50 prime numbers");
		t1.start();
		System.out.println("\n last 50 prime numbers");
		t2.start();
		
	}
}


