/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author Asus
 */
import java.util.PriorityQueue ;
public class PriorityQueue1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        	PriorityQueue <Integer> pQueue = new PriorityQueue <Integer>();
			
		pQueue.add(20);
		pQueue.add(10);
		pQueue.add(15);
		
		System.out.println(pQueue);
		
		int size = pQueue.size();
		System.out.println("Size : " +pQueue);
	   
	    for (int i=0; i<size;i++){
			System.out.println(pQueue.poll());
		}
    }
}
