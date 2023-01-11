# Inheritance 

# What is it?

  - Inheritance is when one class (subclass) inherits the attributes and methods of another class (super-class).
  - A child class can override a parent's behaviour if necessary, as well as adding their own behaviour/properties.
  - Think of inheritance as an "is-a" relationship , i.e. Tiger (sub-class) "is-a" Mammal etc.
  - Note: Java does not support multiple inheritance, I.e. class Child extends Parent1, Parent2 - is not valid.
  - Every class in java technically uses inheritance - as every class has to extend the Object class.

# Examples

- Animal > Mammal > Dog
- AbstractCollection > AbstractList > ArrayList
- Defining a custom exception in your application and subclassing RuntimeException

# Why use it?

  - Provides code re-usability. In place of writing the same code, we can simply inherit the properties of one class in another.
  - Helps to express relationships in easily understandable real world hierarchies.

# Best Practices / Considerations 

  - Have a base/super class as an abstract class that will not be instantiated , but contains a set of common fields / behaviours. 
  - Generally advised to have your abstract class implement an interface to define its behaviours.
  - Constructors are not inherited by subclasses - need to create them explicitly.

# Useful Links

  - https://techstackjournal.com/java-tutorial/inheritance/
  - https://www.codejava.net/java-core/the-java-language/12-rules-and-examples-about-inheritance-in-java
  -  https://stackify.com/java-custom-exceptions/

# Code Examples

   - Please see the code in this package and run the main class of the package to see an example of inheritance in java.
   - The `CustomBusinessException` class is an example of subclassing an existing Java class (`RuntimeException`).

# Exercise 

  - Model the following using inheritance:

  - A music website sells both physical (vinyl, cds etc) and virtual music (mp3 downloads).
  - Create a hierarchy to model this using java - think of what attributes are common across both types and what are unique to each.

