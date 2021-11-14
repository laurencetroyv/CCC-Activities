package sorting;

public class QuickSort {

	public static void main(String[] args) {
		int arr_numbers[] = {-4, 22, -3, -5, 9, 8, 20 , 19, 16, 10, 5, 4, 1, 30, 25};
		sort(arr_numbers, 0, arr_numbers.length-1);

		for (int i : arr_numbers) {
			System.out.print(i + " ");
		}
	}

	static int partition(int arr[], int low, int big) {
		int pivot = arr[big];
		int i = (low-1);
		for(int x = low; x < big; x++) {
			if(arr[x] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[x];
				arr[x] = temp;
			}
		}

		int temp = arr[i+1];
		arr[i+1] = arr[big];
		arr[big] = temp;

		return i + 1;
	}

	static void sort(int[] arr, int low, int big) {
		if(low < big) {
			int pi = partition(arr, low, big);

			sort(arr, low, pi-1);
			sort(arr, pi+1, big);
		}
	}
}