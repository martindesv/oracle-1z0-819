constructor parameters can be any valid class, array, or primitive type, including generics, but may not include **var** (361)

there can be only one call to this() in any constructor (365)

the first statement of every constructor is either a call to another constructor within the class, using this() , or a call to a constructor in the direct parent class, using super() (366)

like static variables, instance variables marked **final** must be assigned a value exactly once (370)