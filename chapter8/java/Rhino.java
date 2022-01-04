package chapter8.java;

public class Rhino {
    protected CharSequence getName() {
        return "rhino";
    }
    protected String getColor() {
        return "grey, black, or white";
    }
}

class JavanRhino extends Rhino {
    public String getName() {
        return "javan rhino";
    }
    public String getColor() { // DOES NOT COMPILE - CharSequence
        return "grey";
    }
}
