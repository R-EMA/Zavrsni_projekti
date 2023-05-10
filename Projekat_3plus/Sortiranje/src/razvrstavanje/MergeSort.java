package razvrstavanje;

/**
 * 
 * @author emma
 * 
 * Sortiranje niza - MERGE sort
 * 
 * MERGE sort
 * brzo i stabilno, pogodno za velike količine podataka
 * bazirano na ispitivanje vrednosti sa suprotnih krajeva i 
 * deljenje istog na polovine (polovina od celog, polovina od polovine, polovina od četvrtine, ...)
 * zahteva dodatan prostor za čuvanje podataka (međurezultata)
 *
 */

public class MergeSort {
		
	// spajanje podnizova, pomoćni metod
	@SuppressWarnings("unchecked")
	private static<T> void merge(T[] arr, int l, int m, int r) {
        // veličine "polovina" - podnizova
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* privremeni nizovi za čuvanje međurezultata */     
		T[] left_arr = (T[]) new Object[n1];
        T[] right_arr = (T[]) new Object[n2];
 
        /*dodela vrednosti u privremene nizove*/
        for (int i = 0; i < n1; ++i)
        	left_arr[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
        	right_arr[j] = arr[m + 1 + j];
 
        /* spajanje nizova */
        int rez = 0; // za poređenje vrednosti
        int i = 0, j = 0; // indeksi       
        int k = l; // indeks spojenog podniza
        while (i < n1 && j < n2) {
        	rez = Swap.compare(left_arr[i], right_arr[j]);
            if ( rez <= 0 ) {
                arr[k] = left_arr[i];
                i++;
            }
            else {
                arr[k] = right_arr[j];
                j++;
            }
            k++;
        }
 
        /* dodavanje potencijalnih ostataka levog niza */
        while (i < n1) {
            arr[k] = left_arr[i];
            i++;
            k++;
        }
 
        /* dodavanje potencijanih ostataka desnog niza */
        while (j < n2) {
            arr[k] = right_arr[j];
            j++;
            k++;
        }
    }
 
    /* glavni metod za sortiranje niza, koristi metod merge() */
    public static<T> void merge_sort(T[] arr, int l, int r) {
        if (l < r) {
            // Find the middle point
            int m = l + (r - l) / 2;
 
            // sortiranje polovina niza
            merge_sort(arr, l, m); // levo
            merge_sort(arr, m + 1, r); // desno
 
            // spajanje sortiranih polovina
            merge(arr, l, m, r);
        }
    }
	

}
