package Capitulo_10;

public class CommisionEmployee extends Employee {
	private double grossSales; // vendas brutas semanais
	private double commisionRate; // percentual da comissão

	public CommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
			double commissionRate, Date birthDate) {
		super(firstName, lastName, socialSecurityNumber,birthDate);

		if (commissionRate <= 0.0 || commissionRate >= 1.0) // valida as vendas brutas semanais 
			throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
		if (grossSales < 0.0) // valida o percentual da commissão
			throw new IllegalArgumentException("Gross sales must be >= 0.0");

		this.grossSales = grossSales;
		this.commisionRate = commissionRate;
	}
	
	public void setGrossSales(Double GrossSales) {
		if(GrossSales < 0.0)
			throw new IllegalArgumentException("as vendas semanais não podem se menores que 0");
		
	  this.grossSales =  GrossSales ; 
	}
	public void setCommisionRate(Double CommisionRate) {
		if(CommisionRate < 0.0)
			throw new IllegalArgumentException("O percentual de commissão não poder ser menor que 0");
	this.commisionRate = CommisionRate ; 
	}
	
	public double getGrossSales() {
		return grossSales ; 
	}
	
	public double getCommisionRate() {
		return commisionRate ; 
	}
	
	@Override
	public double earnings() {
		return getCommisionRate() * getGrossSales() ;
	}
	
	@Override 
	public String toString() {
		return String.format("%s : %s%n%s : $%,.2f; %s : %2f",
				"commisionEmployee", super.toString(), 
				"gross sales", getGrossSales(),
				"commision rate", getCommisionRate());
	}

	@Override
	public double getPaymentAmouth() {
		// TODO Auto-generated method stub
		return 0;
	}
}
