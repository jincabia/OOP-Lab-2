package exercise2;

import java.util.ArrayList;
import java.util.Random;

public class Driver
{

	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 10;
	
	
	//Run time O(log2(n)
	//Parameters are Sorted list of integers and a integer target
	//Constantly splits the list in half depending if the half of the list is less than or greater than
	//If not found we will return -1
	public static int binarySearch(Integer[] sortedList, int target)
	{
		int mid = 0;
		int start = 0;
		int end = sortedList.length-1;
		while (start <= end)
		{
			mid = (start + end) /2;
			if (sortedList[mid] == target)
			{
				return mid;
			}

			if(target > sortedList[mid])
			{
				start = mid +1;
			}
			else
			{
				end = mid -1;
			}

		}
		return -1;
	}

	public static void main( String[] args )
	{

		Integer[] nums = new Integer[SIZE];
		Random rand = new Random();
		int randnum = rand.nextInt( UPPER_BOUND );
		nums[0] = randnum;

		for( int i = 1; i < SIZE; i++ )
		{
			randnum = rand.nextInt( UPPER_BOUND );
			nums[i] = nums[i - 1] + randnum;
			System.out.println( nums[i] );
		}

		int randomNumber = rand.nextInt(501);
        System.out.println("Random Number: " + randomNumber);

		int target = randomNumber;
//		 int target = nums[0];

		int result = binarySearch(nums, target);

		if(result == -1)
		{
			System.out.println("Not in list");
		}
		else{
			//
			System.out.println("Found in nums at index " + (result));
		}



	}

}
