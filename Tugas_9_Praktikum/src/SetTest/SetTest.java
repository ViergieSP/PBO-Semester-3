package SetTest;

import java.util.ArrayList;

public class SetTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList arr = new ArrayList();
        arr.add("Emily");
        arr.add("Bob");
        arr.add(20);
        arr.add("Cindy");
        arr.add(null);
        System.out.println(arr);

        arr.set(4, "Deasy");
        System.out.println(arr);

        arr.set(2, "Anne");
        System.out.println(arr);

    }

}