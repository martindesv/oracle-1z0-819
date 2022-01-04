package chapter8.java;

class Penguin2 {
    public static int getHeight() { return 3; }
    public void printInfo() {
        System.out.print(this.getHeight());
    }
}
public class EmperorPenguin extends Penguin2 {
    public static int getHeight() { return 8; }
    public static void main(String []fish) {
        new EmperorPenguin().printInfo();
    }
}