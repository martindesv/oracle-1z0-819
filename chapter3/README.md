## Java Object-Oriented Approach

final class can't be extended.

final method can't be overridden.

Abstract method can't be final, private. Can be protected, package-private, public.

Interface method can't be final. It can be public or private. No access modifier makes it public.

static method can't access non-static variable without instance of class.

Static nested class can't access instance members of enclosing class.

static initializer should go on class level, not method level.

new Outer.Inner() - instantiate member inner class

Class implements interface, extends abstract class. Interface extends interface.

default keyword is used in interface, annotation, switch.

10 can be returned as int or implicitly promoted to long.

Primitives don't have toString() method.

this keyword can be used to read public members of direct parent class.

