package inheritance;


public class Inheritance {


    public static void main(String[] args) {
        
        Car myCar = new Car();
        
        //This is from super class
        System.out.println(myCar.brand);
        myCar.honk();
        
        //This is from child class
        System.out.println(myCar.modelName);
        myCar.MustangEngine();
        
    }
    
}
