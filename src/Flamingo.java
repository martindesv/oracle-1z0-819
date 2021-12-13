package src;

class ParentFlamingo {
  public ParentFlamingo(int num) {

  }
}

public class Flamingo extends ParentFlamingo {
  private String color;
  public void setColor(String color2) {
    color = color2;
  }

  public Flamingo() {
    super(2);
  }

  public static void main(String... unused) { 
    var f = new Flamingo();
    f.setColor("PINK");
    System.out.println(f.color);
  } 
}