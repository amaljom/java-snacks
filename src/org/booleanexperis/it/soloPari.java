package org.booleanexperis.it;

import java.util.Scanner;

public class soloPari {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci un numero e verifica che sia pari:");
		int userNumber=sc.nextInt();
		
		if(userNumber%2==0) {
			System.out.println(userNumber);
		}else {
			System.out.println(userNumber + 1);
		}
	}
}
