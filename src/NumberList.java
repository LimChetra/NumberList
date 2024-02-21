import java.util.Scanner;
public class NumberList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter numbers (Enter any integer to exit):");
        int[] numbers = readNumbers(scanner);
        System.out.println("View Input numbers:");
        displayNumbers(numbers);
    }
    private static int[] readNumbers(Scanner scanner) {
        int initialCapacity = 10;
        int[] numbers = new int[initialCapacity];
        int size = 0;
        while (scanner.hasNextInt()) {
            int num = scanner.nextInt();
            if (size == numbers.length) {
                numbers = resizeArray(numbers);
            }
            numbers[size] = num;
            size++;
        }
        return trimArray(numbers, size);
    }
    private static int[] resizeArray(int[] array) {
        int newSize = array.length * 2;
        int[] newArray = new int[newSize];

        System.arraycopy(array, 0, newArray, 0, array.length);

        return newArray;
    }
    private static int[] trimArray(int[] array, int size) {
        int[] trimmedArray = new int[size];

        System.arraycopy(array, 0, trimmedArray, 0, size);
        return trimmedArray;
    }
    private static void displayNumbers(int[] numbers) {
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}