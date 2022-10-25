package core_java_programs;

class Hii implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hii");
			try {	Thread.sleep(100);	} catch (InterruptedException e) {}
		}
	}
}

class Helloo implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Helloo");
			try {	Thread.sleep(100);	} catch (InterruptedException e) {}
		}
	}
}

public class MultiThreading_16_2 {
	public static void main(String args[]) throws InterruptedException
	{
		Runnable r1 = new Hi();
		Runnable r2 = new Hello();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		System.out.println("before join code in main thread");
		t1.join();
		t2.join();
		System.out.println("after join code in main thread");
	}
}
