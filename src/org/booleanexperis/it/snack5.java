package org.booleanexperis.it;

/* trovare il valore minimo
* trovare il valore massimo
* calcolare la media
* calcolare la sommatoria
*/
public class snack5 {
	public static void main(String[] args) {
		
		int[] arr = { 70, 39, 18, 110, 51, 59, 1, 47, 67, 87 };
		
		int maxValue = arr[0];
		int minValue = arr[0];
		int media;
		int[] sommatoria;
		
		/* 1 */
		
		for (int i = 0; i < arr.length; i++) {
			if(maxValue < arr[i]){
				maxValue = arr[i];
			}
		}
		System.out.println(maxValue);
		
		/* 2 */
		
		for (int j = 0; j < arr.length; j++) {
			if(minValue > arr[j]){
				minValue = arr[j];
			}
		}
		System.out.println(minValue);
		
		/* 3 */
		int somma = 0;
		for (int z = 0; z < arr.length; z++) {
			somma += arr[z];
		}
		media = somma / arr.length;
		
		System.out.println(media);
		
		/* sommatoria */
	}
}
