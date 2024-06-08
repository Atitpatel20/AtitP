package package_11to15;

import java.util.ArrayList;
import java.util.Collections;

public class P11_SortArrayList {

    // Sort an array List

    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        System.out.println("ArrayList before sorting: " + numbers);

        // Sort the ArrayList in ascending order (default)
        Collections.sort(numbers);

        System.out.println("ArrayList after sorting: " + numbers);
    }
}
