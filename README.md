# WHAT IS JAVA?
Java is a high-level, object-oriented programming language that was originally developed by sun microsystems and is now owned by oracle corporation.

# WHY JAVA IS HIGH-LEVEL PROGRAMMING LANGUAGE?
### i) Abstraction from hardware
. Java does not require programmers to manage memory manually or deal with hardware specific instructions.
. it provides JVM that acts as a bridge between code and hardware.

### ii) Platform Independence (WORA)
. java code is compiled into bytecode which is not tied to any hardware or OS.
. this is executed by JVM making it cross-platform.

### iii) Advanced features 
. Java supports Object-oriented programming (OOP) which improves code organization and reusability.
. it provides automatic garbage collection to handle memory efficiently.

### iv) Ease of use 
. java has a clear, readable syntax making it easier to learn and write.
. Strong error checking at time of compilation as well as runtime.


# WHY JAVA IS AN OBJECT ORIENTED PROGRAMMING LANGUAGE?
i) it uses classes as containers to keep the variables and methods together

ii) it uses objects to implement the properties defined in a class.

iii) Data and methods are bundled together restricting the direct access to some components.

iv) code can be reused as new classes can inherit some methods and properties from existing classes.

v) methods can perform different tasks based on the object allowing one type of method to handle multiple implementations.

vi) complex details are hidden from the user and only necessary details are shown to user.


# HISTORY OF JAVA
. java was developed in mid 1990's 

. by sun microsystems by james gosling. 

. it was previously named as oak 

. but its named changed to avoid trademark issue with oak technologies 

. and later it was named java based on a type of coffee.

it was first implementd in 1991 in a project known as the green project.

# Evolution of java over the years
### Java 1.1
inner class, JDBC, Java Beans.

### Java 2
Swing Graphical API, collection framework.

### Java 5
generics, annotations, enumerated types, enhanced for-loop.

### Java 6
performance, Web service enhance, scripting lang support.

### Java 7
try-with-resources statement, diamond operator, improved support for dynamic languages.

### Java 8 (LTS) 
Lambda Expression, Stream API, date & time API.

### Java 9
Java program module System (project jigsaw) which improved scalability and performance.

### Java 10 and beyond
more rapid releases with new versions every six months.

### Long-term support
versions are 8, 11, 17, 21.

# KEY FEATURES OF JAVA

### i) Architecture-neutral (WORA)  
Java applications run on any OS without modification because its code is converted into bytecode which is architecture independent as it needs JVM only to run on any OS.

### ii) Automatic Garbage Collection
Java automatically manages memory by freeing up unused objects. it does so by checking the reachability of an object. no pointer required.

### iii) Rich in Libraries
Java provides built-in libraries for creating graphical user interfaces like Swing, JavaFx which simplify UI development.

### iv) Object Oriented Programming
Java follows OOP paradigm which organises the programs using objects and classes. it also increases code reusability by inheritance. Protects data using Encapsulation. simplifies the complex logic by hiding implementation details using Abstraction. Allows flexible and scalable code using polymorphism.

### v) Secure
No need of pointers so it prevents memory corruption. Bytecode verification in JVM ensure safe execution. APIs for authentication and encryption.

### vi) Robust
Java is designed to handle unexpected errors and prevent memory leaks using automatic garbage collection, exception handling, Strong-type checking reduces errors during compile time.

### vii )Multi-threaded
Java allows multiple lightweight processes to execute concurrently for better performance. it increases CPU utilization.

# COMPONENTS OF JAVA

## JDK (needed by developers)
JDK is a software development kit required to develop, compile and run java applpications. it includes JRE and other development tools like javac, jdb, Javadoc, jar.

## JRE (needed by end-users to run java)
JRE is package that provides everything needed to run java applications but it does not include development tools like javac. It includes JVM, core libraries (java.lang, java.util, java.io).

## JVM
JVM is a component that executes java bytecode, it acts as a bridge between the compiled java code and underlying OS.
it contains class loader, bytecode verifier, JIT compiler, garbage collector.

# How JVM works?
It loads the class in memory using class loader.

Bytecode Verifier checks for security and correctness.

JIT compiler converts bytecode into machine code.

Execution enginer executes the machine code.

Garbage collector remove unused objects to increase performance.

# JIT (just-in-time compiler)
It converts bytecode into native machine language to execute the code.

It also compiles a method once and reuses the compiled version.

# HIGH LEVEL LANGUAGE
. High level of Abstraction from machine hardware.

. easy to read and write.

. Automatic garbage collection

. platform independent

. compiled/interpreted into machine code via compiler/interpreter

. Execution speed is genrally slower due to high abstraction.

# LOW LEVEL LANGUAGE
. close to hardware and minimal abstraction.

. harder to read and write.

. manual memory management using pointers.

. platform dependent.

.  Directly translated into machine code or written in machine code itself.

.  Execution speed is faster as it is closer to machine code.


# COMPILER 
. Translates java source code into byte code.

. it is used during compile-time.

. it work on java source code and give bytecode as output.

. catches and reports syntax before execution.

. Converts entire source code into bytecode at once.


# INTERPRETER
. Executes bytecode line by line at runtime.

. it is used during run-time.

. it work on compiled bytecode and convert in machine specific code.

. handles runtime errors like exceptions.

. executes byte code line by line.


 #   public static void main(String[] args)
     public static void main(String[] args)
. public is a keyword and access modifier that allows the method to be accessible from anywhere

. static is a keyword that tells that the method belongs to the class and not the objects of the class

. void is a keyword that tells us the return type of a method

. String[] args is the parameter for the main program, it is an array of strings that stores command line arguments.


# System.out.print("hello");
    System.out.print("hello");
. System is a predefined class that provides access to the system.

. out is the static member of the system class representing output stream.

. print is a method of printStream class that prints the text in console.


# DATA TYPES
It specifies the kind of data that a variable can hold. it is used to store and manipulate the data. there are two types of data types:

# 1. Primitive Data Types: 
. these data types are predefined by the language and represent single values.

. they have fixed size and range

. they hold the actual values not the references

. they do not have any methods or properties


## i) byte

8-bit

-128 to 127

saving space in large arrays.


## ii) short

16-bit

-32768 to 32767

saving memory in large arrays.


## iii) int

32-bit

-2^31 to 2^31 -1

default data type for integer values


## iv) long

64-bit

-2^63 to 2^63 -1

used for large integer values where int is insufficient


## v) float

32-bit

floating point calculations with less precision


## vi) double

64-bit

more precise floating point calculations




## vii) char

16-bit

0 to 65535

store single characters


## viii) Boolean

1-bit

true or false

logical values



# 2. NON-PRIMITIVE data types (referencing):
. these data types refer to the objects and can store references to data.

. the size can vary depending on the object or array.

. they store references to objects rather than the data itself.

. they can have methods and properties.


## i) String

. it is an object and it has properties like length(), touppercase().


## ii) Arrays

. these are objects in java and have a property .length but no methods.


## iii) classes (custom objects)

. objects in classes have a class type and they have methods or properties.

example: Car myCar= new Car("tesla");

here Car is a class (user defined data type) and myCar (non-primitive data types) have properties like brand and methods like display.


## iv) Interfaces

. these are just like classes but they do not implement method inside them, classes implement these methods by taking reference from them.


     interface Vehicle {
            void start(); // Abstract method
    }

    class Car implements Vehicle {
            public void start() {
            System.out.println("Car is starting...");
        }
    }

    public class Main {
        public static void main(String[] args) {
            Vehicle myCar = new Car(); // Interface reference, object of Car
            myCar.start(); // Output -> Car is starting...
        }
    }

## v) Enumerations
. enums are non-primitive data types that are special classes that define a fixed set of data like days of week.

. we can create its object with its reference so it is non-primitive data type.

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public class Main {
        public static void main(String[] args) {
            Day today = Day.WEDNESDAY; //  Enum as non-primitive data type
            System.out.println(today); // Output -> WEDNESDAY
        }
    }



# ACCESS MODIFIERS

in java these control the accessibility and visibility of classes, variables, methods and constructors. 

types of access modifiers
## i) Private
. Accessible only inside the same class.

. no accessible outside the class even in the same package.

. used for encapsulation to hide implementation details.

. classes can be made private but not the parent class or the top-most class.

. methods can be private and no one can access it outside of its class and same is with variables.

. constructors can be made private if we want to make only one object of class (singleton design pattern)

## ii) Public
. Accessible from anywhere(same class, package,different package)

. used for methods constructors and classes that should be globally accessible

## iii) Protected
. Accessible within the same package

. Accessible outside the package only in subclass.

. useful for inheritance based access.(made specially for inheritance)

. can not be applied to top level class.

. methods and variables can be accessed in same package or outside package but within subclasses only.

. a Protected constructor allows to instantiate object in the same package and only in the subclasses.


## iv) Default
. Accessible only withing the same package

. not accessible outside the package even if inherited subclass uses it.

. often used for package level accessibility.

. classes, methods, variables are accessible only in the same package in any class.

. constructor can be used only in the same package.

# WHAT IS A CLASS?
. a class is a container that hold the variables and methods (properties) together.

. it tells the structure that how something should behave and what data should it contain.

. it acts as a template that allows us to group things under one name.

. it helps in organising code bt keeping methods and data in one place.

# WHAT IS AN OBJECT?
. objects can perform actions defined in the class.

. object allows you to use the class in a practical way.

. you can create multiple objects from the same class with different values.

. without object as class has no importance.
