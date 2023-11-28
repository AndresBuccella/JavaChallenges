package reto_2;

import java.util.ArrayList;

/*
 * Escribe un programa que muestre cómo transcurre un juego de tenis y quién lo ha ganado.
 * El programa recibirá una secuencia formada por "P1" (Player 1) o "P2" (Player 2), según quien
 * gane cada punto del juego.
 * 
 * - Las puntuaciones de un juego son "Love" (cero), 15, 30, 40, "Deuce" (empate), ventaja.
 * - Ante la secuencia [P1, P1, P2, P2, P1, P2, P1, P1], el programa mostraría lo siguiente:
 *   15 - Love
 *   30 - Love
 *   30 - 15
 *   30 - 30
 *   40 - 30
 *   Deuce
 *   Ventaja P1
 *   Ha ganado el P1
 * - Si quieres, puedes controlar errores en la entrada de datos.   
 * - Consulta las reglas del juego si tienes dudas sobre el sistema de puntos.   
 */
public class Reto_2_partido_de_tenis {

	public static void tennisGame(ArrayList<String> points) {
		String[] game = new String[4];
		game[0] = "Love";
		game[1] = "15";
		game[2] = "30";
		game[3] = "40";
		int p1 = 0;
		int p2 = 0;
		final String player1 = "P1";
		final String player2 = "P2";

		for (String playerPoint : points) {
			if (playerPoint != player1 && playerPoint != player2)
				return;
		}
		for (String playerPoint : points) {
			if (playerPoint.equals(player1))
				p1++;
			else
				p2++;
			
			if (p1 > 3 || p2 > 3) { //The player wins when he scores more than 40 points and has a difference of 2 points with the other player.
				if (p1 - 2 >= p2) {
					System.out.println("Ha ganado el " + player1);
					return;
				} else if (p1 + 2 <= p2) {
					System.out.println("Ha ganado el " + player2);
					return;
				}
			}
			if (p1 >= 3 && p2 >= 3) {
				if (p1 == p2)
					System.out.println("Deuce");
				else //if they are different, the player who made the point has the advantage
					System.out.println("Ventaja " + playerPoint);
			}else
				System.out.println(game[p1]+" - "+game[p2]);
		}

		/*
		 * Sin inspiración int p1 = 0; int p2 = 0; if (points != null && points.size()
		 * != 0) { for (String playerPoint : points) { if (playerPoint != "P1" &&
		 * playerPoint != "P2") return; } for (String playerPoint : points) { // count
		 * points if (playerPoint.equals("P1")) if (p1 < 30) p1 += 15; else p1 += 10;
		 * else if (p2 < 30) p2 += 15; else p2 += 10;
		 * 
		 * // winner or advantage if (p1 > 40 || p2 > 40) { if (p1 + 20 == p2) {
		 * System.out.println("Ha ganado el P2"); return; } else if (p1 - 20 == p2) {
		 * System.out.println("Ha ganado el P1"); return; } else if (p1 != p2) { if (p1
		 * > p2) System.out.println("Ventaja P1"); else if (p1 < p2)
		 * System.out.println("Ventaja P2"); } } // game if (p1 >= 40 && p1 == p2)
		 * System.out.println("Deuce"); else if (p1 <= 40 && p2 <= 40) { if (p2 == 0)
		 * System.out.println(p1 + " - Love"); else if (p1 == 0)
		 * System.out.println("Love - " + p2); else System.out.println(p1 + " - " + p2);
		 * }
		 * 
		 * 
		 * } }
		 */
	}

	public static void main(String[] args) {
		ArrayList<String> game = new ArrayList<>();
		game.add("P1");
		game.add("P1");
		game.add("P1");
		game.add("P1");
		game.add("P1");
		game.add("P1");
		game.add("P1");
		game.add("P1");
		game.add("P1");
		game.add("P1");

		tennisGame(game);
	}
}
