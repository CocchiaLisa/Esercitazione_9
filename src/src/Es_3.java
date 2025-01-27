package src;

import java.util.Random;
import java.util.Scanner;

public class Es_3 {
	/*
	 * Scrivere un programma che, dopo aver caricato casualmente un vettore di N (scelto dall’utente) 
	 * numeri compresi tra 1 e 100, stampi il vettore e conti quanti numeri nel vettore sono multipli 
	 * del numero k inserito da tastiera.
*/
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int N, k, count = 0;
		
		System.out.println("Inserisci il numero di elementi dell'array:");
		N = in.nextInt();
		
		int [] vett = new int [N];
		
		for(int i = 0; i < vett.length; i++) {
			// genero num random [0 - 99] + 1
			vett[i] = rand.nextInt(100) + 1; 
			System.out.print(" | " + vett[i]);
		}
		
		System.out.println("\n\nInserisci un numero");
		k = in.nextInt();
		
		for(int i = 0; i < vett.length; i++) {
			if(vett[i] % k == 0) { // se è divisibile per k
				count++;
			}
		}
		
		System.out.println("I multipli di k sono: " + count);
		in.close();
	
	}

}
