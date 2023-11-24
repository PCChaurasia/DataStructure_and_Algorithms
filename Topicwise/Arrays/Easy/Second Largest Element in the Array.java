/*
 * Find Second Smallest and Second Largest Element in an array
   Problem Statement: Given an array, find the second smallest and second largest element in the array. Print ‘-1’ in the event that either of them doesn’t exist.
   
   Examples:
   
   Example 1:
   Input: [1,2,4,7,7,5]
   Output: Second Smallest : 2
   	Second Largest : 5
   Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2
   
   Example 2:
   Input: [1]
   Output: Second Smallest : -1
   	Second Largest : -1
   Explanation: Since there is only one element in the array, it is the largest and smallest element present in the array.There is no second largest or second smallest element present.
 */
import java.io.*;
class Test
{
static private int secondSmallest(int[] arr, int n)
{
	if (n < 2)
	{
		return -1;
	}
	int small = Integer.MAX_VALUE;
	int second_small = Integer.MAX_VALUE;
	int i;
	for (i = 0; i < n; i++)
	{
	   if (arr[i] < small)
	   {
		  second_small = small;
		  small = arr[i];
	   }
	   else if (arr[i] < second_small && arr[i] != small)
	   {
		  second_small = arr[i];
	   }
	}
   return second_small;
}
static private int secondLargest(int[] arr, int n)
{
	if(n<2)
	return -1;
	int large = Integer.MIN_VALUE;
	int second_large = Integer.MIN_VALUE;
	int i;
	for (i = 0; i < n; i++)
	{
		if (arr[i] > large)
		{
			second_large = large;
			large = arr[i];
		}

		else if (arr[i] > second_large && arr[i] != large)
		{
			second_large = arr[i];
		}
	}
	return second_large;
}

public static void main(String[] args)
{
	int[] arr = {1, 2, 4, 7, 7, 5};
	int n = arr.length;
		int sS = secondSmallest(arr, n);
		int sL = secondLargest(arr, n);
	System.out.println("Second smallest is "+sS);
	System.out.println("Second largest is "+sL);
}

}
