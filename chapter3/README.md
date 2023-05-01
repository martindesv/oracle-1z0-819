## Java Object-Oriented Approach

final class can't be extended.

final method can't be overridden.

Abstract method can't be final, private, static. Can be protected, package-private, public.

Interface method can't be final. It can be public or private. No access modifier makes it public.

Only private interface methods are not public.

static method can't access non-static variable without instance of class.

Static nested class can't access instance members of enclosing class.

static initializer should go on class level, not method level.

new Outer.Inner() - instantiate member inner class

Class implements interface, extends abstract class. Interface extends interface.

Class that implements two interfaces that both define a method with same signature needs to override it or code doesn't compile.

Interface must be functional to be used as a lambda. Func. in-face must contain one abstract method.

private non-static interface method may only be accessed from other private or default methods within interface.

Interface variables are implicitly public, static, final.

int Integer = 0; // legal

Integer int = 0; // illegal, all primitives are reserved words

Encapsulation: variables private, methods public.

Method can't be abstract and final. Abstract interface methods are always public.

Enums are implicitly static. Enums can't be defined in a non-static inner class.

Only top-level types and static nested class can define static members other than static constants.

Abstract classes and interface can include static methods. Of all nested classes, only static nested classes can include static methods.

Abstract methods have no body ({}).

Anon. class can extend class, implement interface. It can't be declared final or abstract since it has no class definition.

default keyword is used in interface, annotation, switch.

10 can be returned as int or implicitly promoted to long.

Primitives don't have toString() method.

this keyword can be used to read public members of direct parent class.

protected allows everything package-private does and more.

protected: same package or subclass.

var can't be used to declare multiple variables in same statement.

Varargs can receive array or individual value. Array param can only take array.

Variable hiding: instance variable with same name as variable in parent class.

Method hiding: static method with same signature as static method in parent class.

Abstract class can't be instantiated directly (with "new").

Class can extend only one class. It can implement any number of interfaces - multiple inheritance.

Class can't contain two methods with same signature, even if one is static.

Overriding method is not required to throw same checked exception. If it does declare checked exception, it can't be new or broader. It can declare new unchecked exception.

Comments: single-line (//), multiline (/* \*/), Javadoc(/** **/).

If enum contains more than values, then (;) must follow values.

First line of constructor could be this() or super()

Enum method can be abstract. Then every enum value must include an override of this abstract method.

private and static interface methods are not inherited. Methods can't be final. default and abstract methods are inherited by implementing classes.

var var = "s"; // legal
