package Capitulo_10;

public class SalaryEmployee extends Employee{
      private double weeklySalary ; 
      //contrutor 
      public SalaryEmployee(String firstName, String lastName,
    		  String socialSecurityNumber, double weeklySalary, Date birDate) {
    	  super(firstName, lastName, socialSecurityNumber, birDate);

    	  if(weeklySalary < 0.0) {
    		  throw new IllegalArgumentException(
    	 "o salario semanal não pode ser menor que 0.0");
    	  }
    	  this.weeklySalary = weeklySalary;
      }
      
      public double getweeklysalary() {
    	  return weeklySalary ;
      }
      
      @Override
      public double earnings() {
        return getweeklysalary(); 
}
      @Override
      public double getPaymentAmouth() {
    	  return getweeklysalary();
      }
      
      @Override 
      public String toString() {
    	  return String.format("o assalariado : %s%n%s: $%,.2f",
    			  super.toString(), "salario semanal", getweeklysalary());
      }
}