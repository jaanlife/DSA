
package Sorting;
import java.util.Scanner;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner scanner = new Scanner(System.in);

		    System.out.print("Enter the number of elements to sort: ");
		    int n = scanner.nextInt();
		    
		    int[] arr = new int[n];

		    System.out.println("Enter the elements: ");
		    for (int i = 0; i < n; i++) {
		      arr[i] = scanner.nextInt();
		    }
		    // Perform selection sort
		    selectionSort(arr);

		    System.out.println("Selection Sorted array: ");
		    for (int i : arr) {
		      System.out.print(i + " ");
		    }
		    System.out.println();
		  }

		  public static void selectionSort(int[] arr) {
		    int n = arr.length;
		    for (int i = 0; i < n - 1; i++) {
		      int minIndex = i; // Assume the first element is minimum initially

		      // Find the index of the minimum element in the unsorted subarray
		      for (int j = i + 1; j < n; j++) {
		        if (arr[j] < arr[minIndex]) {
		          minIndex = j;
		        }
		      }

		      // Swap the minimum element with the first element of the unsorted subarray
		      if (minIndex != i) {
		        int temp = arr[i];
		        arr[i] = arr[minIndex];
		        arr[minIndex] = temp;
		      }
		    }
		
	}

}
