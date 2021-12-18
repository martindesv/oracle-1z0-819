package chapter8;

class Mammal {
    String type = "mammal";
}
public class Bat extends Mammal {
    String type = "bat";
    public String getType() {
        return super.type + ":" + this.type;
    }
    public static void main(String... zoo) {
        System.out.println(new Bat().getType());
        System.out.print(new Bat().type);
    }
}
