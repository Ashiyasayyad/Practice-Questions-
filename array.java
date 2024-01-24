import java.util.Arrays;
import java.util.Scanner;
 class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accepting the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Initializing the array
        int[] numbers = new int[size];

        // Accepting numbers from the user
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Finding greater and smaller
        int greater = numbers[0];
        int smaller = numbers[0];

        for (int i = 1; i < size; i++) {
            if (numbers[i] > greater) {
                greater = numbers[i];
            }
            if (numbers[i] < smaller) {
                smaller = numbers[i];
            }
        }

        // Sorting the array in ascending order
        int[] ascendingOrder = Arrays.copyOf(numbers, size);
        Arrays.sort(ascendingOrder);

        // Sorting the array in descending order
        int[] descendingOrder = Arrays.copyOf(numbers, size);
        Arrays.sort(descendingOrder);
        for (int i = 0; i < size / 2; i++) {
            int temp = descendingOrder[i];
            descendingOrder[i] = descendingOrder[size - 1 - i];
            descendingOrder[size - 1 - i] = temp;
        }

        // Displaying the results
        System.out.println("Greater number: " + greater);
        System.out.println("Smaller number: " + smaller);
        System.out.println("Ascending order: " + Arrays.toString(ascendingOrder));
        System.out.println("Descending order: " + Arrays.toString(descendingOrder));

        scanner.close();
    }
}
