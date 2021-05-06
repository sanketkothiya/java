import java.util.*;
import java.awt.*;
class one implements Runnable
{
	one()
	{
		new Thread(this,"one").start();
		
	}
	public void run()
	{
		for(;;)
		{
			try
			{
				Thread.sleep(1000);
				
			}
			catch(InterruptedException e){}
			System.out.println("Good Morning");
		}
	}
}
 class Two implements Runnable
 {
	 Two()
	 {
		 new Thread(this,"two").start();
		 
	 }
	 public void run()
	 {
		 for(;;)
		 {
			 try{
				 Thread.sleep(3000);
			 }
			 catch(InterruptedException e){}
			 System.out.println("Good Afternoon");
		 }
	 }
 }
 class threading
 {
	 public static void main(String args[])
	 {
		 one sk1=new one();
		 Two sk2=new Two();
		 
		 
	 }
 }