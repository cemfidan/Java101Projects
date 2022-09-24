public class Employee {
	
	String name;
	double salary;
	double workHours;
	int hireYears;
	
	public Employee(String name, double salary, double workHours, int hireYears) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYears = hireYears;
	}
	
	public double tax() {
		if (1000 <= this.salary) {
			return (salary * 0.03);
		} else {
			return 0;
		}
	}
	
	public double bonus() {
		if (40 < workHours ) {
			return  (30 * (workHours-40));
		}
		return 0;
	}
	
	public double raiseSalary() {
		int years = 2021 - hireYears;
		
		if (years < 10) {
			return (salary * 0.05);
		} else if ((9 < years) && (years < 20)) {
			return (salary * 0.1);
		} else if (years < 19) {
			return (int) (salary * 0.15);
		}
		return 0;
	}
	
	public String toString() {
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
		System.out.println("Working Hours: " + workHours);
		System.out.println("Year of Employment: " + hireYears);
		System.out.println("Taxes: " + tax());
		System.out.println("Bonus : " + bonus());
		System.out.println("Salary Increase: " + raiseSalary());
		System.out.println("Salary with Taxes and Bonuses: " + (salary + bonus() - tax()));
		System.out.println("Total Salary: " + (salary + bonus() + raiseSalary() - tax()));
		
		return null;
	}
	
}
