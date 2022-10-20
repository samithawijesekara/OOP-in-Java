package pkg01.classes.and.objects;


public class ClassesAndObjects {


    public static void main(String[] args) {
        
        //Creating myCar object from the Car class
        Car myCar = new Car();

        //calling to the Car class attributes and methods
        System.out.println(myCar.wheels);
        System.out.println(myCar.color);
        myCar.maxSpeed(200);
        
        //Paasing the values to the constructor
        Bike myBike = new Bike("Bajaj", 2, "Black");
        System.out.println(myBike.model);
        System.out.println(myBike.color);
        System.out.println(myBike.wheels);
        
    }
    
}
