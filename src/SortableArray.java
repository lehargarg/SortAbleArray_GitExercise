package SortAbleArray_GitExercise.src;
// The code for sorting arrays goes in this file

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortableArray {

    // Feature 2: Sort a list of strings
    public static List<String> sortStrings(List<String> strings) {
        return strings.stream()
                .sorted()
                .collect(Collectors.toList());
    }
    
    public static void main(String[] args) {
        // Example usage
        System.out.println("\n=== String Sorting ===");
        List<String> strings = Arrays.asList("banana", "apple", "grape", "mango");
        System.out.println("Original: " + strings);
        System.out.println("Sorted: " + sortStrings(strings));
    }
}
