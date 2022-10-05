package implementingSelectionsort;

public class Selectionsort {
	public static void selectionSort(int[] a) {
		int i, j, min, temp;
		for (i = 0; i < a.length - 1; i++) {

			min = i;

			for (j = 0; j < a.length - 1; j++) {

				if (a[j] < a[min]) {
					min = j;

				}
				temp = a[min];
				a[min] = a[i];
				a[i] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 3, 60, 35, 2, 45, 320, 5 };

		System.out.println("Array Before Selection Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		selectionSort(arr);// sorting array elements using selection sort

		System.out.println("Array After Selection Sort");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
