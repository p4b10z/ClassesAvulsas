package Capitulo_10;

public class BasePlusCommisionEmployee extends CommisionEmployee{
     private double baseSalary; // salario de base semanal
     
     public BasePlusCommisionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
 			double commissionRate, double baseSalary, Date birthDate) {
    	 super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate, birthDate);
    	 
    	 if(baseSalary < 0.0)
    		 throw new IllegalArgumentException("o salario de base não pode ser 0");
    	 
    	 this.baseSalary = baseSalary;
     }
     
     //configura salario base 
      public void setBaseSalary(double baseSalary){
    	  if(baseSalary < 0.0)
     		 throw new IllegalArgumentException("o salario de base não pode ser 0");
    	  
     	 this.baseSalary = baseSalary;
      }
      
    //Retorna salario base 
     public double getBaseSalary() {
    	 return baseSalary ; 
     }
     
     //calcula os vencimentos : subscreve o metodo earnings em Commisionemployee 
     @Override 
     public double earnings() {
    	 return getBaseSalary() + super.earnings() ; 
     }
     
     @Override 
     public String toString() {
    	 return String.format("%s %s : %s %,.2f", 
    			 "base salaried", super.toString(), 
    			 "base salary", getBaseSalary());
     }
}
