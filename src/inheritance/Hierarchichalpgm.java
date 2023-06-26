package inheritance;

class Member
{
	String name,address;
	int age,phno,salary;
	
	
	public void printdetails()
	{
		 
		 name="sarfe";
		 address="Ernakulam";
		 age=43;
		 phno=222334;
		 salary=60000;
		System.out.println("Member details:");
		System.out.println("Name:"+name);
		System.out.println("Address:"+address);
		System.out.println("Phone no"+phno);
		System.out.println("Salary:"+salary);
		
	}
}

class Employee extends Member
{
	String specialization;
	public void empgetdata()
	{
		name="sarfe";
		 address="Ernakulam";
		 age=43;
		 phno=222334;
		 salary=60000;
		specialization="HR";
		
	}
	public void empputdata()
	{
		System.out.println("Specialization:"+specialization);
	}
}

class Manager extends Member
{
	String deprt="Finance";
	
	public void manageroutdata()
	{
		name="Alan";
		 address="Banglore";
		 age=33;
		 phno=222334;
		 salary=30000;
		 
		System.out.println("Department:"+deprt);
	}
	
}
public class Hierarchichalpgm {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.empgetdata();
		emp.printdetails();
		emp.empputdata();
		Manager mng=new Manager();
		mng.printdetails();
		mng.manageroutdata();

	}

}
