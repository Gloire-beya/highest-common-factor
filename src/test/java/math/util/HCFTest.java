package math.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The HCFTest class contains unit tests for the highest common factor (HCF) calculation
 * using the HCF.highestCommonFactor() method.
 */
class HCFTest {

    /**
     * Test case for calculating HCF with positive integers.
     */
    @Test
    public void testHCFWithPositiveIntegers() {
        int[] numbers = {10, 15, 25};
        assertEquals(5, HCF.highestCommonFactor(numbers));
    }

    /**
     * Test case for calculating HCF with negative integers.
     */
    @Test
    public void testHCFWithNegativeIntegers() {
        int[] numbers = {-20, -30, -40};
        assertEquals(10, HCF.highestCommonFactor(numbers));
    }

    /**
     * Test case for calculating HCF with mixed positive and negative integers.
     */
    @Test
    public void testHCFWithMixedIntegers() {
        int[] numbers = {-12, 18, 24};
        assertEquals(6, HCF.highestCommonFactor(numbers));
    }

    /**
     * Test case for calculating HCF with zero included in the array.
     */
    @Test
    public void testHCFWithZero() {
        int[] numbers = {0, 30, 45};
        assertEquals(15, HCF.highestCommonFactor(numbers));
    }

    /**
     * Test case for calculating HCF with an empty array.
     * Expects an IllegalArgumentException with a specific error message.
     */
    @Test
    public void testHCFWithEmptyArray() {
        int[] numbers = {};
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> HCF.highestCommonFactor(numbers));
        assertEquals("Input array must is required not to be Null or must contain at least 2 elements", exception.getMessage());
    }

    /**
     * Test case for calculating HCF with a null array.
     * Expects an IllegalArgumentException with a specific error message.
     */
    @Test
    public void testHCFWithNullArray() {
        int[] numbers = null;
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> HCF.highestCommonFactor(numbers));
        assertEquals("Input array must is required not to be Null or must contain at least 2 elements", exception.getMessage());
    }

    /**
     * Test case for calculating HCF with a single-element array.
     * Expects an IllegalArgumentException with a specific error message.
     */
    @Test
    public void testHCFWithSingleElementArray() {
        int[] numbers = {2};
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> HCF.highestCommonFactor(numbers));
        assertEquals("Input array must is required not to be Null or must contain at least 2 elements", exception.getMessage());
    }
}