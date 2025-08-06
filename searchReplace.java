import java.util.Scanner;

public class searchReplace {
    // Recursive function to search and replace
    public static String searchAndReplace(String original, String toFind, String toReplace) {
        // Base case
        if (!original.contains(toFind)) {
            return original;
        }

        // Find the first occurrence of the substring to find
        int index = original.indexOf(toFind);

        // Replace the first occurrence and recursively call for the rest of the string
        return original.substring(0, index) + toReplace +
               searchAndReplace(original.substring(index + toFind.length()), toFind, toReplace);
    }

    public static void main(String[] args) {
        // Using try-with-resources to ensure scanner closure
        try (Scanner scanner = new Scanner(System.in)) {
            // Getting input from the user
            System.out.print("Please enter a string: ");
            String original = scanner.nextLine();

            System.out.print("Please enter the substring you wish to find: ");
            String toFind = scanner.nextLine();

            System.out.print("Please enter a string to replace the given substring: ");
            String toReplace = scanner.nextLine();

            // Performing the search and replace using recursion
            String result = searchAndReplace(original, toFind, toReplace);

            // Displaying the result
            System.out.println("Your new string is: " + result);
        } 
        // No need to explicitly close the scanner; it's handled automatically
    }
}



