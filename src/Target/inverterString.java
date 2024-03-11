package Target;

import java.util.Scanner;

public class inverterString {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite uma frase: ");
	        String input = scanner.nextLine();
	        scanner.close();

	        String invertedString = inverterString(input);
	        System.out.println("Frase invertida: " + invertedString);
	    }

	    public static String inverterString(String str) {
	        char[] chars = str.toCharArray();
	        int start = 0;
	        int end = chars.length - 1;

	        while (start < end) {
	            char temp = chars[start];
	            chars[start] = chars[end];
	            chars[end] = temp;
	            start++;
	            end--;
	        }

	        return new String(chars);
	    }
	}