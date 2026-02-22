# Exercise 5: Java Basics ☕

> **Goal:** Learn Java fundamentals. Java appears in several tasks starting from Week 3.

---

## How This Exercise Works

1. Open `Starter.java`
2. Read each section and fill in the TODO parts
3. Compile and run:
   ```bash
   javac Starter.java && java Starter
   ```
   All tests are built into the main method — it will print ✅ or ❌.

---

## Key Differences from Python/JS

| Python/JS | Java |
|-----------|------|
| No type declarations | Must declare types: `int x = 5;` |
| `list.append(x)` | `list.add(x)` |
| `dict["key"]` | `map.get("key")` / `map.put("key", val)` |
| `len(list)` | `list.size()` |
| `"hello" == "hello"` works | Must use `.equals()` for strings! |
| `print()` | `System.out.println()` |
| No semicolons | Every statement ends with `;` |
| Files can be named anything | File name MUST match public class name |
