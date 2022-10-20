package encapsulation;


public class Car {
    
    private String color;
    private int key;

    //Creating setter & getter to color attribute
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }

    //Creating setter & getter to key attribute
    public void setKey(int key){
        this.key = key;
    }
    public int getKey(){
        return key;
    }
    
    
}
