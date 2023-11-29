package reto_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Crea un programa que calcule quien gana más partidas al piedra,
 * papel, tijera, lagarto, spock.
 * - El resultado puede ser: "Player 1", "Player 2", "Tie" (empate)
 * - La función recibe un listado que contiene pares, representando cada jugada.
 * - El par puede contener combinaciones de "🗿" (piedra), "📄" (papel),
 *   "✂️" (tijera), "🦎" (lagarto) o "🖖" (spock).
 * - Ejemplo. Entrada: [("🗿","✂️"), ("✂️","🗿"), ("📄","✂️")]. Resultado: "Player 2".
 * - Debes buscar información sobre cómo se juega con estas 5 posibilidades.
 */
public class Reto_6_piedra_papel_tijera_lagarto_spock {

	public static String play(ArrayList<String[]> plays) {
		int playCountP1 = 0;
		int playCountP2 = 0;
		Map<String, String[]> dictionary = new HashMap<>();
		String[] pair = new String[2];
		String[] pair2 = new String[2];
		String[] pair3 = new String[2];
		String[] pair4 = new String[2];
		String[] pair5 = new String[2];

		pair[0] = "🗿";
		pair[1] = "✂️";
		dictionary.put("🖖", pair);

		pair2[0] = "🦎";
		pair2[1] = "📄";
		dictionary.put("✂️", pair2);

		pair3[0] = "🗿";
		pair3[1] = "🖖";
		dictionary.put("📄", pair3);

		pair4[0] = "🦎";
		pair4[1] = "✂️";
		dictionary.put("🗿", pair4);

		pair5[0] = "🖖";
		pair5[1] = "📄";
		dictionary.put("🦎", pair5);

		for (String[] play : plays) {
			if (dictionary.get(play[0])[0].equals(play[1]) || dictionary.get(play[0])[1].equals(play[1]))
				playCountP1++;
			else if (dictionary.get(play[1])[0].equals(play[0]) || dictionary.get(play[1])[1].equals(play[0]))
				playCountP2++;
		}

		if (playCountP1 > playCountP2)
			return "Player 1";
		else if (playCountP1 < playCountP2)
			return "Player 2";
		else
			return "Tie";
	}

	public static void main(String[] args) {
		String[] pair = new String[2];
		String[] pair2 = new String[2];
		String[] pair3 = new String[2];
		String[] pair4 = new String[2];
		ArrayList<String[]> plays = new ArrayList<>();
		pair[0] = "🗿";
		pair[1] = "✂️"; // p1 = 1 ; p2 = 0
		plays.add(pair);
		pair2[0] = "🗿";
		pair2[1] = "📄"; // p1 = 1 ; p2 = 1
		plays.add(pair2);
		pair3[0] = "🦎";
		pair3[1] = "✂️"; // p1 = 1 ; p2 = 2
		plays.add(pair3);
		pair4[0] = "🗿";
		pair4[1] = "🖖"; // p1 = 1 ; p2 = 3
		plays.add(pair4);
		System.out.println(play(plays));
	}
}
