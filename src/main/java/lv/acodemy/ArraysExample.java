package lv.acodemy;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        // Arrays -- objavlenije massiva
        int[] numbers;
        String[] names;

        // Also an option, but not recommended
        int number[];
        String name[];

        numbers = new int[5]; // vivodit: [0, 0, 0, 0, 0]
        names = new String[3]; // tut mozhno polozhitj imja; vivodit: [null, null, null]

        // sozdajom massiv v kotorom budut 4isla ot 1 do 5
        int[] numberz = {1, 2, 3, 4, 5};
        // massiv imjon
        String[] namez = {"John", "Alex", "Mary", "Bob"}; // John-0 element, Alex-1, Mary-2 i td

        // Element access
        System.out.println(namez[2]); // vizivaem imja Mary
        namez[2] = "Jerry"; // Mary menjaem na Jerry
        System.out.println(Arrays.toString(namez)); // vivodit: [John, Alex, Jerry, Bob]

        String myName = "John";
        System.out.println(myName.charAt(0)); // vivodit bukvu J





















    }

}
