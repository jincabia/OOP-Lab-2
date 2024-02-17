package exercise3;

import java.util.Random;
import java.util.Scanner;

public class Driver
{

	


	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 1000;

	
	

	public static void main( String[] args )
	{
		
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter Sort Algorithm");

	    String sortType = myObj.nextLine();  // Read user input

		int[] nums = new int[SIZE];
		Random rand = new Random();

		System.out.println("\n This is unsorted");

		for( int i = 0; i < SIZE; i++ )
		{
			nums[i] = rand.nextInt( UPPER_BOUND );
			System.out.println( nums[i] );
		}
		
		if(sortType.equals("q"))
		{
			quickSort(nums,0,nums.length-1);
			System.out.println("\n This is sorted");
		}
//		System.out.println(sortType);

		
		

		for(int i : nums)
		{
			System.out.println(i + " ");
		}

	}
	
	
	//Runtime is O(nlog(n) but if the list is already sorted then O(n^2)
	private static void quickSort(int[] arr,int start, int end)
		{
			if (end<= start) return;

			int pivot = partition(arr, start, end);

			quickSort(arr, start, pivot-1);
			quickSort(arr, pivot+1, end);


		}

	private static int partition(int[] arr, int start, int end)
		{
			int pivot = arr[end];
			int i = start -1;
			for (int j = start; j <= end-1;j++)
			{
				if (arr[j] < pivot) {
					i++;
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			i++;
			int temp = arr[i];
			arr[i] = arr[end];
			arr[end] = temp;

			return i;
		}

}
