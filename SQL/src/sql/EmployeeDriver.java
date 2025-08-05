package sql;

public class EmployeeDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDB ref = new EmployeeDB("Scott","tiger"); 
		ref.login("Scott", "Tiger");
		
		ref.addEmployee("Smith", 7369, 20, 7902, "Clerk", "17/12/1980", 800.0, 0.0);
		ref.addEmployee("Allen", 7499, 30, 7698, "Salesman", "20/02/1981", 1600.0, 300.0);
		ref.addEmployee("Ward", 7521, 30, 7698, "Salesman", "22/10/1981", 1250.0, 500.0);
		ref.addEmployee("Jones", 7566, 20, 7839, "Manager", "02/04/1981", 2975.0, 0.0);
		ref.addEmployee("Martin", 7654, 30, 7698, "Salesman", "28/09/1981", 1250.0, 1400.0);
	}

}
