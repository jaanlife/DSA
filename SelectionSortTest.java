package lab1sem3;

import java.util.Arrays;

public class SelectionSortTest {
    Integer[] a;

    public SelectionSortTest(Integer[] a) {
        this.a = a;
    }

    public void swap(int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public void selectionSort() {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_idx]) {
                    min_idx = j;
                }
                System.out.println(
                    "i = " + i +
                    "; j = " + j +
                    "; cur_min = " + a[min_idx] +
                    "; " + Arrays.deepToString(a)
                );
            }
            swap(i, min_idx);
        }
    }
    
    public static void main(String[] args) {
        Integer[] array = {76, 6, 107, 92, 21, 23, 5, 9, 8, 8143};
        
        System.out.println("Array before sorting: " + Arrays.deepToString(array));
        
        SelectionSortTest sorter = new SelectionSortTest(array);
        sorter.selectionSort();
        
        System.out.println("Array after sorting: " + Arrays.deepToString(sorter.a));
    }
}
// meke wennne isellam inna kenat potha dila eya okom aya ek COMPARE krla anithimetam eyt wada kota kenek hambunam eyt potha dila 
// e potha gath kena eyagen pase inna ayath ek COMPARE krla eya wada kota kenek hitiye nath nm eya isella kota wela hitapu kena eka swao wennawa 