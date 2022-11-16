package org.booleanexperis.it;

import java.util.Random;

public class snak8 {
	public static void main(String[] args) {
		
		Random number = new Random(128);
		
		int[] arrayNum = new int[10];	
		
		for (int i = 0; i < 10; i++) {
			arrayNum[i] = number.nextInt(100)-50;
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(arrayNum[i] + " ");
		}
		System.out.println();
		/* TROVARE IL VALORE ASSOLUTO PIU GRANDE */
		int numMax = arrayNum[0];;
		int index=0;
		for (int i = 0; i < arrayNum.length; i++) {
			if( numMax < Math.abs(arrayNum[i])) {
				numMax = Math.abs(arrayNum[i]);
				index = i;
			}
		}
		System.out.println(arrayNum[index]);
		
		/* ROVARE IL VALORE PIU PICCOLO */
		
		int numMin = arrayNum[0];
		int indexMin = 0;
		for (int i = 0; i < arrayNum.length; i++) {
			if( numMin > Math.abs(arrayNum[i])) {
				numMin = Math.abs(arrayNum[i]);
				indexMin = i;
			}
		}
		System.out.println(arrayNum[indexMin]);
		
		/* SOMMATORIA DEI MULTIPLI DI 5 */
		
		int sum = 0;
		for (int i = 0; i < arrayNum.length; i++) {
			if( arrayNum[i] % 5 == 0 ) {
				sum += arrayNum[i];
			}
		}
		System.out.println(sum);
	}
}
