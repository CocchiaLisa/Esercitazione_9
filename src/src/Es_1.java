package src;

import java.util.Scanner;

public class Es_1 {

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

		int N = 5, positivi = 0, negativi = 0, nulli = 0, pari = 0, dispari = 0, num, prec = 0; 
		boolean crescente = true, decrescente = true;

		for(int i = 0; i < N; i++) {
			System.out.println("Inserisci un numero");
			num = in.nextInt();

			if(num > 0) {
				positivi++;
			}
			else if(num < 0) {
				negativi++;
			}
			else {
				nulli++;
			}

			if(num % 2 == 0) {
				pari++;
			}
			else {
				dispari++;
			}
			if(i == 0) {
				prec = num;
			}
			else {

				if(prec > num) {
					crescente = false;
				}
				if(prec < num){
					decrescente = false;
				}
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
