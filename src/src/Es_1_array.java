package src;

import java.util.Scanner;

public class Es_1_array {

	/*
	 * Dati N numeri interi letti da tastiera si vogliono calcolare e stampare su schermo diversi
		risultati:
		• quanti sono i numeri positivi, nulli e negativi
		• quanti sono i numeri pari e dispari
		• se la sequenza dei numeri inseriti è crescente, decrescente oppure né crescente né
		decrescente.
		Suggerimento. Una sequenza è crescente se ogni numero è maggiore del precedente,
		decrescente se ogni numero è minore del precedente, né crescente né decrescente in tutti gli
		altri casi
	 */

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = 5, positivi = 0, negativi = 0, nulli = 0, pari = 0, dispari = 0;
		int [] vett = new int [N];
		boolean crescente = true, decrescente = true;

		for(int i = 0; i < N; i++) {
			System.out.println("Inserisci un numero");
			vett[i] = in.nextInt();

			if(vett[i] > 0) {
				positivi++;
			}
			else if(vett[i] < 0) {
				negativi++;
			}
			else {
				nulli++;
			}

			if(vett[i] % 2 == 0) {
				pari++;
			}
			else {
				dispari++;
			}
		}

		int prec = vett[0];
		for(int i = 1; i < N; i++) {
			if(prec > vett[i]) {
				crescente = false;
			}
			if(prec < vett[i]){
				decrescente = false;
			}
		}
		if(decrescente) {
			System.out.println("La serie è decrescente");
		}
		else if(crescente) {
			System.out.println("La serie è crescente");
		}
		else {
			System.out.println("Non è ne crescente ne decrescente");
		}


		System.out.println("I numeri positivi sono: " + positivi
				+ "\nI numeri negativi sono: " + negativi
				+ "\nI numeri nulli sono: " + nulli
				+ "\nI numeri pari sono: " + pari
				+ "\nI numeri dispari sono: " + dispari);
		in.close();
	}

}
