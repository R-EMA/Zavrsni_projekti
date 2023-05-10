package razvrstavanje;

/**
 * 
 * @author emma
 * 
 * različiti načini sortiranja nizova
 *
 */

public class Main {
	
	public static<V> void arr_reset(V[] a1, V[] a2) {
		int i = 0;
		for(V e : a2) {
			a1[i] = e;
			i++;
		}
	}
	
	public static void main(String[] args) {
		
		Integer[] niz = {6,3,0,5,11,10,21,25,16};
		Integer[] niz1 = {6,3,0,5,11,10,21,25,16}; //pomoćni niz koji služi za resetovanje glavnog
		// sortirano (asc): {0 3 5 6 10 11 16 21 25 }
		
		System.out.println("\nBubble sort");
		Swap.show_arr(niz);
		System.out.println("-----------");
		BubbleSort.bubble_sort(niz);		
		Swap.show_arr(niz);
		
		System.out.println("\nSelection sort");
		arr_reset(niz, niz1);
		Swap.show_arr(niz);
		System.out.println("-----------");
		SelectionSort.selection_sort(niz);		
		Swap.show_arr(niz);
				
		System.out.println("\nMerge sort");
		arr_reset(niz, niz1);
		Swap.show_arr(niz);
		System.out.println("-----------");
		MergeSort.merge_sort(niz, 0, niz.length - 1);
		Swap.show_arr(niz);
		
		System.out.println("\nInsertion sort");
		arr_reset(niz, niz1);
		Swap.show_arr(niz);
		System.out.println("-----------");
		InsertionSort.insertion_sort(niz);
		Swap.show_arr(niz);
		
		// int nizovi
		System.out.println("\nHeap sort");	
		int[] iniz = {6,3,0,5,11,10,21,25,16};
		HeapSort.show_arr(iniz);
		System.out.println("-----------");		
		HeapSort.heap_sort(iniz); // radi samo sa integer nizovima
		HeapSort.show_arr(iniz);
		
	}

}
