package reto_3;

import java.util.HashMap;
import java.util.Map;

/*
 * Escribe un programa que sea capaz de generar contraseñas de forma aleatoria.
 * Podrás configurar generar contraseñas con los siguientes parámetros:
 * - Longitud: Entre 8 y 16.
 * - Con o sin letras mayúsculas.
 * - Con o sin números.
 * - Con o sin símbolos.
 * (Pudiendo combinar todos estos parámetros entre ellos)
 */
public class PasswordGenerator {

	public static String generate(int passLenght, boolean uppercase, boolean lowercase, boolean numbers,
			boolean symbols) {

		if (passLenght >= 8 && passLenght <= 16) {
			String result = "";
			for (int i = 0; i < passLenght; i++) {
				int randomNum = (int) Math.round(Math.random() * 4 + 1);
				switch (randomNum){
				case 1:
					result += generateLetterChar(false); // true = lower, false = upper
					break;
				case 2:
					result += generateLetterChar(true); // true = lower, false = upper
					break;
				case 3:
					result += (char) (int) Math.round(Math.random() * 9);
					break;
				case 4:
					result += generateSymbolChar();
					break;
				}
			}

			return "" + result;
		}
		return "Contraseña fuera de rango (8-16)";
	}

	private static char generateLetterChar(boolean lowercase) {
		Map<Integer, Character> dictionary = new HashMap<>();
		dictionary.put(0, 'a');
		dictionary.put(1, 'b');
		dictionary.put(2, 'c');
		dictionary.put(3, 'd');
		dictionary.put(4, 'e');
		dictionary.put(5, 'f');
		dictionary.put(6, 'g');
		dictionary.put(7, 'h');
		dictionary.put(8, 'i');
		dictionary.put(9, 'j');
		dictionary.put(10, 'k');
		dictionary.put(11, 'l');
		dictionary.put(12, 'm');
		dictionary.put(13, 'n');
		dictionary.put(14, 'o');
		dictionary.put(15, 'p');
		dictionary.put(16, 'q');
		dictionary.put(17, 'r');
		dictionary.put(18, 's');
		dictionary.put(19, 't');
		dictionary.put(20, 'u');
		dictionary.put(21, 'v');
		dictionary.put(22, 'w');
		dictionary.put(23, 'x');
		dictionary.put(24, 'y');
		dictionary.put(25, 'z');
		if (lowercase)
			return dictionary.get((int) Math.round(Math.random() * 25));
		else
			return Character.toUpperCase(dictionary.get((int) Math.round(Math.random() * 25)));
	}

	private static char generateSymbolChar() {
		Map<Integer, Character> symbolDictionary = new HashMap<>();
		symbolDictionary.put(0, 'º');
		symbolDictionary.put(1, '\\');
		symbolDictionary.put(2, 'ª');
		symbolDictionary.put(3, '|');
		symbolDictionary.put(4, '!');
		symbolDictionary.put(5, '"');
		symbolDictionary.put(6, '@');
		symbolDictionary.put(7, '·');
		symbolDictionary.put(8, '#');
		symbolDictionary.put(9, '$');
		symbolDictionary.put(10, '~');
		symbolDictionary.put(11, '%');
		symbolDictionary.put(12, '€');
		symbolDictionary.put(13, '&');
		symbolDictionary.put(14, '¬');
		symbolDictionary.put(15, '/');
		symbolDictionary.put(16, '`');
		symbolDictionary.put(17, '^');
		symbolDictionary.put(18, '[');
		symbolDictionary.put(19, '*');
		symbolDictionary.put(20, '+');
		symbolDictionary.put(21, ']');
		symbolDictionary.put(22, '¨');
		symbolDictionary.put(23, '´');
		symbolDictionary.put(24, '{');
		symbolDictionary.put(25, 'ç');
		symbolDictionary.put(26, '}');
		symbolDictionary.put(27, ',');
		symbolDictionary.put(28, ';');
		symbolDictionary.put(29, '.');
		symbolDictionary.put(30, ':');
		symbolDictionary.put(31, '-');
		symbolDictionary.put(32, '_');
		return symbolDictionary.get((int) Math.round(Math.random() * 32));
	}

	public static void main(String[] args) {
		// generate();
		int passLenght = 8;
		boolean uppercase = true;
		boolean lowercase = true;
		boolean numbers = true;
		boolean symbols = true;
		System.out.println(generate(passLenght, uppercase, lowercase, numbers, symbols));
	}
}
