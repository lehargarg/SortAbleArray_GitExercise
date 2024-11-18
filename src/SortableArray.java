package SortAbleArray_GitExercise.src;
// The code for sorting arrays goes in this file

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortableArray {

    // Feature 1: Sort a list of integers
    public static List<Integer> sortIntegers(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        // Example usage
        System.out.println("=== Integer Sorting ===");
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);
        System.out.println("Original: " + numbers);
        System.out.println("Sorted: " + sortIntegers(numbers));
    }
}