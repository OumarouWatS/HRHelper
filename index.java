import java.util.Scanner; 

public class Main { 

	public static void main(String[] args) { 

		String employeeName; 

		int employeeId; 

		double grossSalary, netSalary; 

		Scanner scnr = new Scanner(System.in); 

		System.out.println("Please, enter the employee name:"); 

		employeeName = scnr.nextLine(); 

		System.out.println("Please, enter the employee identification number:"); 

		employeeId = scnr.nextInt(); 

		System.out.println("Please, enter the employee's gross salary:"); 

		grossSalary = scnr.nextDouble(); 

    netSalary = netSalaryCalculator(grossSalary); 

    System.out.println("The salary after taxes is: "+ netSalary); 

	} 

	public static double netSalaryCalculator(double grossSalary) { 

    double value; 

		value = (grossSalary*88)/100; 

    return value; 

	} 

	public void salaryDisplay(double netSalary){ 

		System.out.println("The salary after taxes is: "+ netSalary); 

	} 

	public void salaryInfo(String employeeName, int employeeId, double netSalary) { 

		System.out.println("Employee name is: "+ employeeName); 

    System.out.println("Employee identification number is: "+ employeeId); 

    System.out.println("Employee net Salary is : "+ netSalary); 

	} 

} 
