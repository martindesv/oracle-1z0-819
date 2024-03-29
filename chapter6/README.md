## Working with Streams and Lambda expressions

Source -> Intermediate operation -> terminal operation

s -> true is valid.

() not required on left if there is only one variable. {} not required if right side is a single expression. Parameter data types only required if it data type for at least one parameter is specified; otherwise none are required.

UnaryOperator and BiFunction return a generic argument, such as Double. All predicate functions return boolean.

Supplier doesn't take input, Supplier doesn't return data.

Stream operations don't affect the original list.

Terminal operation triggers the pipeline to run.

LongConsumer has accept(). LongSuppler has getAsLong(). LongFunction has apply(). LongPredicate has test().

sequential() - equivalent sequential stream of an existing stream.

parallel() - equivalent parallel stream of an existing stream.

Passing null to of() throws NullPointerException.

Supplier<Double> can return null. DoubleSupplier can't.

anyMatch() returns a boolean. findAny() might not return first element.

String::new is equivalent to () -> new String()

The lambda (s, p) -> s + p takes two generic arguments and returns a value. BiConsumer doesn't return any values. Function takes one argument and returns a value.

Reduction - a terminal operation where a single value is generated by reading each element in the prior step in a stream pipeline.

Atomic numeric instance is thread-safe.

filter() returns zero or one element. flatMap() returns zero or more elements. map() returns exactly one element.

long can be implicitly cast to double.

ToDoubleBiFunction<T, U> takes two generic inputs and returns a double.

Function<Integer, ArrayList> func = (n) -> new ArrayList<>(n);

Function<Integer, ArrayList> func = ArrayList::new;

On a DoubleStream average() and max() return OptionalDouble.

BiPredicate takes two generic arguments and returns a boolean. DoubleUnaryOperator and IntUnaryOperator transform values of types double and int. ToLongFunction takes a generic argument and returns long.

ObjDoubleConsumer, ObjIntConsumer. Object is abbreviated to Obj in java.util.function

Terminal operation generates nonstream result.

groupingBy() always returns a Map.

You can only operate on a stream once.

IntUnaryOperator is not generic.

Requirements for performing a parallel reduction with collect() method, which takes a Collector argument:
* Collector argument is marked concurrent.
* The stream is parallel.
* The stream or Collector is marked unordered.

BiPredicate takes two generic arguments and returns a boolean. LongFunction takes long and returns generic type. Java only includes primitive functional interfaces that operate on double, int, long.

An accumulator in a serial or parallel reduction should be associative and stateless.

Optional class has isPresent() that doesn't take parameters and returns a boolean. There is also ifPresent() that takes Consumer and runs only if Optional is non-empty.

forEach() requires Consumer. DoubleConsumer doesn't inherit from Consumer.

Three-argument reduce() returns a generic type. One-argument reduce() returns Optional.

BiFunction<Double, Double, Double> and BinaryOperator<Double> both take two Double arguments and return Double. DoubleFunction<Double> takes single double and returns Double.

ConcurrentSkipListSet - a thread-safe collection. There is no two-argument version of collect() withing Stream interface.

Method references can't have operators next to it.

Trying to order and infinite stream results in exception.

peek() executes on each member of the pipeline.

Generic types are not strictly required.

Primitive streams like LongStream declare average() that returns OptionalDouble. This object declares getAsDouble(). Summary statistics classes provide getAverage() that returns double.

DoubleConsumer takes one value - long (?). ObjDoubleConsumer takes two values - generic and double, and returns void.

LongSupplier doesn't take values and returns long.

JVM will fall back to a single-threaded process if all conditions and parallel reduction are not met. If stream is not parallel, groupingByConcurrent can still be applied.

Primitives can't be null.

Stream must return object. Specialized interfaces like IntStream are needed to return primitives. Stream has methods such as of(), iterate(), stream() that return a Stream.

It is bad practice to have peek() that has side effects, like modifying a variable.

UnaryOperator<> has apply(), not accept(). Post-decrement operator (--) returns original value of variable.

Function and UnaryOperator use apply().

String::charAt can be assigned to BiFunction<String, Integer, Character>. It can't be assigned to Function.

parallelStream() should be applied to Collection<E>.

BiPredicate<String, String> pred = (a, b) -> a.contains(b);

BiPredicate<String, String> pred = String::contains;

var s1 = IntStream.empty();

s1.average().getAsDouble; // throws NoSuchElementException

Collectors.groupingBy() and Collectors.partitioningBy() can turn a stream into a Map. partitioningBy() groups using a Boolean key.

() -> { return 1/0; } // is compatible with IntSupplier. Will throw exception at runtime.

filter() takes Predicate, which requires boolean return type from the lambda or method reference.

generate(), iterate() sources return infite stream. of() returns finite stream. limit() intermediate operation returns finite stream. When gives infite stream, map() keeps it infinite.

Method reference can't be assigned to var.

Consumer<Object> c1 = ArrayList::new; and Consumer<Object> c1 = ArrayList::new; // Don't compile because ArrayList and String don't contain constructors that take Object.

Consumer<Object> c2 = System.out::println; // Compiles since system.out.println(Object) exists.

partitioningBy returns a map with two keys, true and false. If no matches, value is empty list.

flatMapToInt() requires a Function with a return value of IntStream, not Stream.

s -> s + 1 matches DoubleUnaryOperator which takes double and return double. Matches Function<String, String>. Matches IntToLongFunction, since int can be implicitly cast to long. Doesn't match UnaryOperator, since (+) is not defined on Object. s -> s would match UnaryOperator.

Applying forEachOrdered() to a parallel stream forces the terminal operation to be performed in a single-threaded manner. Intermediate operations can still use parallel processing, since forEachOrdered() is only applied at the end of the pipeline.

IntSummaryStatistics

findFirst() is a terminal operation. ifPresent() is not part of the stream pipeline. It is a method on Optional.

orElseThrow() throws NoSuchElementException when Optional is empty.

| Function name          | Return type | Method name      | Parameters |
|------------------------|-------------|------------------|------------|
| Supplier\<T>           | T           | get()            | 0          |
| Consumer\<T>           | void        | accept(T)        | 1(T)       |
| BiConsumer\<T>         | void        | accept(T, U)     | 2(T, U)    |
| Predicate\<T>          | boolean     | test(T)          | 1(T)       |
| BiPredicate\<T, U>     | boolean     | test(T, U)       | 2(T, U)    |
| Function\<T, R>        | R           | apply(T)         | 1(T)       |
| BiFunction\<T, U, R>   | R           | apply(T, U)      | 2(T, U)    |
| UnaryOperator\<T>      | T           | apply(T)         | 1(T)       |
| BinaryOperator\<T>     | T           | apply(T, T)      | 2(T, T)    |
| DoubleFunction\<R>     | R           | apply(double)    | 1(double)  |
| ToDoubleFunction\<T>   | double      | applyAsDouble(T) | 1(T)       |
| ToIntBiFunction\<T, U> | int         | applyAsInt(T, U) | 2(T, U)    |

To be a parallel reduction, groupByConcurrent() must be used instead of groupingBy().

intValue() can be called on Long.

BooleanSupplier does not involve double, int, or long.

long can't become int without casting. mapToLong() is not available on LongStream.

Stateful lambdas should be avoided on both serial and parallel streams. One way to avoid modifying a List with a stateful lambda is to use a collector that outputs a List.

sorted() takes optional Comparator.

forEach() requires a Consumer.

Comparator returns int, takes two parameters.

IntSummaryStatistics has getCount() that returns long.

anyMatch(), allMatch(), noneMatch() take a Predicate.

final can only be used if type or var is specified.

flatMap() is used to turn a stream of collections into a one-dimensional stream. It doesn't matter if they are different types of Collection.

Predicate passed to removeIf() uses Integer.

IntFunction<Integer> takes int, returns Integer.

Stateful lambdas should be avoided with all streams.

BooleanSupplier and LongSupplier don't have get(). They have getAsBoolean() and getAsLong().

A collector that returns ConcurrentMap requires a BiConsumer in the forEach() method.
