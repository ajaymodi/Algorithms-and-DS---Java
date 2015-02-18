/*
PROBLEM STATEMENT::: A 2-D array of 1's and 0's is given. Find the row with max 1's. The array is sorted row wise (all 0's in a row are followed by all 1's).

*/


public class maxOnes {

	public static void main(String[] args) {
		int[][] inputArray = new int[][]{{0,0,0,0,0,1,1,1,1,1},
				{0,0,0,0,0,0,1,1,1,1},{0,0,0,0,1,1,1,1,1,1},
				{0,0,0,1,1,1,1,1,1,1},{0,0,0,0,0,0,1,1,1,1},
				{0,0,1,1,1,1,1,1,1,1},{0,1,1,1,1,1,1,1,1,1}};
		
		int answer = findMaxOnes(inputArray);
		
		System.out.println("Row with maximum ones is: "+answer);

	}
	
	static int findMaxOnes(int[][] inputArray) {
		
		int numRow = inputArray.length;
		int numCol = inputArray[0].length;
		int firstOne = 0;
		int tempFOne = numCol;
		int maxRow = 0;
		
		for(int i=0; i<numRow; i++) {
			firstOne = doBinarySearch(inputArray[i],0,numCol-1);
			if (firstOne<tempFOne) {
				tempFOne = firstOne;
				maxRow = i;
			}
		}
		
		return maxRow;
	}
	
	static int doBinarySearch(int[] a,int low, int high) {
		int mid;
		mid = low + (high-low)/2;
		
		if(high >= low) {
			if ((mid==0 || a[mid-1]==0) && a[mid]==1) {
				return mid;
			}
			else if (a[mid] == 0) {
				return doBinarySearch(a, mid+1, high);
			}
			else {
				return doBinarySearch(a, low, mid-1);
			}
		}
		return -1;
	}
}