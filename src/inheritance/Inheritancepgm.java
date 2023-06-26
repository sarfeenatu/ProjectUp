package inheritance;

class Animal
{
	public void eats()
	{
		System.out.println("Animal eats.");
	}
}
class Dog extends Animal
{
	public void barks()
	{
		System.out.println("Dog barks");
	}
}
public class Inheritancepgm {

	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.eats();
		obj.barks();
				
	

	}

}
