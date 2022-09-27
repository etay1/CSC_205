package sortingsearching;

public class SortComparator {
	public static void main(String[] args) {
		
	 Integer[] a = new Integer[128];
	 for (int k = 0; k < a.length; k++)
		 a[k] = (int) (Math.random() * 100000);
	 
	 Integer[] b = new Integer[128];
	 for (int k = 0; k < b.length; k++)
		 b[k] = a[k];
	 
	 Integer[] c = new Integer[128];
	 for (int k = 0; k < c.length; k++)
		 c[k] = a[k];
	 
	 GenericSortingMethods.selectionSort(a);
	 GenericSortingMethods.insertionSort(b);
	 GenericSortingMethods.bubbleSort(c);
	 System.out.println();

	 //-------------------------------------


	 
	 Integer[] d = new Integer[512];
	 for (int i = 0; i < d.length; i++)
		 d[i] = (int) (Math.random() * 100000);
	
	 
	 Integer[] e = new Integer[512];
	 for (int i = 0; i < e.length; i++)
		 e[i] = d[i];
	 
	 Integer[] f = new Integer[512];
	 for (int i = 0; i < f.length; i++)
		 f[i] = d[i];
	 
	 GenericSortingMethods.selectionSort(d);
	 GenericSortingMethods.insertionSort(e);
	 GenericSortingMethods.bubbleSort(f);
	 System.out.println();
	 
	 
	 //-------------------------------------
	 
	 Integer[] g = new Integer[2048];
	 for (int i = 0; i < g.length; i++)
		 g[i] = (int) (Math.random() * 100000);
	
	 
	 Integer[] h = new Integer[2048];
	 for (int i = 0; i < h.length; i++)
		 h[i] = g[i];
	 
	 Integer[] j = new Integer[2048];
	 for (int i = 0; i < j.length; i++)
		 j[i] = g[i];
	 
	 GenericSortingMethods.selectionSort(g);
	 GenericSortingMethods.insertionSort(h);
	 GenericSortingMethods.bubbleSort(j);
	 System.out.println();
	 
	 //---------------------------------------------------
	
	 Integer[] k = new Integer[8192];
	 for (int i = 0; i < k.length; i++)
		 k[i] = (int) (Math.random() * 100000);
	
	 
	 Integer[] l = new Integer[8192];
	 for (int i = 0; i < l.length; i++)
		 l[i] = k[i];
	 
	 Integer[] m = new Integer[8192];
	 for (int i = 0; i < m.length; i++)
		 m[i] = k[i];
	 
	 GenericSortingMethods.selectionSort(k);
	 GenericSortingMethods.insertionSort(l);
	 GenericSortingMethods.bubbleSort(m);
	 System.out.println();

	 //-------------------------------------

	 
		 
	}
}
