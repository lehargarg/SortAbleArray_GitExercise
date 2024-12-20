package SortAbleArray_GitExercise.test;
// the code to test the sorting array goes in this file
import java.util.Arrays;
import java.util.List;
import SortAbleArray_GitExercise.src.SortableArray;

public class test_sorting_array {
    public static void main(String[] args) {
        testSortIntegers();
        testSortStrings();
    }

    // Test for sorting integers
    private static void testSortIntegers() {
        System.out.println("=== Testing Integer Sorting ===");
        List<Integer> numbers = Arrays.asList(10, 3, 15, 7, 2);
        List<Integer> expected = Arrays.asList(2, 3, 7, 10, 15);
        List<Integer> result = SortableArray.sortIntegers(numbers);

        System.out.println("Input: " + numbers);
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
        System.out.println("Test Passed: " + result.equals(expected));
    }



    // Test for sorting strings
    private static void testSortStrings() {
        System.out.println("\n=== Testing String Sorting ===");
        List<String> strings = Arrays.asList("dog", "cat", "elephant", "bee");
        List<String> expected = Arrays.asList("bee", "cat", "dog", "elephant");
        List<String> result = SortableArray.sortStrings(strings);
    }
}
