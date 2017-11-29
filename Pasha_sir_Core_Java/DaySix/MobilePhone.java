package daysix;

abstract public class MobilePhone {

	abstract public void call();
	public void mobileCameraClicked()
	{
		System.out.println("Camera Opened........");
	}
}

class Test
{
	public static void main(String[] args) {
		MobilePhone sim1=new Airtel();
		sim1.call();
		
		MobilePhone sim2=new Idea();
		sim2.call();
	}
}
