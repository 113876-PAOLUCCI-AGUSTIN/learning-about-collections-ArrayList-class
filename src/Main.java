/* IMPORTANT: An ArrayList STORES OBJECTS >>>> STRING, INTEGER, CHARACTER, ETC ETC!!!!!!!!!!!!
 *
 * The ArrayList class is a resizable array, which can be found in the java.util package.
 * The difference between a built-in array and an ArrayList in Java, is that the size of
 * an array cannot be modified (if you want to add or remove elements to/from an array,
 * you have to create a new one).
 * While elements can be added and removed from an ArrayList whenever you want.
 * The syntax is also slightly different.
 * Elements in an ArrayList are actually objects. In the examples above, we created elements
 * (objects) of type "String". Remember that a String in Java is an object (not a primitive
 * type).
 *
 * SOURCE: https://www.w3schools.com/java/java_arraylist.asp
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // CREATING AN ARRAYLIST.
        // Constructs an empty list with an initial capacity of ten.

        ArrayList<String> top15BabyGirlNamesUSAList = new ArrayList<String>();
        top15BabyGirlNamesUSAList.add("Olivia");
        top15BabyGirlNamesUSAList.add("Emma");
        top15BabyGirlNamesUSAList.add("Charlotte");
        top15BabyGirlNamesUSAList.add("Amelia");
        top15BabyGirlNamesUSAList.add("Sophia");
        top15BabyGirlNamesUSAList.add("Isabella");
        top15BabyGirlNamesUSAList.add("Ava");
        top15BabyGirlNamesUSAList.add("Mia");
        top15BabyGirlNamesUSAList.add("Evelyn");
        top15BabyGirlNamesUSAList.add("Luna");
        top15BabyGirlNamesUSAList.add("Harper");
        top15BabyGirlNamesUSAList.add("Camila");
        top15BabyGirlNamesUSAList.add("Sofia");
        top15BabyGirlNamesUSAList.add("Scarlett");
        top15BabyGirlNamesUSAList.add("Elizabeth");
        System.out.println(top15BabyGirlNamesUSAList.size());
    }
}