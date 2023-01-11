# Abstraction

# What is it?

  - Abstraction is the concept of describing something in simpler terms - abstracting away the details in order to focus on what is important.
  - An Abstract class is just meant to be a base class for many more specific classes to inherit from.
  - Abstraction can be achieved with either abstract classes or interfaces.
  - Note that interface methods in java are abstract - i.e. their signatures are declared but there is no method body.
  - Important to note that Abstract classes can maintain state with fields/variables - whereas this is not the case with interfaces.

# Examples

- A mobile phone - you just need to know what buttons are to be pressed to send a message or make a call - rest happens "behind the scenes".
- A car - all the controls in a car are abstractions. You don't need to know the engine or brakes work - they just do.
- `car.start()` - you don't need to know what is happening behind the scenes of the `drive()` method. If you call it - the call will start.

# Why use it?

  - Ease of use: a user does don't need to know how your application works to use it - the details are hid from them.
  - Improved security: vulnerabilities are harder to find if details are not exposed.
  - Reduced coupling: changes to one component are less likely to impact other components.

# Best Practices / Considerations

  - An abstract class is used if you want to provide a common, implemented functionality among all the implementations of the component.
  - For example: All animals breathe so that could be a method in your abstract base class that will be common to all animals in the hierarchy.

# Useful Links

  - https://stackoverflow.com/questions/7284636/abstraction-in-java
  - https://www.quickstart.com/blog/when-and-how-to-use-abstract-class-and-interface

# Code Examples

  - Please see the code in this package and run the main class of the package to see an example of abstraction in java.
    Note how abstract class `Phone` has a common field (brand) but only has abstract methods - the implementation of these are left to
    the respective subclasses.

# Exercise

 - Model the following requirement making use of abstraction:

  - Our Java application has to connect to two different types of database - Relational and non-relational.
  - The 2 types of relational database are: `MYSQL` and `Oracle`.
  - The 2 types of non-relational database are `Cosmos` and `Dynamo`.
  - We must be able to connect to each database as well as query it.
  - For the sake of simplicity we will be connecting to both types of database using a `connection string`.

    


    
