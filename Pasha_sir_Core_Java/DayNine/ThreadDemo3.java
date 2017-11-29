package daynine;


class ChildThread implements Runnable
{

	@Override
	public void run() {
		System.out.println("THe Current thread is: "+ Thread.currentThread());
		for (int i = 0; i <10; i++) {
			System.out.print(i+" ");
	
		}
	}
	
}
public class ThreadDemo3 {

	public static void main(String[] args) {
	System.out.println("The current thread is :"+Thread.currentThread());
	ChildThread childThread=new ChildThread();
	Thread thread=new Thread(childThread);
	thread.start();

	}

}
