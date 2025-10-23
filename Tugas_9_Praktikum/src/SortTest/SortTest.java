package SortTest;

import java.util.ArrayList;
import java.util.Collections;

public class SortTest {
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<Integer> arr = new ArrayList();
        arr.add(4);
        arr.add(2);
        arr.add(3);
        arr.add(1);
        System.out.println("Before sorting list:");
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println("after sorting list:");
        System.out.println(arr);
        
    }
    
}