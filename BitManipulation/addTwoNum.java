public class addTwoNum 
{
	public static void main(String[] args)
	{
		int a = 5;
		int b = 7;
		
		int answer = add_no_arithmatic(a, b);
		System.out.println("Answer: "+answer);
	}
	
	public static int add_no_arithmatic(int a, int b)
	{
		int sum, carry;
		if(b==0)
			return a;
		else
		{
			sum = a^b; // Sum can be done by X-OR operation.
			carry = (a&b) << 1;  // Carry calculated by ANDing A and B, and then shifting left by 1.
		}
		return add_no_arithmatic(sum, carry); // Recurse till all digits are added in a number.
	}
}

// Complexity: O(1) - The bit manipulation operations can be done in constant time..
	
	