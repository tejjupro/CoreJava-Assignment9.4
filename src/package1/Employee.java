package package1;  //This java file is inside package named package1 inside src folder.

/*
 * This Assignment helped me to master the concepts of Comparator class and treeset.
 */

public class Employee    //Class declaration. 
{
	public String empName;    //String to store name of Employee.
	public int empDesignation;    //int variable which will be from (1,2 & 3) to specify status of Employee.
	public double empSalary;    //double variable to store the salary of an Employee.
	
	//Constructor.
	public Employee(String empName, int empDesignation, double empSalary) 
	{
		//Initializing instance variable of class by parameters passed in the constructor.
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empSalary = empSalary;
	}
	
	//Method to return the information of employee as a String.
	public String toString()
	{
		//returning information as a String.
		return "Name : "+empName+"\nDesignation : "+empDesignation+"\nSalary : "+empSalary+"\n\n";
	}
}