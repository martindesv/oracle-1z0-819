package chapter8.java;

public class Jaguar extends BigCat { 
  public final double size;
  public Jaguar() {
    size = 10.2;
    super.size = 5;
  }

  public void printDetails() { 
    System.out.println(size);
  }

  public static void main(String[] values) {
    BigCat cat = new Jaguar();
    Jaguar jaguar = (Jaguar)cat;
    System.out.println(cat.size);
    System.out.println(jaguar.size);
  }
}
