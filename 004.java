import java.util.*;

class Person
{
	String name;
	int age;
	private int password;
	
	void Person_data()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter your name: ");
		name = sc.nextLine();
		System.out.println("\nEnter your age: ");
		age = sc.nextInt();
		System.out.println("\nEnter Password: ");
		password = sc.nextInt();
	}
	void details()
	{
		System.out.println("\nName: "+name+"\nAge: "+age+"\nPassword: "+password);
	}
}
class Student extends Person
{
	int roll;
	int cls;
	
	public void Student_data()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter your name: ");
		name = sc.nextLine();
		System.out.println(super.name);
		System.out.println("\nEnter your Roll_no: ");
		roll = sc.nextInt();
		System.out.println("Enter Class: ");
		cls = sc.nextInt();
		
	}
	void details()
	{
		System.out.println("\nName: "+name+"\nRoll_no: "+roll+"\nClass: "+cls);
		System.out.println("\nName: "+name+"\nPerson_Name: "+super.name);
	}
}
class Main
{
	
	public static void main(String[] Args)
	{
		//Person a = new Person();
		//a.Person_data();
		//a.details();
		Person b = new Student();
		b.Person_data();
		b.Student_data();
		b.details();
	}
}



