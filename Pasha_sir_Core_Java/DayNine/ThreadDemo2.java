package daynine;

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i < 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("Current thread is :" + Thread.currentThread());
	}
}

public class ThreadDemo2 {
	public static void main(String[] args) {
//		Thread t = Thread.currentThread();
//		System.out.println("Current thread is :" + t);
//		t.setName("sairam");
//		System.out.println("Current thread is :" + t);
		MyThread myThread = new MyThread();
		myThread.setName("Thadi");
		myThread.start();
	}
}
