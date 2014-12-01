import java.util.*;
public class ArithamticSequnce4Term 
{
	public static void main(String[] args)
	{
		int[] numbers = {1,1,1,1,2,3,4,5};//{1, 8, 2, 7, 5, 6, 13, 11, 19};
		fourTermSeq(numbers);	
	}
	
	static boolean fourTermSeq(int[] numbers)
	{
		int length = numbers.length;
		int aK, aL;
		Arrays.sort(numbers); // Sort array - O(NlogN)
		
		for(int i=0; i<length; i++)
		{									// Iterate through all numbers: O(N^2)
			for(int j=i+1; j<length; j++)
			{
				if(numbers[i] == numbers[j])
					continue;
				aK = numbers[i] + 2*(numbers[j] - numbers[i]); // Find next 2 numbers in sequence
				aL = numbers[i] + 3*(numbers[j] - numbers[i]); 
				
				if(binarySearch(numbers, aK) && binarySearch(numbers, aL))
				{				// Use binary search to check whether numbers are present or not? : O(logN)
					System.out.print(numbers[i]+"  "+numbers[j]+"   "+aK+"   "+aL+"  ");
					//return true;
				}	
			}
			System.out.println("");
		}
		return false;
	}
	
	static boolean binarySearch(int[] a, int find)
	{
		int low=0;
		int high = a.length-1;
		int mid;
		
		while(low<=high)
		{
			mid = low + ((high - low)/2);
			if(a[mid] == find)
				return true;
			else if(a[mid]>find)
				high = mid-1;
			else
				low = mid+1;
		}
		return false;
	}
}
