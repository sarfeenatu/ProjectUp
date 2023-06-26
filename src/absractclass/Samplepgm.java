package absractclass;
interface BasicAnimal
{
	void eat();
	void sleep();
}

class Monkey
{
	public void jump()
	{
		System.out.println("jump");
	}
	
	public void bite()
	{
		System.out.println("bite");
	}
}

class Human extends Monkey implements BasicAnimal
{

	@Override
	public void eat() {
		System.out.println("eat");
		
	}

	@Override
	public void sleep() {
		System.out.println("sleep");		
	}
	
	public void speak()
	{
		System.out.println("speak");
	}
	
}
public class Samplepgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Human h=new Human();
        h.eat();
        h.sleep();
        h.speak();
        h.jump();
        h.bite();
	}

}
