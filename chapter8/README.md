## Chapter 8 Notes

constructor parameters can be any valid class, array, or primitive type, including generics, but may not include **var** (361)

there can be only one call to this() in any constructor (365)

the first statement of every constructor is either a call to another constructor within the class, using this() , or a call to a constructor in the direct parent class, using super() (366)

like static variables, instance variables marked **final** must be assigned a value exactly once (370)

The most important rule with class initialization is that it happens at most once for each
class. (373)

**Initialize Class X** (373)
1. If there is a superclass Y of X, then initialize class Y first.
2. Process all static variable declarations in the order they appear in the class.
3. Process all static initializers in the order they appear in the class.

the class containing the program entry point, aka the main() method, is loaded before the main() method is executed (374)

the first line of every constructor is a call to this() or super() , and if omitted, the compiler will automatically insert a call to the parent no-argument constructor super() (374)

**Initialize Instance of X** (374)
1. If there is a superclass Y of X, then initialize the instance of Y first.
2. Process all instance variable declarations in the order they appear in the class.
3. Process all instance initializers in the order they appear in the class.
4. Initialize the constructor including any overloaded constructors referenced with this().

If the first statement of a constructor is not a call to this() or super() , then the compiler will insert a no-argument super() as the first statement of the constructor. (378)

If a class only defines private constructors, then it cannot be extended by a top-level class. (378)