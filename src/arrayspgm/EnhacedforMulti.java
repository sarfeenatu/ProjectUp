package arrayspgm;

public class EnhacedforMulti {

	public static void main(String[] args) {
		int a[][]= {{1,2,3},{4,5,6}};
		for(int[] x:a)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
