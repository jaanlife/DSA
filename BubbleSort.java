/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Desktop.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
  
    public void swap(Integer []a,int i,int j){
    //swap is a method
     int temp;
     temp = a[i];
     a[i]=a[j];
     a[j]=temp; 
    }
       
    public  void bubbleSort(Integer[] a) {
        int num = a.length;
        for(int i=0;i<num;i++){
            for(int j=0; j<num -i-1; j++){
                if(a[j]> a[j+1]){
                        swap(a,j,j+1);
            }
                //after each inner loop
                System.out.println( "i = " +(i+1) + "; j = " +(j+1) +";" +Arrays.deepToString(a));
            }
            }
        }
        public static void printArray(Integer[]a){
            for(int n:a){
                System.out.print(n+" ");
            }
            System.out.println();
        }
        
        public static void main(String[]args){
            Integer[]numbers={ 76 , 6 , 107 , 92 , 21 , 23 , 5 , 9 , 18 , 8143};
            
                   System.out.println("Before Sort the Array :");
                   printArray(numbers);
                   
                   BubbleSort sorter= new BubbleSort();
                   sorter.bubbleSort(numbers);
                   
                   System.out.println("After sort the Array :");
                   printArray(numbers);
        }

    
}
 
