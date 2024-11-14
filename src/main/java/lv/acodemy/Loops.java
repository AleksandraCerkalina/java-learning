package lv.acodemy;

public class Loops
{
    public static void main(String[] args)
    {

        String[] shoppingList = {"Bread", "Milk", "Eggs", "Fruits"}; // Bread-0, Milk-1, Egg-2, Fruits-3
        for (int i = 0; i < shoppingList.length; i++) // i=0, vivodit vna4ale Bread, potom i++, vivodit Milk i td
        {
            System.out.println("Current product is " + shoppingList[i]); // i vsegda budet menjatsja
        }
        System.out.println("Goes next!");


        for (String s : shoppingList)
        {
            System.out.println("Current product is " + s);
        }
        System.out.println("Goes next!");


        int i = 0;
        while(i < shoppingList.length)
        {
            System.out.println("Current product is " + shoppingList[i]);
            i++;
        }

        int j = 0;

        do
        {
            System.out.println("Current product is " + shoppingList[j]);
            j++;
        }
        while (j < shoppingList.length);


        boolean x = i < 5 && 6 > 3; // && - End. True budet, esli sleva i sprava zna4enija budut vernije
        boolean y = 2 < 5 || 3 < 2; // || - or
        System.out.println(x);
        System.out.println(y);






    }
}
