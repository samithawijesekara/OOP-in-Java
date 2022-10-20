package pkg08.interfaces;


public class Whale implements Mammals, Fish {

    @Override
    public void mammalsSound() {
        System.out.println("Whale sound is Mmmmmmmm");
    }

    @Override
    public void sleep() {
        System.out.println("Whale sleep in the sea");
    }

    @Override
    public void swim() {
        System.out.println("Whale swim in the sea");
    }
    
}
