package methodpgm;

public class AreaOfShapes {

	public static void main(String[] args) {

        AreaOfShapes as1=new AreaOfShapes();
        AreaOfShapes as2=new AreaOfShapes();
        AreaOfShapes as3=new AreaOfShapes();
        AreaOfShapes as4=new AreaOfShapes();
        as1.circle();
        as2.triangle(3.1f, 2f);
        
        System.out.println("Area of Square = "+as3.square());
        System.out.println("Area of Rectangle = "+as4.rectangle(5,10));
        
	}
	
	public void circle()
	{
		int r=4;
		System.out.println("Area of Circle = "+(3.14*r*r));
	}
	
	public void triangle(float b,float h)
	{
		System.out.println("Area of Triangle = "+(.5*b*h));
	}
	
	public int square()
	{
		int a=4;
		return (a*a);
	}
    public int rectangle(int l,int b)
    {
    	return (l*b);
    }
}
