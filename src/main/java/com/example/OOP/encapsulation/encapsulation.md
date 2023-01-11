# Encapsulation

# What is it?

  - Encapsulation is a mechanism of wrapping/hiding data (variables) and code acting on the data (methods) together as a single unit.
  - It is also known as data/information hiding - i.e. creating private variables and accessing them via public methods. 
  - In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the class methods.

# Examples

  - When you look at a car you can only access elements that the designer wants, i.e. it is very difficult to go in and change how parts of the engine 
    operate. This is because the engine is encapsulated within the car.
  - E.g. In a Java application you would not be able to access the inner workings of the spark plug, valve classes - they are encapsulated in the Engine object.

# Why use it?

  - Prevents other classes from unnecessarily accessing and changing fields and methods of a class.
  - The fields of a class can be made read-only (only getters) or write-only (only setters) to model expected behaviour.
  - Setters allow extra validation to be added to an object before the value is set.
  - If validation is added in the setter, it is added in one place - rather than adding it everywhere the setter is called.

# Best Practices / Considerations

  - Only add getters and setters for those fields that need them (IDE will generate these for you). i.e. Don't expose more than you need.
  - Add validation in setters if possible - i.e. if a price cannot be above £100 - add this logic in the price setter.

# Useful Links

  - https://stackoverflow.com/questions/1568091/why-use-getters-and-setters-accessors
  - https://stackoverflow.com/questions/12072980/encapsulation-vs-abstraction-real-world-example
  - https://www.programiz.com/java-programming/encapsulation

# Code Examples

  - Please see the code in this package and run the main class of the package to see an example of encapsulation in java.
    Note how the amount field of the `Bid` object is private, it can only be accessed using public getters and setters. Also note
    the validation is encapsulated within the setter method rather than needing to be added in the runner class. 

# Exercise

  - Model the following requirement making use of encapsulation:

  - Create an `Employee` class with the following fields: Id, Name, Department, Salary.
  - All fields apart from Salary should be able to set/retrieved from other classes/objects.
  - Salary can only be set when the `Employee` is created, it cannot be reset and also cannot be retrieved as it is confidential.

