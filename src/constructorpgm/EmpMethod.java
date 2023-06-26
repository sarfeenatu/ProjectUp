package constructorpgm;

public class EmpMethod {

	int empid;
    String empname;
    String design;
    public void setVlaue(int empid,String empname,String design)
    {
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
		
		EmpMethod emp1=new EmpMethod();
		emp1.setVlaue(11, "sarfe", "tester");
		emp1.display();
		
	}

}
