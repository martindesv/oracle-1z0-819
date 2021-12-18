package chapter8.java;

public class Lion extends Animal {
  public void setProperties(int age, String n) {
    setAge(age);
    name = n; 
  }

  public Lion() {
    super(3);
  }

  public void roar() {
    System.out.println(name + ", age " + getAge() + ", says: Roar!");
  }

  public static void main(String[] args) {
    Lion lion = new Lion();
    var animal = lion;
    lion.setProperties(3, "kion"); 
    lion.roar();
    System.out.println(animal.getAge());
  }
}
