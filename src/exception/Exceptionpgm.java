package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exceptionpgm {

	public static void main(String[] args) throws FileNotFoundException {
		int a;
		String s=null;
		FileInputStream fs=new FileInputStream("F://sample.jpg");
		try
		{
			 a=10/0;
		}
		catch(Exception e)
		{
			System.out.println("division not possible");
			System.out.println(e.getMessage());
		}
		try
		{
			System.out.println(s.length());
		}
		catch(Exception st)
		{
			System.out.println("Sting is NULL");
			System.out.println(st.getMessage());
		}
	}

}
