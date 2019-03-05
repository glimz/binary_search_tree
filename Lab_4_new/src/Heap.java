
public class Heap <E extends Comparable>{
	
	private E[] heap;
	private int n = 0; // size of current heap
	
	public Heap(int size) {
		heap = (E[]) new Comparable [size];		
	} 
	
	public void heapify(E[] array) {
		
		for (E element :array) {
			insert(element);
		}
	}
public void insert(E element) {
	heap [++n] = element;
	swim(n);
}	
	private void swim(int i) {
	// TODO Auto-generated method stub
		//while (i < 1 && less(heap[i/2], heap[i])) {
		//	exchange(i/2, i);
		//	i = i/2;
			
		//}	
}
	
	public E getMax() {
		E max = heap[1];
		exchange (1, n--);
		sink(1);
		heap [n+1] = null;
		return max;
		
	}

	private void sink(int i) {
		// TODO Auto-generated method stub
		while (2 * i <= n){
			int j = 2*i;
			if (j < n && less(heap[j], heap[j + 1])) j++;
			if (!less(heap[i], heap [j])) break;
			exchange(i, j);
			i = j;
			
			
		}
		
	}

	private void exchange(int i, int j) {
		// TODO Auto-generated method stub
		i = j;
	}

}

/*
public class Heap {

	public static void sort(Comparable[] pq) {
		int n = pq.length;
		for (int i = n / 2; i >= 1; i--)
			sink(pq, i, n);
		while (n > 1) {
			exch(pq, 1, n--);
			sink(pq, 1, n);
		}
	}

	private static void sink(Comparable[] pq, int k, int n) {
		while (2 * k <= n) {
			int j = 2 * k;
			if (j < n && less(pq, j, j + 1))
				j++;
			if (!less(pq, k, j))
				break;
			exch(pq, k, j);
			k = j;
		}
	}

	private static boolean less(Comparable[] pq, int i, int j) {
		return pq[i - 1].compareTo(pq[j - 1]) < 0;
	}

	private static void exch(Object[] pq, int i, int j) {
		Object swap = pq[i - 1];
		pq[i - 1] = pq[j - 1];
		pq[j - 1] = swap;
	}

	// print array to standard output
	private static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++) {

		}
	}
}*/