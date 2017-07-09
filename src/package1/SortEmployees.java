package package1;     //This java file is inside package named package1 inside src folder.
import java.util.*;       //importing all classes from java's util library.. Because it has Collection Class needed for this Assignment.

public class SortEmployees implements Comparator<Employee>   //class declaration which is extending the class Comparator.
{
	//This class will be useful to compare two objects of Employee.
	//Method to compare two objects.
	@Override
	public int compare(Employee firstEmployee, Employee secondEmployee) 
	{
		//Checking if salary is firstEmployee is less.
		if(firstEmployee.empSalary < secondEmployee.empSalary)
		{
			return -1;   //return -1.
		}
		//Checking if salary is firstEmployee is more.
		else if(firstEmployee.empSalary > secondEmployee.empSalary)
		{
			return 1;   //return 1;
		}
		//Checking if salary of both employees are same
		else if(firstEmployee.empSalary == secondEmployee.empSalary)
		{
			//We then have to sort based on their names.
			//Checking if names of two employees are not same.
			if(firstEmployee.empName.compareTo(secondEmployee.empName) != 0)
			{
				return firstEmployee.empName.compareTo(secondEmployee.empName);   //returning comparision result of names.
			}
			//If both names are equal
			else if(firstEmployee.empName.compareTo(secondEmployee.empName) == 0)
			{
				//We then have to sort based on their designation.
				//Checking the designation and retruning according to that.
				if(firstEmployee.empDesignation < secondEmployee.empDesignation)
					return -1;
				else if(firstEmployee.empDesignation > secondEmployee.empDesignation)
					return 1;
			}
		}
		return 0;
	}
}