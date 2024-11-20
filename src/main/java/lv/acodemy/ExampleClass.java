package lv.acodemy;

public class ExampleClass {
    public static void main(String[] args)
    {
        sayHello();

        greet( "Aleksandra");
        greet( "Sandra");

        System.out.println(add(30, 2));
        int x = add(30, 3);
        System.out.println(x);

        System.out.println(add(12.2, 13.5));
        // mozhno e6jo i tak:
        double a = 12.12;
        double b = 13.5;
        System.out.println(add(a,b));


    }

    // metodi ni4ego ne vozvra6ajut
    public static void sayHello()
    {
        System.out.println("Hello, World!");
    }
    public static void greet(String name)
    {
        System.out.println("Hello, " + name + "!");
    }

    // metod vozvra6aet
    // metod kot. vozvra6aet, nado prisvoitj peremennuju ili vivesti na ekran
    // dva odinakovih metoda odnovremenno ne mozhet su6estvovatj
    // mozhno imetj odinakovije metodi no s raznimi parametrami (peregruzka metoda-method overloading)
    public static int add(int a, int b)
    {
         return a + b;
    }

    public static double add(double a, double b)
    {
        return a + b;
    }


}
