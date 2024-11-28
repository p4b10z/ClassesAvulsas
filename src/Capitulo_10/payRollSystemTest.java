package Capitulo_10;

public class payRollSystemTest {
	public static void main(String[] args) {
		// cria objetos de subclasse
		SalaryEmployee salariedEmployee = new SalaryEmployee("John", "Smith", "111-11-1111", 800.00);
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "222-22-2222", 16.75, 40);
		CommisionEmployee commissionEmployee = new CommisionEmployee("Sue", "Jones", "333-33-3333", 10000, 0.06);
		BasePlusCommisionEmployee basePlusCommissionEmployee = new BasePlusCommisionEmployee("Bob", "Lewis",
				"444-44-4444", 5000, 0.04, 300);

		System.out.println("Employees processed individually:");

		System.out.printf("%n%s%n%s: $%,.2f%n%n", salariedEmployee, "earned", salariedEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n", hourlyEmployee, "earned", hourlyEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n", commissionEmployee, "earned", commissionEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n", basePlusCommissionEmployee, "earned",
				basePlusCommissionEmployee.earnings());

		// cria um array Employee de quatro elementos
		Employee[] employees = new Employee[4];

		// inicializa o array com Employees
		employees[0] = salariedEmployee;
		employees[1] = hourlyEmployee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;

		System.out.printf("Employees processed polymorphically:%n%n");

		// processa genericamente cada elemento no employees
		for (Employee currentEmployee : employees) {
			System.out.println(currentEmployee); // invoca toString

			// determina se elemento é um BasePlusCommissionEmployee
			if (currentEmployee instanceof BasePlusCommisionEmployee) {
				// downcast da referência de Employee para referência a
				// BasePlusCommissionEmployee
				BasePlusCommisionEmployee employee = (BasePlusCommisionEmployee) currentEmployee;

				employee.setBaseSalary(1.10 * employee.getBaseSalary());

				System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
			}

			System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
		}

		// obtém o nome do tipo de cada objeto no array employees
		for (int j = 0; j < employees.length; j++) {
			System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
		}

	}
}
