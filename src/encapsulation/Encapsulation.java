
package encapsulation;

class Encaps
{
	private int empid;
	private String empname;
	public int getEmpid() {              //rightclick-->source-->generate getters and setters
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
	   
		Encaps e=new Encaps();
		e.setEmpid(23);
		e.setEmpname("sarfe");
		System.out.println("empid:"+e.getEmpid());
		System.out.println("empname :"+e.getEmpname());

	}

}
