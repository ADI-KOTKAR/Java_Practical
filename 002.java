import java.util.Scanner;

class BankAccount
{
	int acc_no;
	double balance;
	double rate=10;  //interest
	
	public void register()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account number:");
		acc_no = sc.nextInt();
		System.out.println("Enter balance: ");
		balance = sc.nextDouble();
		System.out.println("Registration completed.");
	}
	public void details()
	{
		System.out.println("\n Account Number: "+acc_no+"\n Balance: "+balance+"\n");
	}
	public void deposit(double amt)
	{
		balance = balance + amt;
		System.out.println("Your Balance: "+balance);
	}
	public void withdraw(double amt)
	{
		balance = balance - amt;
		System.out.println("Your Balance: "+balance);
	}
	public void Interest()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Time Period: ");
		double time = sc.nextDouble();
		double si  =  (balance*rate*time);
		System.out.println("Interest Amount: "+si);
	}
	public void Interest(double r)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Time Period: ");
		double time = sc.nextDouble();
		this.rate = r;
		double si  =  (balance*rate*time);
		System.out.println("Interest Amount: "+si);
	}
	
}
class Main
{
	public static void main(String[] Args)
	{
		BankAccount a = new BankAccount();
		a.register();
		a.details();
		a.deposit(1000);
		a.withdraw(500);
		a.details();
		a.Interest();
		a.Interest(9);
		
	}
}