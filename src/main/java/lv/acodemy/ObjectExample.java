package lv.acodemy;

import lv.acodemy.objects.Car;
import lv.acodemy.objects.Dog;

public class ObjectExample {
    public static void main(String[] args)
    {
        //sozdanije objekta: klass - Car, objekt - audi
        Car audi = new Car("Blue", "RS6");
        audi.start();
        System.out.println(audi);

        //audi.color = "Blue";
        //audi.model = "RS6";
        audi.setColor("Blue");
        audi.setModel("RS6");

        System.out.println(audi);

        // Create BMW object
        // Start your BMW
        // Set color & model

        Car chuma = new Car();
        //chuma.color = "Grey";
        //chuma.model = "M235";
        chuma.setColor("Grey");
        chuma.setModel("M235");
        chuma.start();
        System.out.println(chuma);

        // Print text: My car model is %s, and color is: %s
        System.out.println("My car model is "+chuma.getModel()+" and color is "+chuma.getColor());
        // System.out.println(String.format("My car model is %s, and color is: %s:", chuma.getModel(), chuma.getColor() ));

        Dog theSharik = new Dog();
        theSharik.bark();
        theSharik.eat();








    }
}
