package chapter8.java;

public class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
    public void eat(int food) {
        System.out.println("Bird is eating "+food+" units of food");
    }

    public final boolean hasFeathers() {
        return true; 
    }
    
    public final static void flyAway() {}
}
