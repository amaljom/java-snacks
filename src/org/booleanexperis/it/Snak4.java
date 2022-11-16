package org.booleanexperis.it;

import java.util.Random;

public class Snak4 {
	
	public static void main(String[] args) {
		String[] listOne = {"Luca", "Luigi", "Mario", "Antonio"};
		String[] listTwo= {"Aladdin", "Betta", "Rossi", "Ancona", "lorem", "ipsum"};
	
		int lengthDiff=0;
		
		if( listOne.length > listTwo.length ) {
			lengthDiff= listOne.length - listTwo.length;
		}else {
			lengthDiff = listTwo.length - listOne.length;
		}
		
		for (int i = 0; i < lengthDiff; i++) {
			Random outputNumber = new Random();
			System.out.println(outputNumber.nextInt());
		}
	}
}
