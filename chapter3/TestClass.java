package chapter3;

import java.util.function.Consumer;

class Base {
    void testMethod() throws Exception {}
}

interface MyInterface {
    private void method() {}

    public default void defMethod() {
        method();
    }

    public static void pubMethod() {}
}

public class TestClass extends Base {
    @Override
    void testMethod() throws RuntimeException {
        var var = "s";
    }

}
