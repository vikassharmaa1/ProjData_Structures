package implementingInsertionsort;

public class Insertionsort {
	public static void insertionSort(int[] a) {

		int i, j, v;
		for (i = 1; i <= a.length - 1; i++) {
			v = a[i];
			j = 1;
			while (a[j - 1] > v && j >= 1) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = v;

		}
	}

	public static void main(String[] args) {
		int arr[] = { 3, 60, 35, 2, 45, 320, 5 };

		System.out.println("Array Before Insertion Sort");
		for (int i = 1; i < arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		insertionSort(arr);// sorting array elements using Insertion sort

		System.out.println("Array After Insertion Sort");
		for (int i = 1; i < arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
