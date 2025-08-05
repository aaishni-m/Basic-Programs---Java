package sql;

public class Employee {
	String name; 
	int empid;
	int deptNo; 
	int managerNo; 
	String hireDate; 
	double sal; 
	double comm; 
	String job;
	
	public Employee() {
		
	}
	public Employee(String name, int empid, int deptNo, int managerNo, String hireDate, double sal, double comm,
			String job) {
		super();
		this.name = name;
		this.empid = empid;
		this.deptNo = deptNo;
		this.managerNo = managerNo;
		this.hireDate = hireDate;
		this.sal = sal;
		this.comm = comm;
		this.job = job;
	}
	
	public String toString() {
		return "[Name= "+ name+" EmpID= "+empid+" DeptNo= "+deptNo+" Job= "+job+" Manager No.= "+managerNo
				+" Hire Date= "+hireDate+" Salary"+sal+" Commission= "+comm+"]";
	}

}
