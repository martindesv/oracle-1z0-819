## Working with Arrays and Collections

When using array initializer with braces {}, it is not allowed to specify size separately.

? can't be used when instantiating a type on the right side of =

Empty 2D array with dimensions 2x2:

int [][] blue = new int[2][2];

If lookup by key, use map. LinkedList is a Queue.

To sort the longest strings first:

public int compare(String s1, String s2) { return s2.length() - s1.length(); }

Arrays.binarySearch() returns positive int if match is found.

var can't be used with [] after it.

TreeSet is sorted. Converting ArrayList to TreeSet removes duplicates.

HashSet doesn't commit to an output order.

LinkedList is a Deque (doubled-ended queue). offer() adds to back. push() adds to front.

TreeMap and TreeSet keep track of sort order when you insert elements. TreeMap sorts keys, TreeSet sorts objects.

Array has to be sorted before calling binarySearch().

mismatch() returns -1 if arrays are same and returns index of first difference if they aren't.

Comparable<> has compareTo() that takes one parameter. Comparator<> has compare() that takes two parameters.

List is interface, doesn't have constructor. List.of() creates immutable list.

When creating an array object, a set of elements or size is required.

float[] tiger = new float[1];

Set.copyOf(list) allows you to pass List<Integer> and returns immutable Set containing same elements.

binarySearch() - if target not found: take negative index of where it would be inserted and subtract 1.

entrySet() returns Set. Set doesn't have getKey().

offerLast(), offer() - insert element at the back of queue. offerFirst() - insert at front.

Diamond operator <> can't be used on the left side of the assignment.

Arrays.compare() looks at each element in turn.

Can't sort immutable List.of(). Arrays.asList() is mutable.

Character can be unboxed and widened to int automatically.

When a different sort order is used for searching and sorting, the result is undefined.

Sorting an empty array is valid.

? not allowed when specifying constraint on a class.

TreeSet doesn't allow null values because it needs to compare the values.

Numbers sort before letters, uppercase before lowercase.

size() on ArrayList. length() on String, StringBuilder.

Regardless whether class or interface, extends for generics.

ArrayList expands when full. Array doesn't.

forEach() that takes one parameter is on Collection interface. Map needs two parameters.

Arrays are indexed using numbers, not strings.

Generic type can't be assigned to another direct type unless you are using upper or lower bounds in that statement.

size() is available on Collection and all classes that extend/implement it.

addFirst() and addLast() are on Deque interface.

Producer Extends Consumer Super (PECS).
