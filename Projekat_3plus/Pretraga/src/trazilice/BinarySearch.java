package trazilice;

import razvrstavanje.HeapSort;

/**
 * 
 * @author emma
 * 
 * BINARY search
 * zahteva da podaci budu sortirani
 * vreme pristupa svakom elementu je konstantno
 * pretraga se odvija iz više koraka
 * I - pronađe se središnja vrednost m=(L+R)/2
 * II - ako  je ta vrednost veća od tražene, dalje se pretražuju levo (L,m)
 *      a ako je veća pretražuje se desno (m+1,R)
 * III - ponavljaju se koraci I i II sve dok se ne dođe do tražene vrednosti,
 *       ili dok ne ostane samo jedan element različit od tražene vrednosti
 * IV - ako je vrednost pronađena, vraća njen indeks; u suprotnom vraća -1
 * 
 *
 */

//package razvrstavanje;
//import Sortiranje.razvrstavanje.*;

public class BinarySearch {
	
	// samo za celobrojne indekse, sortirane u rastućem redosledu (asc)
	public static int bi_search(int[] arr, int val) {
		/*
		 * prvo sortirati niz
		 * iskoristiću HeapSort.heap_sort() metod jer je on prilagođen za celobrojne nizove
		 * (ostali su univerzalni, ali samo za nizove instancirane iz klasa omotača)
		 */
		HeapSort.heap_sort(arr);

		//zatim se vrši pretraga
		int l = 0, r = arr.length - 1; // levi, desni indeks (granice)
		int m; // središnji indeks 		
        while (l <= r) {            
        	m = l + (r - l) / 2; 
            if (arr[m] == val)
                return m; // ako je jednako vrati indeks
 
            if (arr[m] < val)
                l = m + 1;  // ako je manje, traži desno    
            else
                r = m - 1; // ako je veće, traži levo            
        }
        
        return -1; // nije pronađeno, vrati -1
        
	}

}

/*
 * Hint - kako pridružiti klase i metode drugog projekta (jedan od načina):
 * desni klik na naziv projekta -> Build path... -> izabrati karticu Projects ...
 *    pa dugme ADD, izabrati projekat -> OK/Close.
 *    zatim Project -> Clean project
 *    pa ... ukucati import naziv-paketa-projekta-koji-je-povezan.Klasa (ili .* za sve klase i metode tog projekta)
 *    */
