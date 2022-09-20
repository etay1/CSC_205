package TestingAndComplexity;

public class IntSortSearchTester {
	public static void main(String[] args) {
		linearSearchTester();
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
			
		}
		
		public static void sortTester() {
			
		}
		
		public static void compareArrays (int[] a, int[] b){
			
			for(int i =0; i<a.length && i<b.length;i++) {
				System.out.println(String.valueOf(a[i]==b[i]));
			}
			
		}
		
		
}
