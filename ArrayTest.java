/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Desktop.ArrayTest;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String args[]) {
        Integer [] a = new Integer[]{9,7,11,8,1};
        int temp;
        
        System.out.println("Before Swapping : ");
        System.out.println(Arrays.deepToString(a));
        
        //swaping value in 4th and 5th position
        temp = a[3];
        a[3] = a[4];
        a[4] = temp;
        
        System.out.println("After Swapping : ");
        System.out.println(Arrays.deepToString(a));
        
    }
}
