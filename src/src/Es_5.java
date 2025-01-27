package src;
import java.util.Scanner;
public class Es_5 {
	/*
	 * Scrivere un programma che permetta all’utente di inserire esclusivamente una sequenza di
		“0” e “1” all’interno di un vettore di 8 elementi.
		Il programma dovrà, inoltre,
		a) Contare e stampare il numero di 1 presenti all’interno del vettore;
		b) Calcolare e stampare la somma dei numeri in posizione dispari;
		c) Il numero decimale corrispondente;
		d) Individuare la sequenza più lunga di 1 presente all’interno del vettore e
		visualizzare la lunghezza
	 * */

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int dec = 0, somma = 0, cont = 0;

		int [] vett	= new int[8];

		for (int i = 0; i<8 ;i++) {
			do {
				System.out.println("inserisci 0 o 1");
				vett[i] = in.nextInt();
			} while (vett[i] != 0 && vett[i] != 1);

			if(vett[i] == 1) {
				cont++;
			}

			// sommo gli elementi in POSIZIONE dispari 
			if(i % 2 != 0 ) {
				somma += vett[i];
			}

			// calcolo il numero decimale corrispondente
			dec += vett[i] * Math.pow(2, i);
		}

		// stampo il vettore
		for (int i = 0; i<8 ;i++) {
			System.out.print(vett[i]);
		}
		
		System.out.println("\n\nIl valore decimale è: " + dec);
		System.out.println("La somma dei numeri in posizione dispari è: " + somma);
		System.out.println("Sono presenti " + cont  + " cifre uguali a 1");
		
		in.close();
	}
}
