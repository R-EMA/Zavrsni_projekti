package razvrstavanje;


/**
 * 
 * @author emma
 * 
 * INSERTION sort
 * jednostavan, ali spor algoritam
 * niz se posmatra element po element, a sortiranje je
 * bazirano na proveri susednih elemenata i premeštanje 
 * većeg elementa nalevo sve dok isti ne postane manji 
 * (asc sortiranje)
 * pogodan je za manje nizove i nizove koji su već delimično sortirani
 * (često se kombinuje sa drugim algoritmima sortiranja
 * 
 *
 */

public class InsertionSort {
	
	public static<T> void insertion_sort(T[] arr) {
		int d = arr.length; //dužina niza	
		T min_val; // čuva vrednost kojom se vrši poređenje
		int j = 0; // drugi pomoćni brojač
		
		for(int i=0; i < d; i++) {
			min_val = arr[i]; // "inicijalizacija najmanje vrednosti"
			j = i - 1; // inicijalizacija pomoćnog brojača
			while(j >= 0  &&  Swap.compare(min_val, arr[j]) < 0) {
				// ako je j u opsegu, a arr[j] veće od min_val, 
				// zameni vrednosti
				arr[j+1] = arr[j];
				j--; 
			}
			arr[j+1] = min_val;
		}
		
	}

}
