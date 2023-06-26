package absractclass;

interface TvRemote
{
	void display();
	
}

interface SmartTvRemote extends TvRemote
{
	void features();
	
}

class Tv implements SmartTvRemote
{

	@Override
	public void display() {
		
			System.out.println("TV display");
		
		
	}

	@Override
	public void features() {
		System.out.println("Smart Tv");		
	}
	
	public void remote()
	{
		System.out.println("this is class Tv");
	}
}
public class pgm2 {

	public static void main(String[] args) {
		Tv obj=new Tv();
		obj.display();
		obj.features();
		obj.remote();

	}

}
