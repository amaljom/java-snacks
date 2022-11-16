package org.booleanexperis.it;

public class snack7 {
	public static void main(String[] args) {
		
		String[] words = { "Lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit" };
		
		/* STRINGA CONCATENATA */
		String stringaConcatenata = "";
		
		for (int i = 0; i < words.length; i++) {
			stringaConcatenata += words[i];
		}
		
		System.out.println(stringaConcatenata);
		
		/* STRINGA CONCATENATA AL CONTRARIO*/
		String stringaConcatenataBackword = "";
		
		for (int i = words.length-1; i >= 0 ; i--) {
			stringaConcatenataBackword += words[i];
		}
		
		System.out.println(stringaConcatenataBackword);
		
		/* LA PAROLA PIU LUNGA E LA SUA LUNGHEZZA */
		String longestString=words[0];
		for (int z = 1; z < words.length; z++) {
			if( longestString.length() < words[z].length()  ) {
				longestString = words[z];
			}
		}
		System.out.println(longestString + "è la parola piu lunga coi suoi "+ longestString.length() + " caratteri");
		
		/* LA PAROLA PIU CORTA E LA SUA LUNGHEZZA */
		String shortestString=words[0];
		for (int z = 1; z < words.length; z++) {
			if( shortestString.length() > words[z].length()  ) {
				shortestString = words[z];
			}
		}
		System.out.println(shortestString + " è la parola piu lunga coi suoi "+ shortestString.length() + " caratteri");
		
		
	
	}
}
