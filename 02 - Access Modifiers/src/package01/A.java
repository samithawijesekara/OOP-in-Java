package package01;


public class A {
    
    //Private - Only access from this class
    private static String password = "01 - @#$r3874*&^";

    //Default - Only access from this class & inside the same package
    static int age = 10;

    //Proteccted - Only access from this class, child classes & inside the same package 
    protected static String nic = "01 - 8937939883V";

    //Public - can access from anywhere
    public static String name = "01 - Samitha";
    
}
