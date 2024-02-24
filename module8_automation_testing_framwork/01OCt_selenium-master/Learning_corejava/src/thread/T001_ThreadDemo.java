package thread;

class Th1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Th1 : "+i);
		}
	}
}

class Th2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Th2 :"+i);
		}
	}
}

public class T001_ThreadDemo {
	public static void main(String[] args) {
		
		
		Th1 t1 = new Th1();
		Th2 t2 = new Th2();
		//t1.start();
		//t2.start();
		 
		t1.setName("a");
		t2.setName("b");
		System.out.println(t1.getName()+" "+t2.getName());
		System.out.println(t2.getId()+" "+t1.getId());
		System.out.println(t1.getPriority()+" "+t2.getPriority());
		
		
	}
}
