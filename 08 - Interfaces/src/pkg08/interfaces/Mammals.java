package pkg08.interfaces;


public interface Mammals {

    //Another way to achive abstraction in Java.
    //By using this interfaces we couldn't able to creating the objects.
    //Interfaces methods does not have bodies.
    //Must override all the methods in implementation.
    //Interface caannot contains a constructor.

    int eyes = 2;
    void mammalsSound();
    void sleep();
    
}
