package dayeleven;

class Shop
{
	private int product=0;
	public synchronized void produce(int product)
	{
		if(this.product!=0)
		{
			System.out.println("producer is waiting...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		this.product=product;
		System.out.println("Product :"+this.product+" is produced");
		
		notify();
	}
	public synchronized void consume()
	{
		if(this.product==0)
		{
			System.out.println("consumer is waiting...");
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Product :"+this.product+" is Consumer");
		this.product=0;
		notify();
		}
	}
class Producer extends Thread
{
	Shop shop;
	public Producer(Shop shop)
	{
		this.shop=shop;
	}
	public void run() {
		System.out.println("Producer start Producing...");
		for(int i=1;i<=10;i++){
			shop.produce(i);
		}
	}
}
class Consumer extends Thread
{
	Shop shop;
	public Consumer(Shop shop)
	{
		this.shop=shop;
	}
	@Override
	public void run() {
		System.out.println("Consumer start Consuming...");
		for(int i=1;i<=10;i++){
			shop.consume();
		}
	}
}



public class ProducerConsumerExample {

	public static void main(String[] args) {
	Shop shop=new Shop();
	Producer producer=new Producer(shop);
	Consumer consumer=new Consumer(shop);
	producer.start();
	consumer.start();

	}

}
