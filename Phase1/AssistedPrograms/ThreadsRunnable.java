package Assignments;

public class ThreadsRunnable implements Runnable{

	
		
		public  void run()
		{  
			System.out.println("thread is running.....");  
		}  
		  
		public static void main(String args[])
		{  
		
			ThreadsRunnable m1=new ThreadsRunnable();       
			Thread t1 = new Thread(m1);                     
			t1.start();                                     
		}  
	}