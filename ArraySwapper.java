package arrayswapper;

/**
 *
 * @author omalj
 */
import java.util.Arrays;

public class ArraySwapper {
    static Integer[] array = {76, 6, 107, 92, 21, 23, 5, 9, 8, 8143};
    //static Integer[] array = {5, 2, 4, 6, 1, 3};
    static int outerIndex;

    public static void swap(int i, int j) { // third to be called in the inseert method
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void insert(int endIndex) { // second method to be claaed out 
        int i = endIndex;
        while (i > 0 && array[i] < array[i - 1]) { // in here the swap method will be called only if the before position element is smaller than the brought in element < in ASC >
            swap(i, i - 1);
            System.out.println("i:" + i + ", j:" + (i - 1) + ", Array state: \n \t" + Arrays.deepToString(array));
            // there are different "i" values becoze the Array State displays only if the SWAP is done 
            
            i--; // this method will reduced until the i becomes 0 to be sure that the whole array was checked 
        }
    }

    public static void insertionSort() { // first method to be processed
        for (outerIndex = 1; outerIndex < array.length; outerIndex++) {
            insert(outerIndex);
        }
    }

    public static void main(String[] args) {
        System.out.println("Initial Array: " 
                + Arrays.deepToString(array));
        
        insertionSort();
        
        System.out.println("Sorted Array: " 
                + Arrays.deepToString(array));
    }
}