# Java Enums & Modern Features – Level 1

Educational Java project to explore **enums**, **Java Time API** and **records** through practical exercises.

## Objective

- Master **enums** for type-safe, finite value sets
- Use enums in real scenarios (days of week, priority levels)
- Add methods, logic and error handling to enums
- Prepare for advanced Java features (records, Java Time)

## Exercises Covered (Level 1 – Enums)

1. **Day enum**
    - Values: MONDAY to SUNDAY
    - Method to check if it's a workday or weekend

2. **Level enum**
    - Values: LOW, MEDIUM, HIGH
    - Used in `Task` class
    - Different behavior based on level

3. **Enum with methods**
    - Add custom logic inside enum (e.g. `getColor()` for each level)

4. **String to enum conversion**
    - Use `valueOf()`
    - Handle invalid values safely (`IllegalArgumentException`)

## Project Structure

```text
enums/
├── pom.xml
└── src/
├── main/java/
│   └── Day.java
│   └── Level.java
│   └── Task.java
│   └── Main.java
└── test/java/
│   └── EnumsTest.java    
```
## How to Run

```bash
# Maven
mvn test
```
### Example Output
```text
Is Monday a workday? Yes
Is Saturday a weekend? Yes

Task: Fix bug – Priority: HIGH – Color: RED

Invalid day: SUNDAYZ → IllegalArgumentException caught
```