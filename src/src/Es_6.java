package src;

import java.util.Scanner;

public class Es_6 {
		/*
		 * Scrivere un programma che permetta all’utente di inserire N numeri interi in un vettore
			denominato VAL e:
			a) Calcolare e stampare la media aritmetica dei valori inseriti nelle posizioni
			dispari;
			b) Contare e comunicare quanti numeri presenti nel vettore sono pari;
			c) Cercare e comunicare il numero maggiore;
			
		 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = 8, media = 0, conta = 0, somma = 0, conta_pari = 0, max = 0;
		
		int [] VAL = new int [N];
	
		for(int i = 0; i < N; i++) {
			System.out.println("Inserisci un numero: ");
			VAL[i] =  in.nextInt();
			
			if(i % 2 != 0) {
				conta++;
				somma += VAL[i];
			}
			if(VAL[i] % 2 == 0) {
				conta_pari++;
			}
			if(i == 0) {
				max = VAL[i];
			}
			else {
				if(VAL[i] > max) {
					max = VAL[i];
				}
			}
			
		}
		
		media = somma / conta;		
		System.out.println("La media degli elementi nelle posizioni dispari è: " + media);
		System.out.println("Il numero di elementi pari sono: " + conta_pari);
		System.out.println("Il numero maggiore è: " + max);
		in.close();
		

	}

}
