package classandobject;

class Employee{
	int eid;
	String ename;
	int salary;
	Project project;
	public Employee(int eid,String ename,int salary,Project project) {
		this.eid=eid;
		this.ename=ename;
		this.salary=salary;
		this.project=project;
		
	}
	void display() {
 if(this.project==project && this.salary>25000) {
	 
    		System.out.println(this.eid+" "+this.ename);
			System.out.println(project.pname);
	 
 }
		}
}

class Project{
	int pid;
	String pname;
	String location;
	
	public Project(int pid,String pname,String location) {
		this.location=location;
		this.pid=pid;
		this.pname=pname;
	}
	
	
	
}


public  class Has {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project project =new Project(1,"Mobile app","mumbai");
		Project project2 =new Project(2,"E-commerce","mumbai");
		
		Employee employees=new Employee(1,"khushi",50000,project);
		
		Employee employees2=new Employee(2,"khu",20000,project);
		Employee employees3=new Employee(3,"bhav",20000,project2);
		Employee employees4=new Employee(4,"umnag",80000,project2);
		
		employees.display();
		employees2.display();
		employees3.display();
		employees4.display();

	
		
	

	}

}

