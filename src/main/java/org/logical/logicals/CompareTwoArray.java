package org.logical.logicals;

public class CompareTwoArray {

    public static void main(String[] args) {
        int[] arrayOne = {2, 5, 1, 1, 4};
        int[] arrayTwo = {2, 5, 1, 7, 4};
        boolean equalOrNot = true;
        if (arrayOne.length == arrayTwo.length) {
            for (int i = 0; i < arrayOne.length; i++) {
                if (arrayOne[i] != arrayTwo[i]) {
                    equalOrNot = false;
                }
            }
        } else {
            equalOrNot = false;
        }
        if (equalOrNot) {
            System.out.println("Both Arrays are equal");
        } else
            System.out.println("Both are not equal");
    }

    static class CheckAnagramTest {
        public static void main(String[] args) {
            String str1 = "Mother In Law";
            String str2 = "Hitler Woman";
            boolean status = true;
            String copyOfStr1 = str1.replaceAll("\\s", "").toLowerCase();
            String copyOfStr2 = str2.replaceAll("\\s", "").toLowerCase();

            char[] charStr1 = copyOfStr1.toCharArray();
            char[] charStr2 = copyOfStr2.toCharArray();

            if (charStr1.length == charStr2.length) {
                for (char ch1 : charStr1) {
                    int index = copyOfStr2.indexOf(ch1);
                    if (index != -1) {
                    copyOfStr2=copyOfStr2.substring(0,index)+copyOfStr2.substring(index+1,copyOfStr2.length());
                    }
                    else
                    {
                        status=false;
                    }
                }
            }
            else
            {
                status=false;
            }
            if(status){
                System.out.println("'"+str1+"' and  '"+str2+"' are Anagram");
            }
            else
            {
                System.out.println(str1+" and "+str2+" are not anagram");
            }
        }
    }
}
