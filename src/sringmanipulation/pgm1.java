package sringmanipulation;

public class pgm1 {

	public static void main(String[] args) {
		boolean b;
		String s1="java";
		String s2="language";
		String s3="java is platform independent language";
		System.out.println("After Concatination:"+s1.concat(s2));
		b=s3.contains("platform");
		if(b==true)
		System.out.println("platform keyword present");
		else
			System.out.println("Platform word not present");
		
		String a[]=s3.split(" ");
		for(String x:a)
		{
			System.out.print(x);
			if(x.equals("independent"))
			{
				break;
			}
		}
		

	}

}
