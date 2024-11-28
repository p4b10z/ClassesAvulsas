package Capitulo_10;

public class HourlyEmployee extends Employee {

	private double wage; // salario por hora
	private double hours;// horas semanais trabalhadas

	// metodo contrutor
	public HourlyEmployee(String fistName, String lastName, String SocialseurityNumber, double wage, double hours) {
		super(fistName, lastName, SocialseurityNumber);
		if (wage < 0.0) {
			throw new IllegalArgumentException("o salario por hora não pode ser 0");
		}

		if (hours < 0.0) {
			throw new IllegalArgumentException("o horario trabalhado não pode ser 0");
		}

		this.hours = hours;
		this.wage = wage;
	}

	// Metodos get e set
	public void setWage(double wage) {
		if (wage < 0.0)// para validar a remuneração
			throw new IllegalArgumentException("o salario semanal não pose ser menor que 0");

		this.wage = wage;
	}
	
	public void sethours(double hours) {
		if(hours < 0.0)
			throw new IllegalArgumentException("o tempo trabalhado não pode ser menor que 0");
		
		this.hours = hours ; 
	}
	
	public double getWage() {
		return wage ;
	}
	
	public double gethours() {
		return hours ; 
	}

	@Override
	public double earnings() {
		if(gethours() >= 40)// nenhuma hora extra 
			return getWage() * gethours(); 
		else 
		    return 40 + getWage() + (gethours() - 40 ) * getWage() * 1.5 ; 
	}
	
	public String toString() {
		return String.format("hourly employee: %s%n%s: $%,.2f; %s: %,.2f",
				  super.toString(), "hourly wage", getWage(), 
				 "hours worked", gethours());
	}

	@Override
	public double getPaymentAmouth() {
		// TODO Auto-generated method stub
		return 0;
	}
}
