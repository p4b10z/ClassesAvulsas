package Capitulo_11;

public class UsingExceptio {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (Exception exception) { // Captura a exceção lançada por throwException
            System.err.println("Exception handled in main");
        }
        // Método `doesNotThrowException` implementado corretamente
        doesNotThrowException();
    }

    // Demonstra try-catch-finally
    public static void throwException() throws Exception {
        try {
            System.out.println("Method throwException");
            throw new Exception(); // Gera uma exceção
        } catch (Exception exception) {
            System.err.println("Exception handled in method throwException");
            throw exception; // Relança a exceção
        } finally { // Executa independente do try-catch
            System.err.println("finally executed in throwException");
        }
    }
    public static void doesNotThrowException() {
        try {
            System.out.println("Method doesNotThrowException");
        } finally {
            System.err.println("finally executed in doesNotThrowException");
        }
    }
}