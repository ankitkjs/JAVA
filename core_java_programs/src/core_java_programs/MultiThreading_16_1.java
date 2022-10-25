package core_java_programs;

class Hi extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi");
			try {	Thread.sleep(100);	} catch (InterruptedException e) {}
		}
	}
}

class Hello extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			try {	Thread.sleep(100);	} catch (InterruptedException e) {}
		}
	}
}

public class MultiThreading_16_1 {
	public static void main(String args[])
	{
		Thread t1 = new Hi();
		Thread t2 = new Hello();
//		Hi obj1 = new Hi();
//		Hello obj2 = new Hello();
		t1.start();
		t2.start();
	}
}
