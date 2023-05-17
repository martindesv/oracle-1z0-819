## Java Platform Module System

module-info.java file is used to declare a module.

Service locator contains a load() method.

Service locator and Service Provider Interface are part of a service. A service comprises the interface, any classes the interface references, and a way to lookup implementations of the interface.

Named module is on the module path and contains module-info.

Automatic module is on the module path and does not contain module-info.

Types of modules: automatic, named, unnamed.

Unnamed module must be on classpath.

It is permitted, bot not recommended, to add the --add-exports option to java command. There is no equivalent for requires.

Access modifiers not permitted in module declarations.

--list-modules. List all modules that come with JDK.

All parts of a modules service must point to SPI. Nothing has a direct dependency on service provider.

Consumer depends on SPI and service locator, but not provider. Locator references SPI directly and provider indirectly.

ServiceLoader class has a load() method that returns a Collection of Provider.

requires directive references a module name rather than a package. exports directive references a package name rather than a module.

javac: -d specifier directory. -p specifies module path.

Supplied with JDK: java.base, java.desktop, java.sql

Top-down migration: move all modules to module path as automatic modules. Change each module from automatic to a named module.

Consumer has two dependencies. It requires both SPI and locator.

jdeps lists info about dependencies within a module. -s provides a summary, rather than verbose output.

Provider requires the interface. It provides the implementation.

Running a module: module name is before the slash, and full class name after slash.

java --module-path mods -module com.bird/com.bird.tweet.Tweety

Locator uses interface. It requires SPI module. It exports the package with the locator.

Locator and interface need to have exports statement. Provider needs a provides directive.

Unnamed module is permitted to have module-info, but the file will be ignored.

Keywords: exports, requires, transitive, provides, opens, uses.

SPI exposes the interface without depending on other options.

Supplied by JDK: jdk.javadoc, jdk.jdeps, jdk.net

Modules migrate before the modules that depend on them in a bottom-up migration.

ServiceLoader allows you to add functionality without recompiling the application.

Code on classpath can reference code in automatic, named and unnamed modules. Code on module path can reference code in automatic and named modules, but not unnamed modules.

Provider is not part of the service.

jdeps -jdkinternals cookie.jar // lists suggestions for classes in jdk.unsupported

Locator:  
ServiceLoader<Mouse> loader = ServiceLoader.load(Mouse.class)

Changing SPI sometimes requires recompiling provider. If SPI references other classes in the method signatures, they are considered part of the service.

Consumer needs to depend on shared module. Provider should not know about the consumer.

Without flags, jdeps lists packages and module dependencies. -s flag provides summary omitting the package name.

Info for debugging modules:  
java -m x -p y -show-module-resolution  
-m and -p are on java command
