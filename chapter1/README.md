## Working with Java data types

Variable name can't be a single '_', can't begin with a number. Must begin with a letter, $, _

_ allowed between two digits.

var must be used for all lambda parameters, if it used for any.

var color - without a value not allowed.

3.14 is double. Requires casting or writing 3.14f to be a float.

Pay attention if value changes or result of operation is ignored.

Objects allowed to be null, primitives not.

reverse(), insert() only on StringBuilder, not String.

charAt(), length() on both StringBuilder and String.

StringBuilder is mutable, methods return a reference to the same object. String is immutable.

sb.delete(1, 2) deletes starting at 1 and before 2.

When calling print, toString() is automatically called.

/, %, * same operator precedence
