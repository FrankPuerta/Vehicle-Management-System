# Vehicle Management System

## Description

The Vehicle Management System is a Java program that models cars and motorcycles, allowing users to start, stop, display details, and compare vehicles by fuel efficiency. It uses OOP principles, including inheritance, interfaces, and sorting for efficient vehicle management.

## Features 
* Create and manage cars and motorcycles.
* Start and stop vehicles with simple commands.
* Display vehicle details, including fuel efficiency and max speed.
* Sort vehicles by fuel efficiency (higher MPG first).
* Uses interfaces and inheritance for flexibility.

## How to Use

1. Run the program, and it will create sample vehicles:
    * Toyota Camry (Car, 30 MPG)
    * Ducati Monster (Motorcycle, 40 MPG)

2. The program will:
    *Start both vehicles
    * Display their details
    * Stop both vehicles
    * Sort them by fuel efficiency (higher MPG first)
    * Modify VehicleTest.java to add more vehicles
    * Recompile and run to see the updated list.

## Project Structure 
* Vehicle.java → Interface defining vehicle behaviors.
* Transport.java → Abstract class for vehicles, storing max speed.
* Car.java → Implements Vehicle, extends Transport, represents a car.
* Motorcycle.java → Implements Vehicle, extends Transport, represents a motorcycle.
* VehicleTest.java → Main program that creates, tests, and sorts vehicles.
