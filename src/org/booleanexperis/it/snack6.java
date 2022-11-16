package org.booleanexperis.it;

public class snack6 {
	public static void main(String[] args) {
		
		int[] arr1 = { 70, 39, 18, 30, 51, 59, 1, 47, 67, 87 };
		int[] arr2 = { 42, 56, 7, 42, 62, 90, 86, 54, 45, 32 };
		
		/* SOMMATORIA */ 
		int[] arrSommatoria = new int[10];
		
		for (int i = 0; i < arr1.length; i++) {
			arrSommatoria[i] = arr1[i] + arr2[i]; 
		}
		for (int i = 0; i < arrSommatoria.length; i++) {
			
			System.out.print(arrSommatoria[i] + ",");
		}
		System.out.println(" ");
		
		/* VALORE MINIMO */
		int minValue=arr1[0];
		for (int j = 0; j < arr1.length; j++) {
			if(minValue > arr1[j]){
				minValue = arr1[j];
			}
		}
		System.out.println("il valore più piccolo del primo array è:" + minValue);
		
		int minValuetwo=arr2[0];
		for (int j = 0; j < arr2.length; j++) {
			if(minValuetwo > arr2[j]){
				minValuetwo = arr2[j];
			}
		}
		System.out.println("il valore più piccolo del secondo array è:" + minValuetwo);
		
		/* VALORE MASSIMO */ 
		int maxValue=arr1[0];
		for (int j = 0; j < arr1.length; j++) {
			if(maxValue < arr1[j]){
				maxValue = arr1[j];
			}
		}
		System.out.println("il valore più grande del primo array è:" + maxValue);
		
		int maxValue2=arr2[0];
		for (int j = 0; j < arr2.length; j++) {
			if(maxValue2 < arr2[j]){
				maxValue2 = arr2[j];
			}
		}
		System.out.println("il valore più grande del secondo array è:" + maxValue2);
		
		/* MEDIA DI ENTRAMBI GLI ARRAY */
		int somma = 0;
		for (int z = 0; z < arr1.length; z++) {
			somma += arr1[z];
		}
		for (int x = 0; x < arr2.length; x++) {
			somma += arr1[x];
		}
		int totArrayLenght = arr1.length + arr2.length;
		
		int media = somma / totArrayLenght;
		System.out.println("La media tra la somma di entrambi gli array è di:" + media);
		
		int sommaArr1 = 0;
		for (int z = 0; z < arr1.length; z++) {
			sommaArr1 += arr1[z];
		}
		System.out.println("la somma di tutti gli elementi del primo array è di:" + sommaArr1);
		
		int sommaArr2 = 0;
		for (int z = 0; z < arr2.length; z++) {
			sommaArr2 += arr2[z];
		}
		System.out.println("la somma di tutti gli elementi del secondo array è di:" + sommaArr2);
	}
}
