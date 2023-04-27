## Controlling Program Flow

switch supports byte, short, int, char, Byte Short, Integer, Character. Permits var if it can be resolved to one of those types. float, double, long not supported.

default in switch is optional. Can be placed in any order within case statements. Doesn't take parameter.

switch requires {}

Value of a case statement must be a constant, literal value, or a final variable.

If there is no break in case stmt, once the matching case is reached, all remaining case stmts executed.

'do {} while', not ()

while requires boolean.

for, while, if - braces, {}, optional if one stmt inside.

for-each accepts arrays and classes that implement Iterable. String and StringBuilder don't implement Iterable.

for( ; ; ) {} - for loop with not args.

In for loop, only 1 initialization type is allowed. If more than 1 variable is supplied, they are separated by comma.

If inner for-each doesn't use braces, break applies to outer loop only.

There can't be two 'else' as part of one 'if'.

If no {} for 'if', then only first next line is part of that 'if'.

-- can be applied only to variables, not values.
