package trazilice;

/**
 * 
 * @author emma
 * 
 * LinearSearch
 * sekvencionalno pretraživanje
 * počinje se od jednog kraja i vrši pretraživanje element po element
 * uvećavanjem (asc) ili umanjivanjem (desc) vrednosti indeksa za 1
 * pretraga staje ako je pronađena zadata vrednost,vraćanjem njenog indeksa
 * u suprotnom indeks se uveća, odnosno umanji za 1
 *
 */

public class LinearSearch {
	
	/*
	 * metod za pretragu od početka niza (asc)
	 * prilagođen za rad sa jednodimenzionalnim celobrojnim nizovima
	 * 
	 * arr - int niz koji se pretražuje
	 * val - vrednost koja se traži
	 * 
	 * vraća -1 ako nije pronađen element, vrednost indeksa ako je pronađen
	 */
	public static int li_search(int[] arr, int val) {
		for(int i=0; i < arr.length; i++) {
			if ( arr[i] == val )
				return i; // vrednost je pronađena na poziciji i
		}
		return -1; //vrednost nije pronađena
			
	}

}

/*
 * P.S. Ovo je ono što inače radimo kada tražimo nešto u nizu / listi / datoteci
*/