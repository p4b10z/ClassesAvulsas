package Capitulo_10;

//declaração de classes abstratas
public abstract class Employee implements payable {
	   private Date birthDate ; 
       private final String FirstName ; 
       private final String LastName ; 
       private final String SocialSecurityNumber ; 
   
       //contrutor 
       public Employee(String FirstName, String LastName, String SocialSecurityNumber, Date birDate) {
    	   this.FirstName = FirstName ; 
    	   this.LastName = LastName ;
    	   this.SocialSecurityNumber = SocialSecurityNumber ; 
    	   this.birthDate = birDate ; 
       }
       
       //metodos get 
       public String getFirstname() {
    	   return FirstName ; 
       }
       public String getLastName() {
    	   return LastName ; 
       }
       public String getSocialSecurityNumber() {
    	   return SocialSecurityNumber ; 
       }
       
       // metodo ToString para retornar uma representação String
       @Override
       public String toString() {
    	   return String.format("%s %s%nSocial securityNumber : %s", getFirstname(),getLastName(), getSocialSecurityNumber());
       }
       
       //o metodo abstract deve ser subescrito pelas classes concretas 
       public abstract double earnings(); //nenhuma implementação aqui 
 
       
    // Observação: não implementamos o método getPaymentAmount de Payable aqui, assim
    // essa classe deve ser declarada abstrata para evitar um erro de compilação.
}
