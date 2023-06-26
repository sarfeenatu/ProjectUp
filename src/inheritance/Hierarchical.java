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

class Lion extends Animal
{
	public void roars()
	{
		System.out.println("Lion roars");
	}
}

public class Hierarchical {
	

	public static void main(String[] args) {
		Dog d=new Dog();
		d.eats();
		d.barks();
		Lion l=new Lion();
		l.eats();
		l.roars();
	}

}
