package chapter8.java;

public class Eagle extends Bird {
    public int fly(int height) {
        System.out.println("Bird is flying at "+height+" meters");
        return height;
    }
    public int eat(int food) { // Can't override
        System.out.println("Bird is eating "+food+" units of food");
        return food;
    }
}
