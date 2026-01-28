// program 5:- Create a class Employee with a parameterized constructor
// that accepts id , name , salary .
// Create 2 Employee objects and display them .

package constructor1;

public class Employee {
	int EmpId;
	String Name;
	Float Salary;
	
	Employee(int EmpId,String Name,Float Salary){
		this.EmpId=EmpId;
		this.Name=Name;
		this.Salary=Salary;
		
	}
	public void Display() {
		System.out.println("Employee Details :- ");
		System.out.println("Employee ID = " + EmpId);
		System.out.println("Employee Name = " + Name);
		System.out.println("Employee Salary = " + Salary);
		System.err.println("---------------------------------------");
	}
	
	public static void main(String[] args) {
		Employee E = new Employee(1, "Shruti", 35000f);
		E.Display();
		Employee E1= new Employee(2, "Shreyash", 20000f);
		E1.Display();
		
	}
}
