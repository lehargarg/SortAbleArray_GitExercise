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

    // Feature 1: Sort a list of integers
    public static List<Integer> sortIntegers(List<Integer> numbers) {
        return numbers.stream()

                .sorted()
                .collect(Collectors.toList());
    }

// test comment for 3rd part
// another test comment for 3rd part
    public static void main(String[] args) {
        System.out.println("\n=== String Sorting ===");
        List<String> strings = Arrays.asList("banana", "apple", "grape", "mango");
        System.out.println("Original: " + strings);
        System.out.println("Sorted: " + sortStrings(strings));

        // Example usage
        System.out.println("=== Integer Sorting ===");
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 2);
        System.out.println("Original: " + numbers);
        System.out.println("Sorted: " + sortIntegers(numbers));

    }
}

