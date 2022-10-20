package pkg06.pkgsuper.keyword;


public class Pig extends Animal{
    
    String condition;
    
    Pig(String condition){
        //By using the "super" keyword we can access super class constructor from inside this class constructor. If super class constructor should need paramters we need to pass the values from here.
        super(4, "Rose");
        //Also we can sets the new attributes values inside this constructor 
        this.condition = condition;
    }   

    @Override
    void animalSound(){
        //We can acess the super class methids and attributes using "super" keyword
        super.animalSound();
        System.out.println(super.legs);
        System.out.println(super.color);
    }

    
}
