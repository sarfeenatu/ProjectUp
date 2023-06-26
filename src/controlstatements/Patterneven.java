package controlstatements;

public class Patterneven {

	public static void main(String[] args) {
		int i,j,a=5;
		 for(i=1;i<=5;i++)
		 {
			 for(j=1;j<=5;j++)
			 {
				 if(i%2!=0)
				 {
				 if(i==1||i==5||j==1||j==5)
				 System.out.print("*");
				 else
					 System.out.print(" ");
				 }
				 else
					 if(j%2!=0)
						 System.out.print("* ");
					 
				
			 }
		
		System.out.println("");
		 }

	}

}
