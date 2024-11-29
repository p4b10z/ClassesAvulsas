package Capitulo_10;

public class paybleInterfacetest {
	// Classe principal para testar o processamento polimórfico
	public static void main(String[] args) {
		// Cria um array Payable de quatro elementos
		payable[] payableObjects = new payable[4];

		// Preenche o array com objetos que implementam Payable
		payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
		payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
		payableObjects[2] = new SalaryEmployee("John", "Smith", "111-11-1111", 800.00, null);
		payableObjects[3] = new SalaryEmployee("Lisa", "Barnes", "888-88-8888", 1200.00, null);

		System.out.println("Invoices and Employees processed polymorphically:");

		// Processa genericamente cada elemento no array payableObjects
		for (payable currentPayable : payableObjects) {
			// Gera saída de currentPayable e sua quantia de pagamento apropriado
			System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(), // toString é chamado implicitamente
					"Payment due", currentPayable.getPaymentAmouth());
		}
	}
}
