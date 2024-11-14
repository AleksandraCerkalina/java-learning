package lv.acodemy;

public class Variables {
    public static void main(String[] args) {

        // This is my comment

        /*
        This is first line
        This is second line
         */

        // int (integer) - whole number -> celoje/naturaljnoje 4islo
        int age = 30;
        int currentYear = 2024;
        // currentYear -> camel case (lower camel case)
        // current_Year -> snake case
        // current-year-is -> kebab case

        int inventoryItemCount = 100;

        System.out.println(age); // vivoditsja 4islo 30
        System.out.println(currentYear); // vivoditsja 4islo 2024
        System.out.println(inventoryItemCount); // vivoditsja 4islo 100

        // double (drobnije 4isla) fractional numbers
        double temperature = 36.6;
        double price = 19.99;
        double distance = 38400.0;

        // float shortDistance = 10.300000f;

        System.out.println(temperature); // vivoditsja 4islo 36.6
        System.out.println(price); // vivoditsja 4islo 19.99
        //System.out.println(distance);

        // char (symbols) soderzhit toljko 1 bukvu

        char grade = 'A';
        char myInitial = 'A'; // toljko 1 bukva mozhet bitj
        char currencySymbol = '$';

        System.out.println(grade); // vivoditsja A
        System.out.println(myInitial); // vivoditsja A
        System.out.println(currencySymbol); // vivoditsja $

        // boolean (logical type, can keep only two values: true/false)
        // How to name? has or is
        // Example: isSummer / if(isSummer) {}; / isLoggedIn;
        // Example: hasApples / if(hasApples) {};

        boolean hasAccess = true;
        System.out.println(hasAccess); // vivoditsja true

        boolean isSummer = false;
        System.out.println(isSummer); // vivoditsja false

        System.out.print("Hello World\n"); // vivoditsja Hello World
        System.out.print("Hello World"); // vivoditsja Hello World15

        // long
        long phoneNumber = 12345678;

        // float
        float interestRate = 4.5f;

        // arithmetic aoperators

        int a = 10;
        int b = 5;
        int sum = a + b; // add
        System.out.println(sum); // vivoditsja 4islo 15

        int c = 20;
        int d = 8;
        int difference = c - d;
        System.out.println(difference); // vivoditsja 4islo 12

        int m = 7;
        int n = 3;
        int result = m * n;
        System.out.println(result); // vivoditsja 4islo 21

        // Divide
        int num1 = 10;
        int num2 = 3;
        int division = num1 / num2;
        System.out.println(division); // vivoditsja 4islo 3

        double num3 = 10.0;
        double num4 = 3.0;
        double divResult = num3 / num4;
        System.out.println(divResult); // vivoditsja 4islo 3.3333333333333335

        // % (remainder of a division)

        int f = 12;
        int g = 5;
        int remainder = f % g;
        System.out.println(remainder); // vivoditsja 4islo 2

        int number = 9;
        boolean isEven = (number % 2 == 0); // == comparison operator
        System.out.println(isEven); // vivoditsja false

        // Increment ++
        // ++preIncrement
        // Decrement --
        // --decrement

        number++; // number = 9 ++ number = 10
        System.out.println(number); // vivoditsja 10
        number--; // number = 9
        System.out.println(number); // vivoditsja 9

        int counter = 10; // zna4enije 10 prisvaivaetsja counter
        counter++; // counter uveli4ivaetsja na +1 = 11
        int postIncrement = counter++; //postIncrement = 11; counter = 12;
        int preIncrement = ++counter; // preIncrement = zna4enije counter uveli4ivaetsja na +1 = 13; counter = 13;
        System.out.println(postIncrement); // vivoditsja 11
        System.out.println(preIncrement); // vivoditsja 13

        // 14.11.2024

        String name = "John";
        String lastName = "Doe";

        // Print them separately
        System.out.println(name);
        System.out.println(lastName);

        String fullName = name + " " + lastName;
        System.out.println(fullName);

        // %s - for String
        // %d - for numbers
        // %b - boolean

        System.out.println(String.format("My name is: %s, My surname is: %s", name, lastName));
        System.out.printf("My name is: %s, My surname is: %s\n", name, lastName);
        System.out.printf("My name is: %s, My surname is: %s%n", name, lastName);

        var myCurrentAge = 30;
        var text = "Hello World";

        String myVar;
        myVar = "Hello World!";










    }
}

