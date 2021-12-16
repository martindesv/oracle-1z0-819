package src;

public class Animal {
  private int age;
  protected String name;

  public int getAge() {
    return age;
  }

  public void setAge(int newAge) {
    age = newAge;
  }

  public Animal(int age) {
    super(); // Refers to constructor in java.lang.Object
    this.age = age;
  }

  public Animal() {
    super();
  }
}
