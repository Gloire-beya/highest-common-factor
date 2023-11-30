package math.util;

/**
 * A utility class to find the highest common factor (HCF) of an array of integers.
 */
public class HCF {

    /**
     * Finds the highest common factor of an array of integers using the Euclidean algorithm.
     *
     * @param numbers An array of integers for which the HCF needs to be found.
     * @return The highest common factor of the given array of integers.
     * @throws IllegalArgumentException if the input array is empty or null.
     */
    public static int highestCommonFactor(int[] numbers) {
        // Check for null or empty array
        if (numbers == null || numbers.length < 2) {
            throw new IllegalArgumentException("Input array must is required not to be Null or must contain at least 2 elements");
        }

        // Initialize HCF with the first element of the array
        int hcf = numbers[0];

        // Iterate through the array to find HCF
        for (int i = 1; i < numbers.length; i++) {
            hcf = findHCF(hcf, numbers[i]);
        }

        return Math.abs(hcf);
    }

    /**
     * Finds the highest common factor of two integers using the Euclidean algorithm.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The highest common factor of the two integers.
     */
    private static int findHCF(int a, int b) {
        // Euclidean algorithm to find HCF
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
