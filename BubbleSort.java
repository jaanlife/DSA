/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1sem3;

/**
 *
 * @author User
 */
public class BubbleSort {
    
    // Method to swap two elements in an array
    public void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
    // Method to perform Bubble Sort on an array
    public void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }


    /**
     * @param args the command line arguments
     */
    public class BubbleSortTest {
        public static void main(String[] args) {
            // Initialize the array with 10 numbers
            int[] numbers = {8, 3, 1, 4, 5, 11, 7, 2, 17, 13};

            // Print the array before sorting
            System.out.println("Array before sorting:");
            printArray(numbers);

            // Create an instance of BubbleSort and sort the array
            BubbleSort sorter = new BubbleSort();
            sorter.bubbleSort(numbers);

            // Print the array after sorting
            System.out.println("Array after sorting:");
            printArray(numbers);
        }

        // Method to print the array
        public static void printArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    
}
