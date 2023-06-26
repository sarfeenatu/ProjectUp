package constructorpgm;

public class Empconstructor {
        int empid;
        String empname;
        String design;
        
        public Empconstructor(int empid,String empname,String design)
        {     //here parameters and instance variables are same.
        	  //so use 'this' keyword to differentiate
        	  //this keyword is used to refer to current object in the constructor.
        	this.empid=empid;
        	this.empname=empname;
        	this.design=design;
        			}
        public void display()
        {
        	System.out.println("empid: "+empid);
        	System.out.println("empname: "+empname);
        	System.out.println("designation: "+design);
        	
        }
	public static void main(String[] args) {
		Empconstructor emp1=new Empconstructor(1,"sarfe","tester");
		emp1.display();

	}

}
