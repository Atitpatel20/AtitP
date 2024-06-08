package package_11to15;

public class P13_RemoveDuplicateElements {

    // WAP to print duplicate elements in array

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println("Duplicate elements in given array: ");

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Inner loop to compare with remaining elements
            for (int j = i + 1; j < arr.length; j++) {
                // Check if elements are equal and not the same element
                if (arr[i] == arr[j]) {
                    System.out.println(arr[j]);  // Print the duplicate element
                }
            }
        }
    }
}
