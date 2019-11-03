class MyThread
{
	public static void main(String[] Args)
	{
		EvenNumber a = new EvenNumber();
		Thread t = new Thread(a);
		
		OddNumber b = new OddNumber();
		Thread t2 = new Thread(b);
		
		t.start();
		t2.start();
	}
	
}
class EvenNumber implements Runnable
{
	public void run()
	{
		int i;
		for(i=0;i<=20;i=i+2)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}
class OddNumber implements Runnable
{
	public void run()
	{
		int i;
		for(i=1;i<20;i=i+2)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
		}
	}
}