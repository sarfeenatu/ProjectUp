package arrayspgm;

public class LiteralSum {

	public static void main(String[] args) {
		int i,s=0;
		float avg;
		int a[]=new int[] {2,4,3};
		for(i=0;i<=2;i++)
			s=s+a[i];
		System.out.println("Sum is: "+s);
		avg=s/3;
		System.out.println("Average is: "+avg);
		System.out.println("Array length is:"+a.length);

	}

}
