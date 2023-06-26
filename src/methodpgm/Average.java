
package methodpgm;

public class Average {

	public static void main(String[] args) {
		Average av1=new Average();
		av1.average(10,20,30);

	}
	
	public void average(int a,int b,int c)
	{
		float av;
		av=(a+b+c)/3;
		 System.out.println("Average= "+av);
	}

}
