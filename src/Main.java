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
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        // CREATING AN ARRAYLIST.
        // Use the wrapper classes to store the primitives in an ArrayList.
        // Constructs an empty list with an initial capacity of ten.
        // ArrayList.add()

        ArrayList<String> top15BabyGirlNamesUSAList = new ArrayList<>();
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

        // GET ONE ELEMENT AT INDEX...
        // ArrayList.get()
        System.out.println("The fifth names is: " + top15BabyGirlNamesUSAList.get(5));

        for (int i = 0; i < top15BabyGirlNamesUSAList.size(); i++) {
            System.out.println((i + 1) + ") " + top15BabyGirlNamesUSAList.get(i));
        }

        // REMOVING ELEMENTS IN AN ARRAY.
        // ArrayList.remove()
        top15BabyGirlNamesUSAList.remove("Emma"); // Removing with an object.
        top15BabyGirlNamesUSAList.remove(12); // Removing at index.

        for (int i = 0; i < top15BabyGirlNamesUSAList.size(); i++) {
            System.out.println((i + 1) + ") " + top15BabyGirlNamesUSAList.get(i));
        }
        System.out.println("New Size: " + top15BabyGirlNamesUSAList.size());

        // REPLACING AN ELEMENT AT INDEX 12.
        // ArrayList.set()
        top15BabyGirlNamesUSAList.set(12, "Maria de los Angeles");

        for (int i = 0; i < top15BabyGirlNamesUSAList.size(); i++) {
            System.out.println((i + 1) + ") " + top15BabyGirlNamesUSAList.get(i));
        }
        System.out.println("New Size: " + top15BabyGirlNamesUSAList.size());

        // ArrayList.contains() returns a boolean.
        System.out.println(top15BabyGirlNamesUSAList.contains("Anna")); // false
        System.out.println(top15BabyGirlNamesUSAList.contains("Sofia")); // true.


        // Creating an ArrayList from an array:
        Integer[] array = {3, 5, 95, 4, 15, 34, 3, 6, 5};
        //ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        // Shuffle (MEZCLAR)
//        Collections.shuffle(list);
//        System.out.println(list);

        //
        System.out.println("\n---------- ARRAYLIST --------");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Frutilla");
        fruits.add("Palta");
        fruits.add("Mango");
        fruits.add("Limón");
        fruits.add("Arándano");
        System.out.println(fruits);
        for (String s : fruits) {
            System.out.println(s);
        }
        fruits.remove("Palta");
        for (String s : fruits) {
            System.out.println(s);
        }


        //
        System.out.println("\n---- FILLING AN ARRAYLIST ----");
        Arrays.fill(array, 11); // LLena todas las posiciones con el valor.

        String[] streets = {"Santa Fe", "Asunción"};
        Arrays.sort(streets);
        for (String st : streets) {
            System.out.println(st + " ");
        }
        Arrays.fill(streets, "Done");
        for (String st : streets) {
            System.out.println(st + " ");
        }
    }
}


//            for(String s : fruits){
//                System.out.print(s + " ");
//
//                fruits.sort(null); // ordena natural A a Z
//                for(String su : fruits){
//                    System.out.println(su);
