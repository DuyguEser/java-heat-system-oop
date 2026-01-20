# java-heat-system-oop

Java Heat System OOP

This is a simple Java project demonstrating Object-Oriented Programming (OOP) concepts such as abstract classes, interfaces, inheritance, and polymorphism. The project models different types of houses and their heating systems.

Project Structure
java-heat-system-oop
 ├── House.java         // Abstract class representing a house
 ├── HeatSystem.java    // Interface for heating systems
 ├── Apartment.java     // Apartment class implementing House and HeatSystem
 ├── Villa.java         // Villa class implementing House and HeatSystem
 └── TestHouse.java     // Main class to test houses and their heating systems


Note: Apartman.java is renamed to Apartment.java for consistent English naming.

Classes and Interfaces

House (abstract class)
Represents a general house. Contains area and roomCount attributes and an abstract method usageType() to describe the type of house.

HeatSystem (interface)
Declares the method heat() for implementing different heating systems.

Apartment (class)
Inherits from House and implements HeatSystem. Uses a boiler heating system.

Villa (class)
Inherits from House and implements HeatSystem. Uses underfloor heating.

TestHouse (class)
Demonstrates polymorphism. Iterates through different houses, displays their information, type, and heating system.

Usage

Run the TestHouse class to see output similar to:

Area: 90 m^2  Rooms: 3
Apartment
Heated with a boiler
------------------
Area: 250 m^2  Rooms: 6
Detached Villa
Heated with underfloor heating
------------------

Key Concepts Demonstrated

Abstract Class: House cannot be instantiated directly; subclasses must implement usageType().

Interface: HeatSystem enforces implementation of heat() for all heating types.

Inheritance: Apartment and Villa extend House.

Polymorphism: TestHouse treats both Apartment and Villa as House objects and calls heat() dynamically using instanceof.
