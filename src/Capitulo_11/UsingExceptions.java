package Capitulo_11 ; 

public class UsingExceptions {
    public static void main(String[] args) {
        try {
            method1(); // Chama method1
        } catch (Exception exception) { // Captura a exceção lançada em method1
            System.err.printf("%s%n%n", exception.getMessage()); // Exibe a mensagem da exceção
            exception.printStackTrace(); // Exibe o rastreamento completo da pilha

            // Obtém informações de rastreamento de pilha
            StackTraceElement[] traceElements = exception.getStackTrace();

            System.out.printf("%nStack trace from getStackTrace:%n");
            System.out.println("Class\t\tFile\t\t\tLine\tMethod");

            // Faz um loop por traceElements para obter a descrição da exceção
            for (StackTraceElement element : traceElements) {
                System.out.printf("%s\t", element.getClassName()); // Nome da classe
                System.out.printf("%s\t", element.getFileName()); // Nome do arquivo
                System.out.printf("%s\t", element.getLineNumber()); // Número da linha
                System.out.printf("%s%n", element.getMethodName()); // Nome do método
            }
        }
    } // Fim de main

    // Chama method2; lança exceções de volta para main
    public static void method1() throws Exception {
        method2(); // Chama method2
    }

    // Chama method3; lança exceções de volta para method1
    public static void method2() throws Exception {
        method3(); // Chama method3
    }

    // Lança Exception de volta para method2
    public static void method3() throws Exception {
        // Lança uma exceção direta com mensagem
        throw new Exception("Exception thrown in method3");
    }
} // Fim da classe UsingExceptions
