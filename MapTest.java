/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Desktop.MapTest;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String args[]) {
        Map<String,Integer>myMap = new HashMap<>();
        
        myMap.put("Apple", 10);
        myMap.put("Banana", 20);
        myMap.put("Orange", 15);
        
        System.out.println("Quality of apples: "+myMap.get("Apple"));
        
        System.out.println("Iteration over the map: ");
        for(Map.Entry<String, Integer>entry : myMap.entrySet()){
            System.out.println(entry.getKey() + ":" +entry.getValue());
        }
        myMap.remove("Banana");
        System.out.println("After Remveing Banana: "+ myMap);
    }
}
