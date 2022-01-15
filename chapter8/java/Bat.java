package chapter8.java;

class Mammal {
    String type = "mammal";
}
public class Bat extends Mammal {
    String type = "bat"; // variable hiding
    public String getType() {
        return super.type + ":" + this.type;
    }
    public static void main(String... zoo) {
        System.out.println(new Bat().getType());
        System.out.print(new Bat().type);
    }
}
