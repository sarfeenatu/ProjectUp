package absractclass;

interface Animal
{
	void breed();
	void food();
	
}

class Cat implements Animal
{

	@Override
	public void breed() {
		System.out.println("cat breed");
		
	}

	@Override
	public void food() {
		System.out.println("cat food");
		
	}
	
}

public class interfacepgm {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.breed();
		c.food();
	}

}
