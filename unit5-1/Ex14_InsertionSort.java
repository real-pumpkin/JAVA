package ch05.unit01;

/*
	Insertion Sort
*/
public class Ex14_InsertionSort {
	public static void main(String[] args) {
		int[] arr = { 25, 15, 7, 4, 12, 9, 17, 16, 20, 13 };
		int i, j, key;

		System.out.print("Source Data : ");
		for (int n : arr) {
			System.out.printf("%5d", n);
		}
		System.out.println();

		for (i = 1; i < arr.length; i++) {
			key = arr[i];
			for (j = i - 1; j >= 0; j--) {
				if (key < arr[j]) {
					arr[j + 1] = arr[j];
				} else {
					break;
				}
			}
			arr[j + 1] = key;
		}

		System.out.print("Sort Data   : ");
		for (int n : arr) {
			System.out.printf("%5d", n);
		}
		System.out.println();
	}
}
