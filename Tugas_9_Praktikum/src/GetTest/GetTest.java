package GetTest;

import java.util.ArrayList;

public class GetTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Andrew");
        arr.add("Bob");
        arr.add("Cella");
        arr.add("Denlie");
        arr.add(null);
        arr.add("Emely");
        System.out.println(arr);

        String s = arr.get(1);
        System.out.println("at indext 1 number is: " + s);
    }

}