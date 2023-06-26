package package2;

public class Newdatatypes {

	public static void main(String[] args) {
		byte b=64;
		System.out.println("value of byte="+b);
		short s=354;
		System.out.println("value of short="+s);
		long l=23456;
		System.out.println("value of long="+l);
		float fl=34.5f;
		System.out.println("value of float="+fl);
		double db=78654.987d;
		System.out.println("value of double="+db);
		boolean bl=60>40;
		System.out.println("value of boolean="+bl);
		char c='s';
		char cs=223;//prints the ASCII value of 68
		System.out.println("value of character="+c);
		System.out.println("value of charater="+cs);
		String st="sarfeena";
		System.out.println("value of string="+st);
		System.out.println("integer-"+(Integer.SIZE/8)+"MIN:"+Integer.MIN_VALUE+"Max:"+Integer.MAX_VALUE) ;//to get the size of datatypes
		System.out.println("character-"+(Character.SIZE/8)+" bytes");
		System.out.println("float-"+(Float.SIZE/8)+" bytes");		
	}

}
