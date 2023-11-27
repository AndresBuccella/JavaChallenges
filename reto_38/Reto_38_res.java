package reto_38;

public class Reto_38_res {
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.LinkedList;

	public class Main {

		public static void main(String[] args) {

			ArrayList<Integer> arr = new ArrayList<>();
			arr.add(1);
			arr.add(5);
			arr.add(3);
			arr.add(2);
			ArrayList<LinkedList<Integer>> arrC = reto_38(arr, 6);
			String resultado = "";
			for(LinkedList<Integer> ll:arrC) {
				resultado+="[";
				for(Integer i : ll) {
					resultado += i + ", ";
				}
				resultado+="], ";
				
			}
			System.out.println(resultado);
			

		}
		
		/*
		 * Crea una función que encuentre todas las combinaciones de los números
		 * de una lista que suman el valor objetivo.
		 * - La función recibirá una lista de números enteros positivos
		 *   y un valor objetivo.
		 * - Para obtener las combinaciones sólo se puede usar
		 *   una vez cada elemento de la lista (pero pueden existir
		 *   elementos repetidos en ella).
		 * - Ejemplo: Lista = [1, 5, 3, 2],  Objetivo = 6
		 *   Soluciones: [1, 5] y [1, 3, 2] (ambas combinaciones suman 6)
		 *   (Si no existen combinaciones, retornar una lista vacía)
		 */
		
		public static ArrayList<LinkedList<Integer>> reto_38(ArrayList<Integer> arr, int target) {
			ArrayList<LinkedList<Integer>> result = new ArrayList<>();
			LinkedList<Integer> status = new LinkedList<>();
			if(arr!= null && arr.size()!= 0) {
				Collections.sort(arr);
				for(int i = 0; i < arr.size();i++) {
					find_combinations(status, result, i, arr, target);
				}
				
			}
			return result;
		}
		//19.50
		private static void find_combinations(LinkedList<Integer> status, ArrayList<LinkedList<Integer>> result, 
											int index, ArrayList<Integer> arr, int target){
			
			if(target == 0)
				result.add(new LinkedList<Integer>(status));
			else
				for(int i = index; i < arr.size() && target > 0; i++) {
					if(i > 0 && arr.get(i) == arr.get(i-1)) //evita repetidos en lista original
						continue;
					status.add(0, arr.get(i));
					target-=arr.get(i);
					index++;
					find_combinations(status, result, index, arr, target);
					target+=arr.get(i);
					status.remove(0);
				}
			System.out.println(status);
		}

	}

}
