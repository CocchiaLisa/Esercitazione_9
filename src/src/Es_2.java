package src;

import java.util.Random;
import java.util.Scanner;

public class Es_2 {
	/*	Scrivere programma Java che carichi un vettore di N interi casuali tra 1 e 100 e sommi tutti gli
		elementi che sono multipli di 3*/
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Random rand = new Random();
		
		int N = 10, somma = 0;
		int [] vett = new int [N];
		
		for(int i = 0; i < N; i++) {
			vett[i] = rand.nextInt(100) + 1;
			
			if(vett[i] % 3 == 0) {
				somma +=  vett[i];
			}
		}
		
		System.out.println("La somma dei valori multipli di tre è: " + somma);
		in.close();
	}

}
