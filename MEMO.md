# Dashboard memo and technical requirements

## Ideas
- **Login**
  - User Registration option 
  - User Login option
  - Reset password, email service
  - Login with Google
- **Dashboard**
  - Time, system time
  - Weather, from API
  - Gmail, get emails, from API
  - Youtube, get playlist, from API
  - ToDo list, local DB
  - Notes, local DB


### Inspiration:
https://i.pinimg.com/originals/4f/1e/b4/4f1eb45fda50bc63286acc91f96eaacb.png


### Tech:
- Java 17
- Spring Boot 3.0.1
- Spring JPA
- Maven 4
- JavaScript 
- HTML 5
- CSS 3
- MySQL

## ACCENTURE Tech Requirements 

### Common Requirements
"Unless noted otherwise, all example projects should be console applications that use Maven as a build tool. User interaction isn't required, as long as you can demonstrate the specific mechanism mentioned in the task.

Project name should be based on the folder name. Package name should be similar, but with prefix ""com.accenture.fundamentals"".

### Java Fundamentals
- Create a project that demonstrates the use of both abstract classes and interfaces.
- Create a project that demonstrates how the objects are passed by reference (and can be manipulated by the called functions). 
- Demonstrate that overwriting the variable's reference doesn't overwrite the actual object.

### Java Collections Framework
"Create a project that demonstrates the various JCF interfaces:
* List (LinkedList)
* Queue (LinkedList)
* Set (HashSet)
* Map (HashMap)"
  
- "Create a project that demonstrates the differences between various List implementations - LinkedList and ArrayList.
  Use lists with more than 100,000 randomly generated elements and System.nanotime() to demonstrate the time efficiency differences."

- Create a project that demonstrates the behavioural differences between various Queue implementations - LinkedList and PriorityQueue.
- Create a project that demonstrates the behavioural differences between various Map implementations - HashMap, LinkedHashMap, and TreeMap.
### Java Core: Class 'Object'
- Create a project that demonstrates the differences between shallow and deep cloning.
  Create a project that demonstrates the overriding of the 'equals' method; and using an immutable object as a key in a Map.
###  Java Core: Static
- Create a project that demonstrates how to use static variables, static methods, and static initialization blocks.
###  Java Core: Exceptions
  - Create a project that demonstrates the difference between checked and unchecked exceptions. Utilize both existing Java exception classes and custom exception classes.
  - Create a project that demonstrates the execution flow with 'try-catch', 'try-finally', and 'try-catch-finally' blocks.
###  Java Core: Lambdas
  - Demonstrate use-cases for these stream operations - ‘filter’, ‘map’, ‘min’/’max’, ‘find’/’findFirst’, ‘map’, ‘collect’, ‘ifPresent‘. (In the example code, use both streams of objects and streams of primitives).
###  Java Core: Serialization
  Demonstrate how to save binary data in file, and how to read the data from file to object. Use Java's built in serialization techniques.
###  Java Core: Reflection
  "Create a project that demonstrates the root use cases of reflection:
* Listing all fields of a class and their access modifiers;
* Listing all methods of a class, their parameters and access modifiers;
* Invoking a private method from outside of class;
* Analyzing annotations on class variables."