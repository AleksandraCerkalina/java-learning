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

        System.out.println(age);
        System.out.println(currentYear);
        System.out.println(inventoryItemCount);

        // double (drobnije 4isla) fractional numbers
        double temperature = 36.6;
        double price = 19.99;
        double distance = 38400.0;

        float shortDistance = 10.300000f;

        System.out.println(temperature);
        System.out.println(price);
        //System.out.println(distance);

        // char (symbols) soderzhit toljko 1 bukvu

        char grade = 'A';
        char myInitial = 'A';
        char currencySymbol = '$';

        System.out.println(grade);
        System.out.println(myInitial);
        System.out.println(currencySymbol);

        // boolean (logical type, can keep only two values: true/false)
        // How to name? has or is
        // Example: isSummer / if(isSummer) {}; / isLoggedIn;
        // Example: hasApples / if(hasApples) {};

        boolean hasAccess = true;
        System.out.println(hasAccess);

        boolean isSummer = false;
        System.out.println(isSummer);

        System.out.print("Hello World\n");
        System.out.print("Hello World");

        // long
        long phoneNumber = 12345678;

        // float
        float interestRate = 4.5f;

        // arithmetic aoperators

        int a = 10;
        int b = 5;
        int sum = a + b; // add
        System.out.println(sum);

        int c = 20;
        int d = 8;
        int difference = c - d;
        System.out.println(difference);

        int m = 7;
        int n = 3;
        int result = m * n;
        System.out.println(result);

        // Divide
        int num1 = 10;
        int num2 = 3;
        int division = num1 / num2;
        System.out.println(division);

        double num3 = 10.0;
        double num4 = 3.0;
        double divResult = num3 / num4;
        System.out.println(divResult);

        // % (remainder of a division)

        int f = 12;
        int g = 5;
        int remainder = f % g;
        System.out.println(remainder);

        int number = 9;
        boolean isEven = (number % 2 == 0); // == comparison operator
        System.out.println(isEven);

        // Increment ++
        // ++preIncrement
        // Decrement --
        // ++decrement









    }
}

