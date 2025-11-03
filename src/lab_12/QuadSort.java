package lab_12;

public class QuadSort {
	private static int[] arr;
	public QuadSort(int[] ar)
	{
		arr = ar;
	}
	public static int[] bubbleSort(int[] arr)
	{
		int temp = 0;
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr.length - 1; j++)
			{
				if (arr[j] > arr[j + 1])
				{
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	public static int[] selectionSort(int[] arr)
	{
		int lowest = 0;
		int index = -1;
		int temp = 0;
		for (int i = 0; i < arr.length; i++)
		{
			lowest = arr[arr.length - 1];
			index = arr.length;
			for (int j = arr.length - 1; j > i; j--)
			{
				if (arr[j] < lowest)
				{
					lowest = arr[j];
					index = j;
				}
			}
			//System.out.println(lowest);
			temp = arr[i];
			arr[i] = lowest;
			arr[index] = temp;
			
		}
		return arr;
		
	}
	public static int[] insertionSort(int[] arr)
	{
		int num = 0;
		int index = 0;
		int temp = 0;
		for (int i = 0; i < arr.length; i++)
		{
			num = arr[i];
			for (int j = arr.length - i; j < 0; j--)
			{
				if (j == arr.length - i &&  num > arr[arr.length - i])
				{
					temp = arr[arr.length - i + 1];
					arr[arr.length - i + 1] = num;
					arr[index] = temp;
				}
				else if (j == 0 )
			}
		}
	}
	public static int[] mergeSort(int[] arr)
	{
		int[] arr1 = new int[arr.length];
		int[] arr2 = new int[arr.length];
		int[] arr3 = new int[arr.length];
		int[] arr4 = new int[arr.length];
		for (int i = 0; i < arr.length / 2; i++)
		{
			
		}
	}
}