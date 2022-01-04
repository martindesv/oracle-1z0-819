package chapter8.java;

public class BactrianCamel extends Camel {
    public int getNumberOfHumps() { // DOES NOT COMPILE - weaker access privileges
        return 2;
    }
}
