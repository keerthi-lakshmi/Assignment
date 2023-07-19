import java.util.Arrays;

public class ArraysClassExample {
    public static void main(String[] args) {
        // Example array
        Integer[] originalArray = { 5, 2, 9, 1, 7, 3 };

        // Copying the array with a new length
        Integer[] copiedArray = Arrays.copyOf(originalArray, 8);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray));

        // Copying a range of the array into a new array
        Integer[] copiedRangeArray = Arrays.copyOfRange(originalArray, 1, 4);
        System.out.println("Copied Range Array: " + Arrays.toString(copiedRangeArray));

        // Checking if two arrays are equal
        Integer[] equalArray = { 5, 2, 9, 1, 7, 3 };
        boolean isEqual = Arrays.equals(originalArray, equalArray);
        System.out.println("Are the arrays equal? " + isEqual);

        // Filling the array with a value
        Integer[] filledArray = new Integer[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Filled Array: " + Arrays.toString(filledArray));

        // Sorting the array
        Arrays.sort(originalArray);
        System.out.println("Sorted Array: " + Arrays.toString(originalArray));

        // Searching for an element in the sorted array
        int index = Arrays.binarySearch(originalArray, 7);
        System.out.println("Index of 7 in sorted array: " + index);
    }
}
