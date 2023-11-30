# highest-common-factor

## Problem Statement
Given an array of integers, implement a Java function to find the highest common factor (HCF) for the given array.

The highest common factor, also known as the greatest common divisor (GCD), is the largest positive integer that divides each of the integers in the array without leaving a remainder


## Function Signature
public int highestCommonFactor(int[] numbers) {
  // code goes here
}


## Input
An array of integers with a minimum size of 2  

## Output
An integer representing the highest common factor of the given array.

## Example
 The HCF of 0, 30 and 45 is 15  
 The HCF of -12, 18 and 24 is 6

## Approach
The approach used is, the solution initializes the HCF with the first element and then iteratively updates it by finding the HCF with each subsequent element in the array using the Euclidean algorithm. This approach efficiently calculates the HCF for the entire array.

## Test
Different test use cases are provided in order to test the correctness of the solution
