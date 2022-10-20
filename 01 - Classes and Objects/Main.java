public class Main{

    public static void main(String[] args){

        //Creating myCar object from the Car class
        Car myCar = new Car();

        //calling to the Car class attributes and methods
        System.out.println(myCar.wheels);
        System.out.println(myCar.color);
        myCar.maxSpeed(200);

    }

}