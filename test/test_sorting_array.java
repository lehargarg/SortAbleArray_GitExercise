package SortAbleArray_GitExercise.test;
// the code to test the sorting array goes in this file
import java.util.Arrays;
import java.util.List;
import SortAbleArray_GitExercise.src.SortableArray;

public class test_sorting_array {
    public static void main(String[] args) {
        testSortStrings();
    }

    // Test for sorting strings
    private static void testSortStrings() {
        System.out.println("\n=== Testing String Sorting ===");
        List<String> strings = Arrays.asList("dog", "cat", "elephant", "bee");
        List<String> expected = Arrays.asList("bee", "cat", "dog", "elephant");
        List<String> result = SortableArray.sortStrings(strings);
    }
}
