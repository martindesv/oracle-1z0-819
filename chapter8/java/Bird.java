package chapter8.java;

public class Bird {
    public void fly() {
        System.out.println("Bird is flying");
    }
    private void eat(int food) {
        System.out.println("Bird is eating "+food+" units of food");
    }

    public boolean hasFeathers() {
        return true; 
    }
    
    public static void flyAway() {}
}
