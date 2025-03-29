package org.logical.logicals;

public class FindSecondLargestNumber {
    public static void main(String[] args) {
        int secondLargest = secondLargest(new int[]{45, 51, 28, 75, 49, 42, 98, 65});
        System.out.println(secondLargest);
    }

    private static int secondLargest(int[] numbers) {
        int firstLargestNumber, secondLargestNumber;

        if (numbers[0] > numbers[1]) {
            firstLargestNumber = numbers[0];
            secondLargestNumber = numbers[1];
        } else {
            firstLargestNumber = numbers[1];
            secondLargestNumber = numbers[0];
        }

        for (int i = 2; i < numbers.length; i++) {
            if (numbers[i] > firstLargestNumber) {
                secondLargestNumber = firstLargestNumber;
                firstLargestNumber = numbers[i];
            } else if (numbers[i] < firstLargestNumber && numbers[i] > secondLargestNumber) {
                secondLargestNumber = numbers[i];
            }
        }
        return secondLargestNumber;
    }
}
