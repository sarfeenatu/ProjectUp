package package2;

public class GreatestOfThree {

	public static void main(String[] args) {
		int a=100,b=150,c=1200;
		if(a>b)
			if(a>c)
				System.out.println("a is greater");
			else
				System.out.println("c is greater");
		else if(b>c)
			System.out.println("b is greater");
		else
			System.out.println("c is greater");

	}

}
