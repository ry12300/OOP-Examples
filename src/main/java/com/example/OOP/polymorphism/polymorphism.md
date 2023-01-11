# Polymorphism

# What is it?

  - Polymorphism describes situations in which a certain action occurs in different forms.
  - Polymorphism allows classes to perform to different implementations of the same method/function.
  - Interfaces allow us to use polymorphism - by declaring an abstract method signature and letting classes create their own implementations.
  - Can think of an interface as a contract - they tell a class "this is what I will provide you and expect in return. How you do it, I don't care."
  - Interfaces achieve an "Acts-as-a" relationship, compared to an inheritance "Is-a" relationship.
  - There are two different forms of polymorphism: Compile time (method overloading) and run time (method overriding). 

# Examples

  - An Interface called Pest has a method named `beAnnoying()` - this can be implemented by any class that wants to use this behaviour.
    For example a Fly or a cold-calling telemarketer can implement the Pest Interface, they must now each have their own implementation of the `beAnnoying()` method.
  - List (interface) in java is implemented by ArrayList (concrete class) - array list must implement all methods declared in List interface.

# Why use it?

  - Interfaces declare a "contract" for a class - it ensures that they implement the behaviours that the interface declares, gives more predictable behaviour.
  - Re-usability: A method declared in an interface can be re-used by any amount of classes - they just provide their own behaviour.
  - Reduces coupling between concrete classes - i.e. program to the interface not the implementation.

# Best Practices / Considerations
    
  - Program to the interface rather than implementation - this allows us to swap out implementations easily and reduces coupling between concrete classes. 
  - Only create an interface when there will be multiple implementations of it, e.g. OrderService (interface) and OrderServiceImpl is typically a code smell.
  - When you inherit from an abstract class, you're saying that you are a type of the class. You have the same attributes. But when you implement an interface, 
    you're saying that you do the things that that interface does.

# Useful Links

  - https://martinfowler.com/bliki/InterfaceImplementationPair.html
  - https://stackoverflow.com/questions/383947/what-does-it-mean-to-program-to-an-interface
  - https://stackoverflow.com/questions/761194/interface-vs-abstract-class-general-oo
  - https://stackoverflow.com/questions/19998454/when-to-use-java-8-interface-default-method-vs-abstract-method
  - https://www.geeksforgeeks.org/factory-method-design-pattern-in-java/

# Code Examples

  - Please see the code in this package and run the main class of the package to see an example of polymorphism in java.
    Note - the three classes (`building`, `tree` and `waterfall`) are not related or in a hierarchy, but when they implement `Measurable` they
    must each give them own implementation of `getHeight()`.

# Exercise

   - A Java application for an online retailer will contain two different classes: `Item` and `Customer`.
   - An urgent business requirement states that we are archiving certain items and customers within the application.
   - The archive process is different for an item and a customer. Items over one-year old are archived and customers over five-years old are archived.
   - Create the `Item` and `Customer` classes - only required fields are `Id` and `Age`, use polymorphism to ensure each class must implement the archive functionality.


    

