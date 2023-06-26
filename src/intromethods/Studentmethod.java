package intromethods;

public class Studentmethod {

	int id;
	String name;
	public static void main(String[] args) {
		
       Studentmethod s1=new Studentmethod();
       Studentmethod s2=new Studentmethod();
       s1.id=1;
       s1.name="sarfe";
       s2.id=2;
       s2.name="raz";
       System.out.println(s1.id+" "+s1.name);
       System.out.println(s2.id+" "+s2.name);
       
	}
}