package Capitulo_10;

public class Invoice implements payable {
    private final String PartNumber ;
    private final String PartDescription ; 
    private int quantity ; 
    private double pricePerInt ; 
    
    //contrutor 
    public Invoice(String PartNumber, String partDescription,int quantity, double pricePerInt) {
    	if(quantity < 0) {
    		throw new IllegalArgumentException("Quntidade nô pode ser 0");
    	}
    	if(pricePerInt < 0.0) {
    		throw new IllegalArgumentException("O preço por int não pode ser igual a 0.0");
    	}
    	
    	
    	this.PartNumber = PartNumber ; 
    	this.PartDescription = partDescription ; 
    	this.quantity = quantity ; 
    	this.pricePerInt = pricePerInt ; 
    }
    
   public String getPartNumber() {
	   return PartNumber ;
   }
   public String getPartdescription() {
	   return PartDescription ; 
   }
   
   public void setQuantity(int quantity) {
	   if(quantity < 0)
		   throw new IllegalArgumentException("quantidade não pode ser menor que 0");
	   
	   this.quantity = quantity;
   }
   public int getQuantity() {
	   return quantity ; 
   }
   
   
   public void setPricePerInt(double PricePerInt) {
	   if(PricePerInt < 0.0)
		   throw new IllegalArgumentException("o price per int não pode ser igual ou menor a 0.0");
	  
	   this.pricePerInt = PricePerInt ;
   }
   
   public double getPricePerInt() {
	   return pricePerInt ; 
   }
    
   public String toString() {
	   return String.format("%s: %n%s: %s(%s) %n%s: %d %n%s: $%,.2f",
			   "invoice", "partNumber", getPartNumber(),  getPartdescription(),
			   "quantity", getQuantity(), "price per item",  getPricePerInt());
   }
   
   @Override
   public double getPaymentAmouth() {
	   return getQuantity() * getPricePerInt(); 
   }
   
   
}
