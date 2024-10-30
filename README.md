# Java Person Info Project

This Java project demonstrates the use of interfaces and classes to manage basic information about `Student` and `Employee` objects. It includes methods to retrieve details about each type of person and calculate years remaining until retirement for employees.

## Project Structure

- **Person Interface**: An interface that defines the `getInfo()` method, which each class implementing this interface must define.
- **Student Class**: Implements the `Person` interface with attributes `id`, `name`, `surname`, and `age`. The `getInfo()` method displays the student details.
- **Employee Class**: Also implements the `Person` interface with attributes `name`, `surname`, `age`, and a constant `RETIREMENT_AGE`. The `getInfo()` method displays the employee's details and calculates the years remaining until retirement.

### Files

- **src/**
    - `Person.java`: Defines the `Person` interface.
    - `Student.java`: Implements the `Person` interface and defines the `Student` class.
    - `Employee.java`: Implements the `Person` interface and defines the `Employee` class.
    - `Main.java`: Contains the main method, where multiple `Student` and `Employee` objects are created, added to lists, and their information is displayed.

## Features

1. **Person Interface**: A standard method `getInfo()` that both `Student` and `Employee` classes implement.
2. **Student Class**:
    - Stores `id`, `name`, `surname`, and `age` of a student.
    - Implements the `getInfo()` method to display student details.
3. **Employee Class**:
    - Stores `name`, `surname`, `age` and has a constant `RETIREMENT_AGE` of 62.
    - Implements the `getInfo()` method to display employee details and calculates remaining years to retirement.
4. **Main Class**: Creates lists of `Student` and `Employee` objects and displays each one’s details by calling `getInfo()`.


### Prerequisites

- Java Development Kit (JDK) 8 or higher
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (or another Java IDE)
- [Git](https://git-scm.com/) (for version control)
