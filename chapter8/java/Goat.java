package chapter8.java;

import java.util.ArrayList;
import java.util.List;

public class Goat extends Mammal2 {
    public List<CharSequence> play() { // DOES NOT COMPILE - incompatible return type
        return new ArrayList<>();
    }
    public String sleep() {
        return "test";
    }
}
