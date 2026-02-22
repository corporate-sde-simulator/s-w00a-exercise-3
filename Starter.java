/*
=============================================================================
  EXERCISE 5: JAVA BASICS
=============================================================================
  Java is a strongly-typed, object-oriented language.
  Everything lives inside a class. This file teaches you the basics.

  HOW TO USE:
  1. Read each section — examples show you the pattern
  2. Fill in the TODO sections
  3. Compile and run: javac Starter.java && java Starter

  The main() method at the bottom runs all tests automatically.
=============================================================================
*/

import java.util.*;

public class Starter {

    // ========================================================================
    // PART 1: VARIABLES & TYPES
    // ========================================================================
    //
    // Java has strict types — you must declare the type of every variable:
    // String name = "Alice"; ← text (capital S!)
    // int count = 42; ← whole number
    // double price = 19.99; ← decimal
    // boolean isActive = true; ← true/false
    // int[] numbers = {1, 2, 3}; ← array (fixed size!)
    //
    // IMPORTANT! Strings use .equals() for comparison, NOT ==
    // "hello".equals("hello") → true ✅
    // "hello" == "hello" → SOMETIMES wrong! ❌
    //
    // EXAMPLE:
    public static String exampleGreet(String name) {
        return "Hello, " + name + "!";
        // exampleGreet("Alice") → "Hello, Alice!"
    }

    // TODO 1: Write a method that takes a name and age, returns a formatted string
    // EXAMPLE: introduce("Alice", 20) → "My name is Alice and I am 20 years old."
    // HINT: Use string concatenation with + or String.format()
    public static String introduce(String name, int age) {
        // Write your code below this line
        return null;
    }

    // ========================================================================
    // PART 2: COLLECTIONS (ArrayList and HashMap)
    // ========================================================================
    //
    // Java has two important collection types:
    //
    // ArrayList (like Python's list):
    // List<String> names = new ArrayList<>();
    // names.add("Alice"); // Add
    // names.get(0); // Access: "Alice"
    // names.size(); // Length: 1
    // names.remove(0); // Remove by index
    // names.contains("Alice"); // Check: true
    // for (String n : names) { ... } // Loop (enhanced for)
    //
    // HashMap (like Python's dict):
    // Map<String, Integer> ages = new HashMap<>();
    // ages.put("Alice", 25); // Add
    // ages.get("Alice"); // Access: 25
    // ages.getOrDefault("Bob", 0); // Access with default: 0
    // ages.containsKey("Alice"); // Check: true
    // ages.size(); // Count: 1
    //
    // EXAMPLE:
    public static List<Integer> exampleDoubleAll(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int num : numbers) {
            result.add(num * 2);
        }
        return result;
        // exampleDoubleAll([1, 2, 3]) → [2, 4, 6]
    }

    // TODO 2: Write a method that filters a list of numbers, keeping only positives
    // EXAMPLE: filterPositive([3, -1, 4, -5, 0, 2]) → [3, 4, 2]
    public static List<Integer> filterPositive(List<Integer> numbers) {
        // Write your code below this line
        return null;
    }

    // TODO 3: Write a method that counts character frequency in a string
    // Return a Map where keys are characters and values are counts
    // EXAMPLE: charCount("hello") → {h=1, e=1, l=2, o=1}
    // HINT: Use string.toCharArray() to loop through characters
    // Use map.getOrDefault(key, 0) for safe access
    public static Map<Character, Integer> charCount(String text) {
        // Write your code below this line
        return null;
    }

    // ========================================================================
    // PART 3: CLASSES (Inner Class Example)
    // ========================================================================
    //
    // Java classes have:
    // - Fields (variables inside the class)
    // - Constructor (special method that runs when you create an object)
    // - Methods (functions inside the class)
    // - Access modifiers: public (anyone), private (only this class)
    //
    // EXAMPLE:
    // (Using static inner class so it fits in this file)
    static class ExampleProduct {
        private String name;
        private double price;

        public ExampleProduct(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return name + " ($" + String.format("%.2f", price) + ")";
        }
    }

    // TODO 4: Create a Student class (static inner class)
    //
    // Fields: name (String), grades (List<Integer>)
    //
    // Constructor: Student(String name)
    // - Set this.name = name
    // - Initialize grades as empty ArrayList
    //
    // Methods:
    // addGrade(int grade) → void: add grade to the list
    // getAverage() → double: return average of all grades (0.0 if no grades)
    // getHighest() → int: return the highest grade (0 if no grades)
    // getName() → String: return the name
    //
    // EXAMPLE:
    // Student s = new Student("Alice");
    // s.addGrade(85);
    // s.addGrade(92);
    // s.getAverage() → 88.5
    // s.getHighest() → 92
    static class Student {
        private String name;
        private List<Integer> grades;

        public Student(String name) {
            // TODO: Initialize name and grades
            this.name = null;
            this.grades = null;
        }

        public void addGrade(int grade) {
            // TODO: Add grade to the list
        }

        public double getAverage() {
            // TODO: Calculate and return average
            return 0.0;
        }

        public int getHighest() {
            // TODO: Find and return highest grade
            return 0;
        }

        public String getName() {
            return name;
        }
    }

    // ========================================================================
    // PART 4: ERROR HANDLING
    // ========================================================================
    //
    // Java uses try/catch (like JavaScript):
    // try {
    // int result = Integer.parseInt("hello");
    // } catch (NumberFormatException e) {
    // System.out.println("Not a number: " + e.getMessage());
    // }
    //
    // Common exceptions:
    // NullPointerException → calling method on null
    // NumberFormatException → Integer.parseInt("abc")
    // IndexOutOfBoundsException → list.get(999)
    // IllegalArgumentException → bad parameter value

    // TODO 5: Write a method that safely parses a string to integer
    // If the string is a valid number, return it
    // If not, return the defaultValue
    // EXAMPLE: safeParseInt("42", 0) → 42
    // EXAMPLE: safeParseInt("hello", -1) → -1
    // HINT: Use try/catch with Integer.parseInt()
    public static int safeParseInt(String text, int defaultValue) {
        // Write your code below this line
        return 0;
    }

    // ========================================================================
    // PART 5: STRING MANIPULATION
    // ========================================================================
    //
    // Useful String methods:
    // str.length() → length
    // str.charAt(0) → first character
    // str.substring(1, 4) → characters 1-3
    // str.toUpperCase() → "HELLO"
    // str.toLowerCase() → "hello"
    // str.trim() → remove whitespace from ends
    // str.split(",") → split into String[]
    // str.contains("sub") → true if contains substring
    // str.replace("a", "b") → replace all 'a' with 'b'
    // String.join(", ", list) → join list with separator

    // TODO 6: Write a method that converts "hello world" → "Hello World"
    // (Capitalize the first letter of each word)
    // EXAMPLE: titleCase("hello world") → "Hello World"
    // EXAMPLE: titleCase("java is fun") → "Java Is Fun"
    // HINT: Split by " ", capitalize first char of each, rejoin
    public static String titleCase(String text) {
        // Write your code below this line
        return null;
    }

    // ========================================================================
    // TESTS — Don't modify below this line!
    // ========================================================================
    public static void main(String[] args) {
        int passed = 0, failed = 0;

        // Test 1: introduce
        System.out.println("\n📦 Part 1: Variables & Types");
        if ("My name is Alice and I am 20 years old.".equals(introduce("Alice", 20))) {
            System.out.println("  ✅ introduce basic");
            passed++;
        } else {
            System.out.println("  ❌ introduce basic — got: " + introduce("Alice", 20));
            failed++;
        }

        // Test 2: filterPositive
        System.out.println("\n📋 Part 2: Collections");
        List<Integer> pos = filterPositive(Arrays.asList(3, -1, 4, -5, 0, 2));
        if (pos != null && pos.equals(Arrays.asList(3, 4, 2))) {
            System.out.println("  ✅ filterPositive");
            passed++;
        } else {
            System.out.println("  ❌ filterPositive — got: " + pos);
            failed++;
        }

        // Test 3: charCount
        Map<Character, Integer> cc = charCount("hello");
        if (cc != null && cc.get('l') != null && cc.get('l') == 2 && cc.get('h') == 1) {
            System.out.println("  ✅ charCount");
            passed++;
        } else {
            System.out.println("  ❌ charCount — got: " + cc);
            failed++;
        }

        // Test 4: Student
        System.out.println("\n🏗️  Part 3: Classes");
        Student s = new Student("Alice");
        s.addGrade(85);
        s.addGrade(92);
        s.addGrade(78);
        if (s.getName() != null && s.getName().equals("Alice")) {
            System.out.println("  ✅ Student getName");
            passed++;
        } else {
            System.out.println("  ❌ Student getName");
            failed++;
        }
        if (Math.abs(s.getAverage() - 85.0) < 0.01) {
            System.out.println("  ✅ Student getAverage");
            passed++;
        } else {
            System.out.println("  ❌ Student getAverage — got: " + s.getAverage());
            failed++;
        }
        if (s.getHighest() == 92) {
            System.out.println("  ✅ Student getHighest");
            passed++;
        } else {
            System.out.println("  ❌ Student getHighest — got: " + s.getHighest());
            failed++;
        }

        // Test 5: safeParseInt
        System.out.println("\n⚠️  Part 4: Error Handling");
        if (safeParseInt("42", 0) == 42) {
            System.out.println("  ✅ safeParseInt valid");
            passed++;
        } else {
            System.out.println("  ❌ safeParseInt valid");
            failed++;
        }
        if (safeParseInt("hello", -1) == -1) {
            System.out.println("  ✅ safeParseInt invalid");
            passed++;
        } else {
            System.out.println("  ❌ safeParseInt invalid");
            failed++;
        }

        // Test 6: titleCase
        System.out.println("\n📝 Part 5: Strings");
        if ("Hello World".equals(titleCase("hello world"))) {
            System.out.println("  ✅ titleCase basic");
            passed++;
        } else {
            System.out.println("  ❌ titleCase basic — got: " + titleCase("hello world"));
            failed++;
        }
        if ("Java Is Fun".equals(titleCase("java is fun"))) {
            System.out.println("  ✅ titleCase multiple words");
            passed++;
        } else {
            System.out.println("  ❌ titleCase multiple words — got: " + titleCase("java is fun"));
            failed++;
        }

        // Summary
        int total = passed + failed;
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Results: " + passed + "/" + total + " tests passed");
        if (failed > 0)
            System.out.println("❌ " + failed + " tests failed");
        else
            System.out.println("🎉 All tests passed! Java basics mastered!");
        System.out.println("=".repeat(50));
    }
}
