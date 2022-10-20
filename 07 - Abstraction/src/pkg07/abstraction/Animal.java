package pkg07.abstraction;


abstract class Animal {
    
    //We couldn't create the objects using abstract classes
    //If we need to creat objects we should inherit this class to another class
    
    
    //This is a abstract method. So it doesn't have a body
    public abstract void animalSound();
    
    //This is regular method
    public void sleep(){
        System.out.println("Animal Sound");
    }
    
}
