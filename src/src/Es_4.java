package src;

import java.util.Scanner;

public class Es_4 {
	/*
	 * Scrivere un programma che carica da tastiera un array di N caratteri e dopo averlo stampato conta
	 * quante lettere maiuscole e quante lettere minuscole sono presenti.
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int N = 5;
		int contaMaiu = 0, contaMinu = 0;
		char [] vett =  new char [N];
		
		for(int i = 0; i < vett.length; i++) {
			System.out.println("Inserisci un carattere: ");
			vett[i] =  in.next().charAt(0);			
		}
		
		for(int i = 0; i < vett.length; i++) {
			System.out.print(" | " + vett[i]);	
		}
		System.out.println();
		
		for(int i = 0; i < vett.length; i++) {
			// 65 - 90 maiuscole
			// 97 - 122 minuscole
			if(vett[i] >= 65 && vett[i] <= 90) {
				contaMaiu++;
			}
			else if(vett[i] >= 97 && vett[i] <= 122) {
				contaMinu++;
			}
		}
		
		System.out.println("Le maiuscole sono: " + contaMaiu);
		System.out.println("Le maiuscole sono: " + contaMinu);
		
		in.close();
	}

}
