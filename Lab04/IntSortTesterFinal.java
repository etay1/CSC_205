package TestingAndComplexity;
import java.util.*;
public class IntSortSearchTester {
	public static void main(String[] args) {
		linearSearchTester();
		binarySearchTester();
		sortTester();
	}
	
		
		public static void linearSearchTester() {
			
			int[] expectedOutput = new int[8];
			int[] actualOutput = new int[8];
			
			int[] test1 = {1};
			expectedOutput[0] = 0;
			actualOutput[0] = IntSortSearch.linearSearch(test1,1);
			
			int[] test2 = {2};
			expectedOutput[1] = -1;
			actualOutput[1] = IntSortSearch.linearSearch(test2, 1);
			
			int[] test3 = {1,2};
			expectedOutput[2] = 1;
			actualOutput[2] = IntSortSearch.linearSearch(test3, 2);
			
			int[] test4 = {1,2};
			expectedOutput[3] = -1;
			actualOutput[3] = IntSortSearch.linearSearch(test4, 3);
			
			int[] test5 = {1,2,3};
			expectedOutput[4] = 0;
			actualOutput[4] = IntSortSearch.linearSearch(test5, 1);
			
			int[] test6 = {1,2,3};
			expectedOutput[5] = 2;
			actualOutput[5] = IntSortSearch.linearSearch(test6, 3);
			
			int[] test7 = {1,2,3};
			expectedOutput[6] = 1;
			actualOutput[6] = IntSortSearch.linearSearch(test7, 2);
			
			int[] test8 = {1,2,3};
			expectedOutput[7] = -1;
			actualOutput[7] = IntSortSearch.linearSearch(test8, 4);
			
			System.out.println("Linear search test results: \n");
			compareArrays(expectedOutput,actualOutput);
			
		}
		
		public static void binarySearchTester() {
			
			int[] expectedOutput = new int[8];
			int[] actualOutput = new int[8];
			
			int[] test1 = {1};
			expectedOutput[0] = 0;
			actualOutput[0] = IntSortSearch.binarySearch(test1,1);
			
			int[] test2 = {2};
			expectedOutput[1] = -1;
			actualOutput[1] = IntSortSearch.binarySearch(test2,  1);
			
			int[] test3 = {1,2};
			expectedOutput[2] = 1;
			actualOutput[2] = IntSortSearch.binarySearch(test3,  2);
			
			int[] test4 = {1,2};
			expectedOutput[3] = -1;
			actualOutput[3] = IntSortSearch.binarySearch(test4,3);
			
			int[] test5 = {1,2,3};
			expectedOutput[4] = 0;
			actualOutput[4] = IntSortSearch.binarySearch(test5,1);
			
			int[] test6 = {1,2,3};
			expectedOutput[5] = 2;
			actualOutput[5] = IntSortSearch.binarySearch(test6, 3);
			
			int[] test7 = {1,2,3};
			expectedOutput[6] = 1;
			actualOutput[6] = IntSortSearch.binarySearch(test7, 2);
			
			int[] test8 = {1,2,3};
			expectedOutput[7] = -1;
			actualOutput[7] = IntSortSearch.binarySearch(test8, 4);
			
			System.out.println("\nBinary search test results:\n");
			compareArrays(expectedOutput,actualOutput);
			
		}
		
		public static void sortTester() {
			
			System.out.println("\nSort test results: \n");
			
			int[][] expectedOutput = new int[7][];                        //use same logic from search testers but with multidimensional arrays
			int[][] actualOutput = new int[7][];                          
			
			int[] test1 = {1};
			expectedOutput[0] = new int[] {1};
			actualOutput[0] = IntSortSearch.selectionSort(test1);
			
			
			int[] test2 = {2,1};
			expectedOutput[1] = new int[] {1,2};
			actualOutput[1] = IntSortSearch.selectionSort(test2);
			
			
			int[] test3 = {1,2,3};
			expectedOutput[2] = new int[] {1,2,3};
			actualOutput[2] = IntSortSearch.selectionSort(test3);
			
			
			int[] test4 = {3,2,1};
			expectedOutput[3] = new int[] {1,2,3};
			actualOutput[3] = IntSortSearch.selectionSort(test4);
			
			
			int[] test5 = {-1,-2,-3};
			expectedOutput[4] = new int[]{-3,-2,-1};
			actualOutput[4] = IntSortSearch.selectionSort(test5);
			
			
			int[] test6 = {1,0,-1};
			expectedOutput[5] = new int[] {-1,0,1};
			actualOutput[5] = IntSortSearch.selectionSort(test6);
			
			
			int[] test7 = {1,1,1};
			expectedOutput[6] = new int[] {1,1,1};
			actualOutput[6] = IntSortSearch.selectionSort(test7);
		
			for(int i=0;i<expectedOutput.length && i<actualOutput.length;i++) {
				System.out.println("Test " + (i+1) + ": " + compareIntArrays(expectedOutput[i],actualOutput[i]));  //compares each index of expectedOutput and actualOutput 
			}
			
			
		}
		
		public static void compareArrays (int[] a, int[] b){
			if(a.length == b.length) {
				
				for(int i =0; i<a.length;i++) {
					System.out.println("Test " + (i+1) + ": " + String.valueOf(a[i]==b[i]));
				}
				
			}else {
				System.out.println("Error: Array lengths are not equal");
			}
		}
		
		public static boolean compareIntArrays (int[] a, int[]b) {
			if(Arrays.equals(a, b)) {
				return true;
			}
			else {
				return false;
			}
		}
		
		
}

