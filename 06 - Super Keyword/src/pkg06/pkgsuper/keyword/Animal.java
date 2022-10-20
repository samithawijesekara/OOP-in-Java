package pkg06.pkgsuper.keyword;


public class Animal {
    
    //This is the super(parent) class
    
    int legs;
    String color;
    
    Animal(int legs, String color){
        this.legs = legs;
        this.color = color;
    }
    
    void animalSound(){
        System.out.println("Animal Sound");
    }
    
}
