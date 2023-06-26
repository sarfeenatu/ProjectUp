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

class BabyDog extends Dog
{
	void sleep()
	{
	System.out.println("BabyDog sleeping");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		BabyDog obj=new BabyDog();
		obj.eats();
		obj.barks();
		obj.sleep();
		
	}

}
