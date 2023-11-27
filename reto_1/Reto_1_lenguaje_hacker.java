package reto_1;

import java.util.HashMap;
import java.util.Map;

/*
 * Escribe un programa que reciba un texto y transforme lenguaje natural a
 * "lenguaje hacker" (conocido realmente como "leet" o "1337"). Este lenguaje
 *  se caracteriza por sustituir caracteres alfanuméricos.
 * - Utiliza esta tabla (https://www.gamehouse.com/blog/leet-speak-cheat-sheet/) 
 *   con el alfabeto y los números en "leet".
 *   (Usa la primera opción de cada transformación. Por ejemplo "4" para la "a")
 */
public class Reto_1_lenguaje_hacker {

	public Reto_1_lenguaje_hacker() {}
	
	public static void leetTranslator(String chain) {
		chain = chain.toLowerCase();
		Character[] letters = new Character[chain.length()];
		String result = "";
		for(int i = 0; i < chain.length();i++){
			letters[i] = chain.charAt(i);
		}
		Map<Character, String> leetDictionary = new HashMap<Character, String>();
		leetDictionary.put('a', "4");
		leetDictionary.put('b', "I3");
		leetDictionary.put('c', "[");
		leetDictionary.put('d', ")");
		leetDictionary.put('e', "3");
		leetDictionary.put('f', "|=");
		leetDictionary.put('g', "&");
		leetDictionary.put('h', "#");
		leetDictionary.put('i', "1");
		leetDictionary.put('j', ",_|");
		leetDictionary.put('k', ">|");
		leetDictionary.put('l', "1");
		leetDictionary.put('m', "/\\/\\");
		leetDictionary.put('n', "^/");
		leetDictionary.put('o', "0");
		leetDictionary.put('p', "|*");
		leetDictionary.put('q', "(_,)");
		leetDictionary.put('r', "I2");
		leetDictionary.put('s', "5");
		leetDictionary.put('t', "7");
		leetDictionary.put('u', "(_)");
		leetDictionary.put('v', "\\/");
		leetDictionary.put('w', "\\/\\/");
		leetDictionary.put('x', "><");
		leetDictionary.put('y', "j");
		leetDictionary.put('z', "2");
		leetDictionary.put('0', "o");
		leetDictionary.put('1', "L");
		leetDictionary.put('2', "R");
		leetDictionary.put('3', "E");
		leetDictionary.put('4', "A");
		leetDictionary.put('5', "S");
		leetDictionary.put('6', "b");
		leetDictionary.put('7', "T");
		leetDictionary.put('8', "B");
		leetDictionary.put('9', "g");

		for(Character str : letters) {
			if(leetDictionary.containsKey(str))
				result+=leetDictionary.get(str);
			else
				result+=str;
		}
			
		System.out.println(result);
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
        // Código del método main
		leetTranslator("Todo lo puedo en Cristo que me fortalece. Filipenses 4:13");
    }
}
