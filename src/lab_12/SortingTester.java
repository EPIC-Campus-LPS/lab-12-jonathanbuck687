package lab_12;

public class SortingTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {4,7,3,6,2,9,5,1,8};
		QuadSort quad = new QuadSort(arr);
		quad.selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		//System.out.println(System.currentTimeMillis(quad.selectionSort(arr)));
		
	}

}
