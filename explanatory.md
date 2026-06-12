# Beginner Explanatory Guide: Java Basics Exercise

> **Task Type**: Service Task  
> **Domain/Focus**: Java Fundamentals

---

## 1. The Goal (In-Depth Beginner Explanation)

### The Core Problem
The goal of this exercise is to introduce you to the fundamental concepts of Java programming, focusing on variables, types, and collections. Java is a strongly-typed, object-oriented language, which means that every variable must have a defined type, and all code must reside within classes. This strict structure helps prevent errors and makes the code easier to understand and maintain. 

Currently, the `Starter.java` file contains several sections marked with TODO comments where you need to implement specific methods. For instance, you are required to create a method that formats a string to introduce a person by their name and age. This is important because it helps you practice string manipulation and understand how to work with method parameters and return values in Java.

By completing this exercise, you will gain a foundational understanding of how to declare variables, use different data types, and manipulate collections like `ArrayList` and `HashMap`. This knowledge is crucial for building more complex applications in Java and will serve as a stepping stone for future exercises.

### Jargon Buster (Key Terms Explained)
* **Variable**: A variable is a named storage location in memory that holds a value. In Java, you must declare the type of the variable when you create it. For example, `int age = 30;` declares a variable named `age` that can hold integer values.

* **Data Type**: A data type defines the kind of data a variable can hold. Java has several built-in data types, including `int` for integers, `double` for decimal numbers, `String` for text, and `boolean` for true/false values. For example, `String name = "Alice";` declares a variable `name` that holds a string.

* **Method**: A method is a block of code that performs a specific task. Methods can take inputs (parameters) and return outputs. For example, the method `public static String exampleGreet(String name)` takes a string parameter `name` and returns a greeting message.

* **Collection**: A collection is a data structure that holds multiple values. In Java, common collections include `ArrayList` (which is like a dynamic array) and `HashMap` (which stores key-value pairs). For example, `List<String> names = new ArrayList<>();` creates a list that can hold strings.

### Expected Outcome
After implementing the required methods in `Starter.java`, the program should correctly format and return strings based on the inputs provided. For example, if you call `introduce("Alice", 20)`, the expected output should be `"My name is Alice and I am 20 years old."` Before your changes, the method would return `null`, indicating that it was not yet implemented. After your changes, it should return the correctly formatted string, demonstrating that you have successfully applied your understanding of Java syntax and logic.

---

## 2. Related Coding Concepts & Syntax (50% Theory, 50% Practice)

### Concept 1: Variables and Data Types
#### 📘 Theoretical Overview (50%)
Variables are fundamental to programming as they allow you to store and manipulate data. In Java, every variable must have a type, which determines what kind of data it can hold. This strict typing helps catch errors at compile time, making your code safer and more predictable. If you try to assign a value of the wrong type to a variable, the Java compiler will throw an error, preventing the program from running until the issue is resolved.

Java supports several primitive data types, including:
- `int`: for whole numbers (e.g., `int count = 5;`)
- `double`: for decimal numbers (e.g., `double price = 19.99;`)
- `boolean`: for true/false values (e.g., `boolean isActive = true;`)
- `char`: for single characters (e.g., `char initial = 'A';`)

#### 💻 Syntax & Practical Examples (50%)
* **Language Syntax**:
  ```java
  // Declaring variables with different data types
  int age = 25; // Integer variable
  double height = 5.9; // Double variable
  String name = "Alice"; // String variable
  boolean isStudent = true; // Boolean variable
  ```

* **Real-World Application**:
  ```java
  public class Person {
      String name;
      int age;

      public Person(String name, int age) {
          this.name = name; // Assigning the name parameter to the instance variable
          this.age = age; // Assigning the age parameter to the instance variable
      }

      public String introduce() {
          return "My name is " + name + " and I am " + age + " years old.";
      }
  }
  ```

---

## 3. Step-by-Step Logic & Walkthrough

1. **Step 1: Locate and Analyze the Target File**
   * Open the `s-w00a-exercise-3` folder and locate the `Starter.java` file. This file contains the methods you need to implement.
   * Focus on the `introduce` method, which is currently returning `null`. This is where you will write your code.

2. **Step 2: Input Verification & Validation**
   * Before implementing the method, consider what inputs it will receive. The method takes a `String` for the name and an `int` for the age. Ensure that the name is not null or empty, and the age is a positive integer.

3. **Step 3: Core Implementation / Modification**
   * Implement the `introduce` method by using string concatenation to format the output. You can use the `+` operator to combine strings. For example:
     ```java
     public static String introduce(String name, int age) {
         return "My name is " + name + " and I am " + age + " years old.";
     }
     ```

4. **Step 4: Output Verification & Testing**
   * After implementing the method, compile and run the program using the command:
     ```bash
     javac Starter.java && java Starter
     ```
   * Check the output to ensure that the method works correctly and returns the expected formatted string.

---

## 4. Detailed Walkthrough of Test Cases

### Test Case 1: Standard / Success Case
* **Description**: This test checks if the `introduce` method correctly formats a string with valid inputs.
* **Inputs**:
  ```json
  {
      "name": "Alice",
      "age": 20
  }
  ```
* **Step-by-Step Execution Trace**:
  1. The method `introduce("Alice", 20)` is called.
  2. The method concatenates the strings and variables: `"My name is " + "Alice" + " and I am " + 20 + " years old."`
  3. The final string `"My name is Alice and I am 20 years old."` is returned.
* **Expected Output**: `"My name is Alice and I am 20 years old."`

### Test Case 2: Edge Case / Validation Fail
* **Description**: This test checks how the method handles an empty name input.
* **Inputs**:
  ```json
  {
      "name": "",
      "age": 20
  }
  ```
* **Step-by-Step Execution Trace**:
  1. The method `introduce("", 20)` is called.
  2. The method concatenates the strings: `"My name is " + "" + " and I am " + 20 + " years old."`
  3. The final string `"My name is  and I am 20 years old."` is returned, which is not ideal.
* **Expected Output**: Ideally, the method should handle this case better, perhaps by checking if the name is empty and returning a different message or throwing an error.