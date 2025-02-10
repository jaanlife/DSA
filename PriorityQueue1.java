/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Desktop.PriorityQ;

import java.util.PriorityQueue;
public class PriorityQueue1 {

    public static void main(String args[]) {
        PriorityQueue<Integer> pQueue=new PriorityQueue<Integer>();
        
        pQueue.add(20);
        pQueue.add(10);
        pQueue.add(15);
        
        System.out.println(pQueue);
        
        int size = pQueue.size();
        System.out.println("Size : "+size);
        
        for(int i = 0; i<size; i++)
        {
            System.out.println(pQueue.poll());
        }
    }
}
