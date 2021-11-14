package sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr_numbers[] = {-4, 22, -3, -5, 9, 8, 20 , 19, 16, 10, 5, 4, 1, 30, 25};
		sort(arr_numbers);

		for (int i : arr_numbers) {
			System.out.print(i + " ");
		}
	}

	static void sort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			int minimum_Index = i;

			for(int x = i+1; x < arr.length; x++) {
				if(arr[x]< arr[minimum_Index]) {
					minimum_Index = x;
				}
			}

			int temp = arr[minimum_Index];
			arr[minimum_Index] = arr[i];
			arr[i] = temp;
		}
	}

}
