package org.logical.april;

public class AllJavaLogical {
    public static void main(String[] args) {

        //How do you find frequency of each character in a string using Java 8 streams?
        //String str = "frequency of each character";
        /*str.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()==1).map(entry->entry.getKey()+"-"+entry.getValue())
                .forEach(System.out::println);*/

        //How do you find frequency of each element in an array or a list?
        //List<String> list = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        //String[] arrays = {"Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil"};

        /*list.stream().collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()>0)
                .map(entry->entry.getKey()+"-"+entry.getValue()).forEach(System.out::println);*/
       /* Arrays.stream(arrays).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()>0).map(entry->entry.getKey()+"-"+entry.getValue())
                .forEach(System.out::println);*/

        //How do you sort the given list of decimals in reverse order?
        //List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        //decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); //reverse order
        //decimalList.stream().sorted().forEach(System.out::println);


        //Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
        /*List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String collect = listOfStrings.stream().collect(Collectors.joining(",", "[", "]"));
        System.out.printf(collect);*/

        /*//From the given list of integers, print the numbers which are multiples of 5?
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        listOfIntegers.stream().filter(num->num%5==0).forEach(System.out::println);*/

        //Given a list of integers, find maximum and minimum of those numbers?
        //List<Integer> listOfInteger = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        /*Integer max = listOfInteger.stream().max(Comparator.naturalOrder()).get();
        Integer min = listOfInteger.stream().min(Comparator.naturalOrder()).get();
        System.out.println("max- "+max);
        System.out.printf("min- "+min);*/

        /*IntSummaryStatistics states = listOfInteger.stream().collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("Max -"+states.getMax());
        System.out.println("Min -"+states.getMin());*/

        //How do you merge two unsorted arrays into single sorted array using Java 8 streams?

       /* int[] a = new int[] {4, 2, 7, 1};
        int[] b = new int[] {8, 3, 9, 5};*/
        //IntStream.concat(Arrays.stream(a).sorted(),Arrays.stream(b).sorted()).forEach(System.out::println);
        /*int[] toArray = IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .sorted()
                .toArray();
        System.out.println( Arrays.toString(toArray));*/

        //10) How do you merge two unsorted arrays into single sorted array without duplicates?
        /*int[] a = new int[] {4, 2, 5, 1};

        int[] b = new int[] {8, 1, 9, 5};
        int[] toArray=IntStream.concat(Arrays.stream(a), Arrays.stream(b))
                .sorted().distinct()
                .toArray();
        System.out.println(Arrays.toString(toArray));*/

        //11) How do you get three maximum numbers and three minimum numbers from the given list of integers?
        /*List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> min3 = listOfIntegers.stream().sorted(Comparator.naturalOrder()).limit(3).collect(Collectors.toList());
        List<Integer> max3 = listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println(min3);
        System.out.println(max3);*/

        //12Java 8 program to check if two strings are anagrams or not?

        /*String s1 = "RaceCar";
        String s2 = "CarRace";
        String sortedStr1 = s1.chars()
                .sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        String sortedStr2 = s2.chars()
                .sorted()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        if (sortedStr1.equals(sortedStr2)) {
            System.out.println("anagram");
        }else {
            System.out.println("not anagram");
        }*/

        //13) Find sum of all digits of a number in Java 8?
        //int i = 15623;
        /*int sum = String.valueOf(i).chars().map(Character::getNumericValue).sum();
        System.out.println(sum);*/

        /*Integer sum = Arrays.stream(String.valueOf(i).split("")).collect(Collectors.summingInt(e -> Integer.parseInt(e)));
        System.out.println(sum);*/

        /*//14) Find second largest number in an integer array?
        List<Integer> listOfInteger = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);//75,56,45,31,24,15
        Integer secondHighestNumber = listOfInteger.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(secondHighestNumber);*/

        //15.1) Given a list of strings, sort them according to increasing order of their length?
        //List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Ram", "Aam", "HTML", "Kotlin", "C++", "COBOL", "C");
       /* listOfStrings.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList())
                .forEach(System.out::println);*/

        //15.2) Given a list of strings, sort them according to decreasing order of their length?
        /*listOfStrings.stream().sorted(Comparator.comparing(String::length).reversed()).collect(Collectors.toList())
                .forEach(System.out::println);
        */

        //16) Given an integer array, find sum and average of all elements?
         /*int[] listInt = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        IntSummaryStatistics intSummaryStatistics = Arrays.stream(listInt).summaryStatistics();
        System.out.println("Sum :"+intSummaryStatistics.getSum());
        System.out.println("Average :"+intSummaryStatistics.getAverage());*/

        /*//17) How do you find common elements between two arrays?
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        List<Integer> commonNumber = list1.stream().filter(e -> list2.contains(e)).collect(Collectors.toList());
        System.out.println(commonNumber);*/

        /*//18) Reverse each word of a string using Java 8 streams?
        String str1 = "java concept of the day";
        List<StringBuffer> collect = Arrays.stream(str1.split(" ")).map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.toList());
        System.out.println(collect);*/

        /*//19) How do you find sum of first 10 natural numbers?
        int sum = IntStream.range(1, 11).sum();
        System.out.println("Sum :"+sum);*/

        /*//(20) Reverse an integer array
        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        int[] ints = IntStream.range(0, array.length).map(i -> array[array.length - 1 - i]).toArray();
        System.out.println(Arrays.toString(ints));*/

        /*//21) Print first 10 even numbers
        IntStream.range(10, 20).map(i -> i*2).forEach(System.out::println);*/

        /*//22) How do you find the most repeated element in an array?
        List<String> listOfStrings = Arrays.asList("Saurabh","Pen", "Saurabh","Saurabh","Saurabh","Eraser", "Note Book", "Pen",
                "Pencil", "Pen", "Note Book", "Pencil");
        String maxFrequency = listOfStrings.stream().collect(Collectors.groupingBy(cha->cha, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).map(entry->entry.getKey()+" : "+entry.getValue()).get();
        System.out.println(maxFrequency);*/

        /*//23) Palindrome program using Java 8 streams
        String palindrome = "ROTATOR";
        boolean match = IntStream.range(0, palindrome.length() / 2).noneMatch(i -> palindrome.charAt(i) != palindrome.charAt(palindrome.length() - i - 1));
        if (match){
            System.out.println("This is a palindrome");
        }else {
            System.out.println("This is not a palindrome");

        }*/

        /*//24) Given a list of strings, find out those strings which start with a number?
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six","Seven");
        *//*List<String> collect = listOfStrings.stream().filter(str123 -> Character.isDigit(str123.charAt(0))).collect(Collectors.toList());
        System.out.println(collect);*/

        /*//start with alphabet
        List<String> firstAlphabet = listOfStrings.stream().filter(str -> Character.isAlphabetic(str.charAt(0))).collect(Collectors.toList());
        System.out.println(firstAlphabet);*/

       /* //25) How do you extract duplicate elements from an array?
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> uniqueElements=new HashSet<>();
        List<Integer> duplicateElements = listOfIntegers.stream().filter(i -> !uniqueElements.add(i)).collect(Collectors.toList());
        System.out.println(duplicateElements);*/

       /* //26) Print duplicate characters in a string?
        String str = "Java Concept Of The Day";
        String inputString=str.replaceAll("\\s+", "").toLowerCase();
        inputString.chars().mapToObj(ch->(char)ch).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()>1).map(en->en.getKey()+"-"+en.getValue())
                .forEach(System.out::println);*/

       /* //27) Find first repeated character in a string?
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        String firstRepeatedCharacter = inputString.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() > 1).map(en -> en.getKey() + " : " + en.getValue()).findFirst().get();
        System.out.println(firstRepeatedCharacter);*/

       /* //28) Find first non-repeated character in a string?
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        String firstRepeatedCharacter = inputString.chars().mapToObj(ch -> (char) ch).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() ==1).map(en -> en.getKey() + " : " + en.getValue()).findFirst().get();
        System.out.println(firstRepeatedCharacter);*/

        //29) Fibonacci series
        //Stream.iterate(new int[]{0,1},f -> new int[] {f[1] , f[0] + f[1]}).limit(10).map(f->f[0]).forEach(System.out::println);

        /*//31) How do you get last element of an array?
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        String lastString = listOfStrings.stream().skip(listOfStrings.size() - 1).findFirst().get();
        System.out.println(lastString);*/

        /*//32) How do you get second last element of an array?
        List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        String lastString = listOfStrings.stream().skip(listOfStrings.size() - 2).findFirst().get();
        System.out.println(lastString);*/


    }
}
