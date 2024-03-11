package Target;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número (ou digite '0' para sair do programa): ");
            int numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("Saindo do programa...");
                break;
            }

            if (verificarFibonacci(numero)) {
                System.out.println(numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println(numero + " NÃO pertence à sequência de Fibonacci.");
            }
        }

        scanner.close();
    }

    public static boolean verificarFibonacci(int numero) {
        int a = 0;
        int b = 1;
        while (b < numero) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b == numero;
    }
}