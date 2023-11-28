package reto_4_Primo_Fibonacci_Par;
/*
 * Escribe un programa que, dado un número, compruebe y muestre si es primo,
 * fibonacci y par.
 * Ejemplos:
 * - Con el número 2, nos dirá: "2 es primo, fibonacci y es par"
 * - Con el número 7, nos dirá: "7 es primo, no es fibonacci y es impar"
 */
public class Reto_4_ {

	public static String primoFibonacciPar(int number) {
		boolean primo = true;
		int cantDiv = 0; // number of numbers by which it is divisible
		for(int i = 1; i <= number; i++) {
			if(number % i == 0)
				cantDiv++;
			if(cantDiv > 2)
				primo = false;
		}
		String result = number + " ";
		if(primo) //primo
			result += "es primo, ";
		else
			result += "no es primo, ";

		int countFibonacciBefore = 0;
		int countFibonacciAfter = 1;
		int auxFibo = 0;
		boolean fibo = false;
		while(countFibonacciAfter < number) { //13
			auxFibo = countFibonacciAfter;
			countFibonacciAfter+=countFibonacciBefore;
			countFibonacciBefore = auxFibo;
			if(countFibonacciAfter == number)
				fibo = true;
		}
		if(fibo) //fibonacci
			result += "fibonacci y ";
		else
			result += "no es fibonacci y ";
		if(number%2 == 0) //par
			result += "es par";
		else
			result += "es impar";
		
		return result;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(primoFibonacciPar(34));
	}
}
