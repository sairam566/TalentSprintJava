package daynine;

public class ThreadDemo1 {
public static void main(String[] args) {
	Thread t1=new Thread();
	Thread t2=new Thread();
	System.out.println("Current Thread is :"+Thread.currentThread());
	System.out.println("Thread Name is :"+t1.getName());
	System.out.println("Thread Name is :"+t2.getName());
	t1.setName("SaiRam");
	System.out.println("Thread Name is :"+t1.getName());
	System.out.println("The priority of t1 :"+t1.getPriority());
	System.out.println("The priority of t2 :"+t2.getPriority());
	t1.setPriority(8);
	t2.setPriority(Thread.MAX_PRIORITY);
	System.out.println("The New priority of t1 :"+t1.getPriority());
	System.out.println("The New priority of t2 :"+t2.getPriority());
	System.out.println("Thread t1 is Alive: "+t1.isAlive());
	t2.start();
	System.out.println("Thread t2 is Alive: "+t2.isAlive());
}
}
