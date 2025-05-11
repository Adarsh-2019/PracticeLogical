package org.logical.javaconcept.array;

//3) Write a Java program to check the equality of two arrays?
public class EqualityOfTwoArrays {
    public static void main(String[] args) {
        int[] arrayOne = {2, 5, 1, 7, 4};
        int[] arrayTwo = {2, 5, 1, 7, 4};
        equalityOfTwoArrays(arrayOne,arrayTwo);
    }

    private static void equalityOfTwoArrays(int[] arrayOne, int[] arrayTwo) {

        boolean equalOrNot=true;
        if (arrayOne.length==arrayTwo.length){
            for (int i=0;i<arrayOne.length;i++){
                if (arrayOne[i]!=arrayTwo[i]){
                 equalOrNot=false;
                }
            }
        }else {
            equalOrNot=false;
        }
        if (equalOrNot){
            System.out.println("Two arrays are equals");
        }else {
            System.out.println("Two arrays are not equals");
        }
    }
}
