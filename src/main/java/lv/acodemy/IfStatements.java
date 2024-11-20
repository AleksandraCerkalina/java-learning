package lv.acodemy;

public class IfStatements {
    public static void main(String[] args) {


        // Even or Odd - 4islo 4etnoje ili net (if)

        int number = 7;
        if ( number % 2 == 0)
        {
            System.out.println("The number is even.");
        }
        else
        {
            System.out.println("The number is odd.");
        }


        // Check if a number is positive or negative (Assume 0 is positive)

        number = -5;
        if(number >= 0)
        {
            System.out.println("The number is positive.");
        }
        else
        {
            System.out.println("The number is negative.");
        }


        // Grade checker (if-else-if)
        // 90 > A
        // 75 -> 89 = B
        // 50 -> 74 = C
        // < 50 = F

        // 1. Create score variable;
        // 2. Create Logic (if Score >= 90) -> A;
        // 3. else-if (Score >= 75) -> B;
        // 4. else-if (Score >= 50) -> C;
        // 5. else -> F;

        int score = 68;
        if (score >= 90)
        {
            System.out.println("Grade: A");
        }
        else if (score >= 75)
        {
            System.out.println("Grade: B");
        }
        else if (score >= 50)
        {
            System.out.println("Grade: C");
        }
        else
        {
            System.out.println("Grade: F");
        }


        // Task Nr.1: Check if a person is eligible to buy an alcohol (if):
        int age = 67;
        if ( age >= 18)
        {
            System.out.println("Person can buy alco");
        }

        // Task Nr.2: Check if a number can be divided by 5 (if):

        int number1 = 5;
        if ( number1 % 5 == 0)
        {
            System.out.println("Correct %5");
        }

        // Task Nr.3: Check pass of fail
        // if score >= 50 (passed)
        // all other cases (failed)

        int score1 = 6;
        if ( score1 >= 50)
        {
            System.out.println("Test was passed");
        }
        else
        {
            System.out.println("Test was FAILED");
        }

        // Test Nr.4: Temperature message (if-else-if)
        // Above 30 (It's hot)
        // Temperature between 15 and 30 (nice weather)
        // Below 15 (It's cold)

        int temp = 48;
        if ( temp > 30)
        {
            System.out.println("It's hot");
        }
        else if ( temp >= 15 )
        {
            System.out.println("Nice weather");
        }
        else
        {
            System.out.println("It's cold");
        }

        // Nr.5: Traffic light system
        // Green -> Go
        // Yellow -> Slow down
        // Red -> Stop
        // String color
        // if(color.equals("Green")) {}

        String color = "Yellow";
        if ( color.equals("Green"))
        {
            System.out.println("GO");
        }
        else if (color.equals("Yellow"))
        {
            System.out.println("SLOW DOWN");
        }
        else if ( color.equals("Red"))
        {
            System.out.println("STOP");
        }
        else
        {
            System.out.println("Unknown color");
        }








    }
}
