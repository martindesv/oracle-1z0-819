## Exception Handling

throw new Exception();

It is common to catch Exception and RuntimeException. Not recommended to catch Error and Throwable.

Variable declared before a try-with may be used if it is final or eff. final.

Notice braces {} vs parentheses ()

Resources in try-with are separated by semicolons.

Any class that inherits Exception but not RuntimeException is checked and must be handled or declared.

Checked exception must be handled or declared in the method in which finally block is used.

Closeable extends AutoCloseable. close() in AutoCloseable throws Exception. close() in Closeable throws IOException.

Multi-catch uses a single variable.

Checked: Exception, IOException, FileNotFound, SQLException

Unchecked: RuntimeException, IllegalStateException, IllegalArgumentException, UnsupportedOperationException, ArithmeticException, NullPointerException, ClassCastException

5/0 leads to ArithmeticException at Runtime.

Can't use same variable name in multiple catch blocks.

IllegalArgumentException and NullPointerException inherit RuntimeException but neither inherits from each other. They can be listed in catch blocks in either order.

ClassCastException inherits from RuntimeException, not IllegalArgumentException.
