# Java Streams Methods - TDD Approach

## Purpose

This project demonstrates the usage of various Java Streams methods through a Test-Driven Development (TDD) approach. The goal is to provide clear and concise examples of how each stream method works, with corresponding unit tests to validate their functionality.

Java Streams offer a powerful way to process collections of data in a functional style. This project covers a comprehensive set of stream operations, helping you understand how to use them effectively in real-world scenarios.

## Java Streams Methods

Below is a brief explanation of each Java Streams method covered in this project:

### 1. `stream()`
- **Purpose**: Converts a collection into a stream, enabling functional-style operations.

### 2. `filter()`
- **Purpose**: Filters elements based on a given condition (predicate), returning only those that match.

### 3. `map()`
- **Purpose**: Transforms each element of the stream into another form, such as mapping integers to their squares.

### 4. `flatMap()`
- **Purpose**: Flattens a stream of collections into a single stream of elements.

### 5. `forEach()`
- **Purpose**: Performs an action on each element of the stream, typically used for side-effects like printing.

### 6. `collect()`
- **Purpose**: Collects the elements of the stream into a collection (e.g., `List`, `Set`) or other data structures.

### 7. `reduce()`
- **Purpose**: Combines the elements of the stream into a single result, like summing a list of numbers.

### 8. `sorted()`
- **Purpose**: Sorts the elements of the stream in natural order or using a custom comparator.

### 9. `distinct()`
- **Purpose**: Removes duplicate elements from the stream.

### 10. `limit()`
- **Purpose**: Truncates the stream to a specified number of elements.

### 11. `skip()`
- **Purpose**: Skips a specified number of elements from the beginning of the stream.

### 12. `peek()`
- **Purpose**: Allows performing an action on each element as it is processed, useful for debugging.

### 13. `count()`
- **Purpose**: Counts the number of elements in the stream.

### 14. `anyMatch()`
- **Purpose**: Checks if any elements in the stream match a given condition.

### 15. `allMatch()`
- **Purpose**: Checks if all elements in the stream match a given condition.

### 16. `noneMatch()`
- **Purpose**: Checks if no elements in the stream match a given condition.

### 17. `findFirst()`
- **Purpose**: Returns the first element in the stream, if any.

### 18. `findAny()`
- **Purpose**: Returns any element from the stream, useful in parallel processing.

### 19. `max()`
- **Purpose**: Finds the maximum element in the stream according to natural order or a custom comparator.

### 20. `min()`
- **Purpose**: Finds the minimum element in the stream according to natural order or a custom comparator.

### 21. `toArray()`
- **Purpose**: Converts the stream into an array.

### 22. `generate()`
- **Purpose**: Creates an infinite stream of elements generated dynamically, typically using a supplier function.

### 23. `iterate()`
- **Purpose**: Creates an infinite stream of elements generated by iteratively applying a function.

### 24. `of()`
- **Purpose**: Creates a stream from a specified set of values.

### 25. `concat()`
- **Purpose**: Concatenates two streams into a single stream.

## Running the Tests

To run the tests and see the examples in action:

1. Clone this repository.
2. Open the project in your favorite Java IDE (e.g., IntelliJ IDEA).
3. Run the test suite to execute all the test cases, ensuring that each stream method works as expected.

## Conclusion

This project provides a solid foundation for understanding and utilizing Java Streams in everyday coding tasks. Each stream method is demonstrated with practical examples and validated through tests, making it easier to grasp their usage and behavior.
