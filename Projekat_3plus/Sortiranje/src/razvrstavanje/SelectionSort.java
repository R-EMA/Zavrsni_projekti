package razvrstavanje;


/**
 * 
 * @author emma
 * 
 * Sortiranje niza - SELECTION sort
 * 
 */

public class SelectionSort {
	
		
	/**
	 * 
	 * @param <T>
	 * @param arr
	 * 
	 * SELECTION sort
	 * u svakom prolasku izdvaja najmanju (asc) / najveću (desc) vrednost
	 * i smešta je na početku
	 * manji broj prolazaka u odnosu na bubble sort i manje zauzeće resursa
	 * 
	 * prolazak I:  (i=0,1,2; j=1,2,3)
	 * 6 3 0 5  , min=6
	 * 6 3 0 5	, 6 > 3	=> min=3 , 3>0 => min=0 , 0 < 5		=> 0 3 6 5
	 * prolazak II  (i=1,2; j=2,3)
	 * (0) 3 6 5  , min=3 
	 * 3 6 5  , 3 < 6 => 3 < 5 => 3 6 5   (bez promene min vrednosti)
	 * prolazak III (i=2; j=3)
	 * (0 3) 6 5  , min=6
	 * 6 5  , 6 > 5 => min=5   =>   0 3 5 6
	 * 0 3 5 6  
	 */
	public static<T> void selection_sort(T[] arr) {
		int d = arr.length; // dužina niza
		int min_index; // vrednost najmanjeg indeksa
		for(int i = 0; i < d - 1; i++) {
			min_index = i;
			for(int j = i + 1; j < d; j++) {
				if ( Swap.compare(arr[j], arr[min_index]) < 0 ) {
					min_index = j;
				}
			}
			// swap values
			Swap.swap(arr, min_index, i);
		}
		
	}

}
