package controlstatements;

public class StarPattern {

	public static void main(String[] args) {
		int i,j,a=5;
		 for(i=1;i<=5;i++)
		 {
			 for(j=1;j<=5;j++)
			 {
				 if(i==1||i==5||j==1||j==5)
				 System.out.print("*");
				 else
					 System.out.print(" ");
				
			 }
		
		System.out.println("");
		 }
	}

}
