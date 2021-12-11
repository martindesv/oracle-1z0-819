package src;

public class Jaguar extends BigCat { 
  public final double size = 1;
  public Jaguar() {
    super.size = 10.2; 
  }

  public void printDetails() { 
    System.out.println(size);
  }

  public static void main(String[] values) {
    new Jaguar().printDetails();
  }
}
