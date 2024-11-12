SRS Car Selection System
Welcome to the SRS Car Selection System, a simple Java-based application that allows users to explore different car models across various
categories in the SRS automobiles catalog. This project uses Java Swing for a graphical interface, letting users interact with the application via popup dialog boxes.

Project Overview
The SRS Car Selection System is an interactive program where users can:

Select a car category (SUV, Sedan, or OffRoad).
Enter a model number to see detailed information about that specific car.
Decide to look up another model or exit the program.
The system guides users through the selection process and validates inputs to ensure a smooth user experience.

Features
Category and Model Selection: Choose from three main categories and view specific models with their specifications.
Data Validation: Ensures that only valid categories and models are selected, with error messages to prompt correct input.
Repeat Functionality: After viewing a car model, users can choose to look up additional models or exit the program.

Usage
Upon running the application, follow these steps:

Welcome Message: A welcome message appears.
Category Selection: Choose a car category (SUV, Sedan, or OffRoad).
Model Selection: Enter a model number associated with the chosen category.
View Car Details: See car specifications such as model name, horsepower, price, year, and serial number.
Repeat or Exit: Choose to search for more models or exit the program.
Error Handling
If you enter an invalid category, you’ll be prompted to try again.
If the model is not found in the chosen category, you’ll receive a message to enter a valid model.
Technologies Used
Java: Core programming language.
Java Swing: For graphical user interface dialogs (JOptionPane).
Object-Oriented Design: Inheritance is used for different car categories (SUV, Sedan, OffRoad).
