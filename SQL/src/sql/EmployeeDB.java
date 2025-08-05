package sql;

public class EmployeeDB {
	private String user;
	private String pass;
	private boolean connect;
	private Employee [] db = new Employee[10]; 
	private int count = 0; 
	
	private EmployeeDB() {
		
	}
	
	public EmployeeDB(String user, String pass) {
		super();
		this.user=user;
		this.pass=pass;
		
	}
	
	public void login(String user, String pass) {
		if(this.user.equals(user) && this.pass.equals(pass)) {
			connect = true; 
			System.out.println("Database Connected");
		}
		else {
			System.out.println("Could not resolve the connect identifier specified");
		}
	}
	
	public boolean addEmployee(String name, int empid, int deptno, int managerNo, 
			String job, String hireDate, double sal, double comm) {
		if(connect && count<0.75*db.length) {
			db[count] = new Employee(name, empid, deptno, managerNo, hireDate, sal, comm,job); 
			count++; 
			return true; 
		}
		else if(connect) {
			Employee [] temp = new Employee[db.length]; 
			for (int i = 0; i < db.length; i++) {
				temp[i]=db[i]; 				
			}
			db = temp; 
			db[count] = new Employee(name, empid, deptno, managerNo, hireDate, sal, comm,job);
			count++; 
			return true; 
		}
		else {
			System.out.println("Could not resolve the connect identifier specified");
			return false; 
		}
	}
	
	public void showDB() {
		if(connect) {
			for (int i = 0; i < count; i++) {
				System.out.println(db[i]);
				
			}
		}
		else {
			System.out.println("Could not resolve the connect identifier specified");
		}
	}
	
	public void searchByJob(String job) {
		if(connect) {
			for (int i = 0; i < count; i++) {
				if(db[i].job.equalsIgnoreCase(job))
					System.out.println(db[i]);
			}
		}
	}
	
	public void searchByDeptNo(int deptno) {
		if(connect) {
			for (int i = 0; i < count; i++) {
				if(db[i].deptNo==deptno) {
					System.out.println(db[i]);
				}
			}
		}
	}
	
}
