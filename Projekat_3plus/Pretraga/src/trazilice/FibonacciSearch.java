package trazilice;

import razvrstavanje.HeapSort;

/**
 * 
 * @author emma
 * 
 * FibonacciSearch
 * pretraga zasnovana na fibonačijevim brojevima: 1,1,2,3,5,8,...
 * zahteva da niz bude sortiran
 * zavadi i vladaj algoritam
 * 
 * osnovna ideja je da se prvo pronađe najmanji fibonačijev broj koji je 
 *    veći ili jednak dužini niza.
 *
 */

public class FibonacciSearch {
	
	//prilagođeno samo za celobrojne nizove
	public static int fi_search(int[] arr, int val) {
		int n = arr.length;
		HeapSort.heap_sort(arr); //sorting arr
		/* Initialize fibonacci numbers */
        int fibMMm2 = 0; // (m-2)'th Fibonacci No.
        int fibMMm1 = 1; // (m-1)'th Fibonacci No.
        int fibM = fibMMm2 + fibMMm1; // m'th Fibonacci
 
        /* fibM is going to store the smallest
        Fibonacci Number greater than or equal to n */
        while (fibM < n) {
            fibMMm2 = fibMMm1;
            fibMMm1 = fibM;
            fibM = fibMMm2 + fibMMm1;
        }
 
        // Marks the eliminated range from front
        int offset = -1;
 
        /* while there are elements to be inspected.
        Note that we compare arr[fibMm2] with x.
        When fibM becomes 1, fibMm2 becomes 0 */
        while (fibM > 1) {
            // Check if fibMm2 is a valid location
            int i = Math.min(offset + fibMMm2, n - 1);
 
            /* If x is greater than the value at
            index fibMm2, cut the subarray array
            from offset to i */
            if (arr[i] < val) {
                fibM = fibMMm1;
                fibMMm1 = fibMMm2;
                fibMMm2 = fibM - fibMMm1;
                offset = i;
            }
 
            /* If x is less than the value at index
            fibMm2, cut the subarray after i+1 */
            else if (arr[i] > val) {
                fibM = fibMMm2;
                fibMMm1 = fibMMm1 - fibMMm2;
                fibMMm2 = fibM - fibMMm1;
            }
 
            /* element found. return index */
            else
                return i;
        }
 
        /* comparing the last element with x */
        if (fibMMm1 == 1 && arr[n-1] == val)
            return n-1;
 
        /*element not found. return -1 */
		return -1;
	}

}
