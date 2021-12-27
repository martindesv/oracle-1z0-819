package chapter8.java;

public class Panda2 extends Bear2 {
  public void sneeze() { // DOES NOT COMPILE
    System.out.println("Panda sneezes quietly"); 
  }
  public static void hibernate() { // DOES NOT COMPILE 
    System.out.println("Panda is going to sleep");
  }
  protected static void laugh() { // DOES NOT COMPILE
    System.out.println("Panda is laughing"); 
  }
}
