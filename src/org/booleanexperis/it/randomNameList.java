package org.booleanexperis.it;

import java.util.Random;

public class randomNameList {
	public static void main(String[] args) {
		String[] firstNames = {"Luca", "Luigi", "Mario", "Antonio"};
		String[] lastNames = {"Aladdin", "Betta", "Rossi", "Ancona"};
		
		for (int i = 0; i < lastNames.length; i++) {
			Random r = new Random();
			int randomNumber = r.nextInt(firstNames.length);
			int randomNumberTwo = r.nextInt(lastNames.length);
			System.out.println(firstNames[randomNumber] + " " + lastNames[randomNumberTwo]);
		}
		
	}
}
