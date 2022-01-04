package chapter8.java;

public class Panda2 extends Bear2 {
  public static void sneeze() { // DOES NOT COMPILE - static
    System.out.println("Panda sneezes quietly"); 
  }
  public void hibernate() { // DOES NOT COMPILE - static
    System.out.println("Panda is going to sleep");
  }
  public static void laugh() { // DOES NOT COMPILE - weaker access modifier
    System.out.println("Panda is laughing"); 
  }
}
