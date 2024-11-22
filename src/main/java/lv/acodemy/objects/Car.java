package lv.acodemy.objects;

import java.sql.SQLOutput;

public class Car {
    // polja dlja objekta:

    private String color;
    private String model;



    public Car(String color, String model)
    {
        this.color = color;
        this.model = model;
    }

    public Car()
    {
    }

    //metod (start) void ni4ego ne vozvra6aet
    public void start()
    {
        System.out.println("Car started");
    }



    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    // Getteri - vozvra6ajut zna4enije peremenno
    // Setteri - menjajut zna4enije v etih peremennih
    // estj metod Get color, kot vozvra6aet string


    // getter
    public String getColor() {
        return color;
    }

    // setter
    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
