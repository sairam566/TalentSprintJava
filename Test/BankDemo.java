package banking;
import java.util.ArrayList;
import java.util.Scanner;

public class BankDemo 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		ArrayList <Customer> arrayList = new ArrayList<Customer>();
		String name;
		int id,choice;

		double amount;
		do
		{
			boolean flag = false;
			System.out.println("1. ADD CUSTOMER");
			System.out.println("2. DISPLAY CUSTOMER");
			System.out.println("3. DEPOSIT AMOUNT");
			System.out.println("4. WITHDRAW AMOUNT");
			System.out.println("5. EXIT");
			System.out.print("Entrer your choice :");
			choice = sc.nextInt();
			switch(choice)
			{
				case 1 : System.out.print("Enter your name :");
				name = sc.next();
				System.out.print("Enter your amount :");
				amount = sc.nextDouble();
				Customer customer = new Customer(name,amount); 
				arrayList.add(customer);
				System.out.println("Customer Added Successfully with Id :"+customer.getId());
				break;		
//------------------------------------------------------------------------------------------------------
			case 2 :  
				System.out.print("Enter customer id to display :");
				id = sc.nextInt();
				for(Customer cust : arrayList)
				{
					if(cust.getId() == id)
					{
						System.out.println("Id :" + cust.getId());
						System.out.println("Name : " + cust.getName());
						System.out.println("Balance :"+ cust.getBalance());
						flag = true;					
					}
				}
				if(flag == false)
					System.out.println("Not found ");
				break;
//------------------------------------------------------------------------------------------------------

			case 3:
				System.out.print("Enter customer id:");
				id = sc.nextInt();
				for(Customer cust : arrayList)
				{
					if(cust.getId() == id)
					{
						System.out.println("Welcome Mr/Miss: " + cust.getName());
						System.out.print("How much Money do you want to Deposit :");
						double addbalance=sc.nextInt();
						addbalance=addbalance+cust.getBalance();
						cust.setBalance(addbalance);
						System.out.println("Balance Added successfully");
						System.out.println("your TotalBalance is :"+cust.getBalance());
						flag = true;
					}
				}
				if(flag == false)
					System.out.println("Not found ");
				break;
//---------------------------------------------------------------------------------------------------------

			case 4:
				
				
				System.out.print("Enter customer id:");
				id = sc.nextInt();
				for(Customer cust : arrayList) 
				{
					if(cust.getId() == id)
					{
						System.out.println("Welcome Mr/Miss: " + cust.getName());
						System.out.println("How much Money do you want to WithDraw :");
						double deductbalance=sc.nextInt();
						double money=deductbalance-cust.getBalance();
						if(cust.getBalance()<1000)
						{
							System.out.println("Sorry your should have atleast "+1000+" in your account");
						}
						else
						{
							money=money-cust.getBalance();
							cust.setBalance(money);
							System.out.println("your TotalBalance is :"+cust.getBalance());
						}
					}
				}
				break;
				
//----------------------------------------------------------------------------------------------------
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}	
				} while(choice < 5);

			}
	}









