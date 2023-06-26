package constructorpgm;

public class Student {
	
          int stdid;
          String stdname;
          String course;
          public Student(int stdid,String stdname,String course)
          {
        	  this.stdid=stdid;
        	  this.stdname=stdname;
        	  this.course=course;
        	  
          }
          
          public void display()
          {
             System.out.println("Student details");
             System.out.println("Student id "+stdid);
             System.out.println("Student name "+stdname);
             System.out.println("Student course: "+course);
             

          }
	public static void main(String[] args) {
		
       Student s1=new Student(1,"Ram","Java");
       s1.display();
       Student s2=new Student(2,"Ram","AI");
       s2.display();
       

	}

}
