package reto_3;

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
				switch (randomNum) {
				case 1:
					result += generateLetterChar(false); // true = lower, false = upper
					break;
				case 2:
					result += generateLetterChar(true); // true = lower, false = upper
					break;
				case 3:
					result += (int) Math.round(Math.random() * 9);
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
		char[] dictionary = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		char character = dictionary[(int) Math.round(Math.random() * (dictionary.length - 1))];
		if (lowercase)
			return character;
		else
			return Character.toUpperCase(character);
	}

	private static char generateSymbolChar() {
		char[] symbolDictionary = { 'º', 'ª', '\\', '!', '|', '"', '@', '·', '#', '$', '~', '%', '€', '&', '¬', '/',
				'(', ')', '=', '\'', '?', '¡', '¿', '^', '`', '[', ']', '*', '+', '¨', '´', '{', '}', 'ç', 'Ç', ',',
				';', '.', ':', '-', '_' };
		return symbolDictionary[(int) Math.round(Math.random() * (symbolDictionary.length - 1))];
	}

	public static void main(String[] args) {
		// generate();
		int passLenght = (int) Math.floor(Math.random() * 8 + 8);
		boolean uppercase = true;
		boolean lowercase = true;
		boolean numbers = true;
		boolean symbols = true;
		System.out.println(generate(passLenght, uppercase, lowercase, numbers, symbols));
	}
}
