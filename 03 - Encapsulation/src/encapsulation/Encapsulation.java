package encapsulation;


public class Encapsulation {


    public static void main(String[] args) {
        Car myCar = new Car();

        //Set values
        myCar.setColor("Red");
        myCar.setKey(478302938);

        //Get the values
        System.out.println(myCar.getColor());
        System.out.println(myCar.getKey());
    }
    
}
