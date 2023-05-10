package razvrstavanje;


/**
 * 
 * @author emma
 * 
 * Sortiranje niza
 * 
 * bubble sort
 * selection sort
 * 
 */

public class BubbleSort {
	
	/**
	 * 
	 * @param <T> 
	 * @param arr
	 * 
	 * BUBBLE sort
	 * sporo i zahtevno, nije za veliku količinu podataka
	 * proverava se svaki sa svakim
	 * prolazak I 
	 * 6 3   0 5  , 6 > 3 	=> 3 6 0 5
	 * 3   6 0   5  , 6 > 0 => 3 0 6 5
	 * 3 0   6 5  , 6 > 5 	=> 3 0 5 6
	 * prolazak II 
	 * 3 0   5 6  , 3 > 0	=> 0 3 5 6
	 * 3   0 5   6  , 0 < 5 => 0 3 5 6  (bez promene)
	 * 3 0   5 6  , 5 < 6	=> 0 3 5 6 	(bez promene)
	 * prolazak III;
	 * 0 3 5 6  =>  0 3 5 6 (pošto je sortirano, samo vrti, ne radi ništa) x 3
	 * 
	 */
	public static<T> void bubble_sort(T[] arr) {	
		int d = arr.length - 1; // index poslednjeg člana
		int r = 0;
		for(int i=0; i < d; i++) {
			for(int j=0; j < d - i; j++) {
				r = Swap.compare(arr[j], arr[j+1]);		
				if( r > 0) {
					Swap.swap(arr, j, j+1);
				}				
			}	
		}
		
	}
	
}
