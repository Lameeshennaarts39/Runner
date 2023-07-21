import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Collin");

//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tire");
        System.out.println("Second task: " + scottishIslands);

//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(1, "Islay");
        // Could also write:
        scottishIslands.add(scottishIslands.indexOf("Jura") + 1, "Islay");

//        4. Print out the index position of "Skye"
        //some cases - Objects - may not be simple as objects are
        //not always the same
        int skyIndex = scottishIslands.indexOf("Skye");
        System.out.println("skyIndex of skye is " + skyIndex);
//        5. Remove "Tresco" from the list by name
        scottishIslands.remove("Tresco");
//        6. Remove "Arran" from the list by index
        scottishIslands.remove(scottishIslands.indexOf("Arran"));
        scottishIslands.remove(5);
//        7. Print the number of islands in your arraylist
        int numberOfIslands = scottishIslands.size();
        System.out.println("number of Islands:" + numberOfIslands);

//        8. Sort the list alphabetically
        Collections.sort(scottishIslands);

//        ArrayList<String> sortedIslands = Collections.sort(scottishIslands);
//        The above will not work. Will not work - sort is a void method.
//        It does not return anything. Void does not return anything.
//        You can store the result of the sort as a variable
//        Collections.sort does not give you back an array list
//        It changes the array list that you are passing as an arg
//        so, it changes the value you are giving it rather than
//        leaving the original in tack, giving you back a modified value

//        9. Print out all the islands using a for loop
        for (String island : scottishIslands) {
            System.out.println(island);
//            System.out.println(scottishIslands);
        }

//        NUMBERS
//        How to set up array list quickly: create an empty array list
//        First argument is number, second is separated elements
//        Don't have to write number.add(number) 20 times

//        1. Print out a list of the even integers
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);
        ArrayList<List<Integer>> evenNumbers = new ArrayList<>();
        for (int readingNumber : numbers) {
            if (readingNumber % 2 == 0) {
//      here 0 represents any remainders - no remainders
//      must be even!
                evenNumbers.add(numbers);
            }
        }
        System.out.println("even numbers: " + evenNumbers);

//        You could have printed out directly if you wanted to
//        evenNumbers.add(number);
//        very common pattern, to grab an empty list, start
//        putting in items from original list
//        print out at the end the filtered list

//        2. Print the difference between the largest and smallest value
        int maxNumber = Collections.max(numbers);
        int minNumber = Collections.min(numbers);
        int diffInNumbers = maxNumber - minNumber;
        System.out.println("Difference between the largest and min value: " + diffInNumbers);
//        3. Print True if the list contains a 1 next to a 1 somewhere.
//                boolean result = false;
//                for (int i = 0; i < numbers.size(); i++) {
//                    if (numbers.get(i) == 1 && numbers.get(i + 1) == 1){
//                        result = true;
//                    }
//                }
//                    System.out.println(result);
//        }
//    With i (index) you can access the list
//    when you run a classic for loop with syntax i you have access to the index
//    this means in a signle iteration you can check the current item
//    and the prev/next item aswell because you have the index.
//    with a regular for loop you can't check two numbers same time!
//        4. Print the sum of the numbers,
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        System.out.println("Total: " + total);
//    cannot keep accumlator inside the for lopp - it needs to stay outside
//    otherwise it gets reset to 0 every time.

//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [2, 7, 13, 2] would have sum of 9.
//          use continue if you want to skip 13
//          use break if you want to not count anything after 13.
        int sumOfNumbers = 0;
        for (int number : numbers) {
            if (number == 13) {
                break;
            }
            total += number;
        }
    }
}

