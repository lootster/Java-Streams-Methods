package com.example.streamdemo;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

    // 1. filter - Filters and returns even numbers from a list.
    public List<Integer> filterEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
    }

    // 2. map - Maps a list of integers to their squares.
    public List<Integer> mapToSquare(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
    }

    // 3. flatMap - Flattens a list of lists into a single list.
    public List<Integer> flatMapToSingleList(List<List<Integer>> listOfLists) {
        return listOfLists.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }

    // 4. forEach - Appends each number in the list to a StringBuilder.
    public void forEachToAppendString(List<Integer> numbers, StringBuilder result) {
        numbers.stream().forEach(result::append);
    }

    // 5. collect - Collects elements of a stream into a List.
    public List<Integer> collectToList(List<Integer> numbers) {
        return numbers.stream().collect(Collectors.toList());
    }

    // 6. collect - Collects elements of a stream into a Set.
    public Set<Integer> collectToSet(List<Integer> numbers) {
        return numbers.stream().collect(Collectors.toSet());
    }

    // 7. reduce - Reduces the list to the sum of its elements.
    public int reduceSum(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, Integer::sum);
    }

    // 8. sorted - Sorts the list of numbers.
    public List<Integer> sortNumbers(List<Integer> numbers) {
        return numbers.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    // 9. distinct - Returns distinct elements from a list.
    public List<Integer> distinctNumbers(List<Integer> numbers) {
        return numbers.stream()
                .distinct()
                .collect(Collectors.toList());
    }

    // 10. limit - Limits the stream to the first N elements.
    public List<Integer> limitNumbers(List<Integer> numbers, int limit) {
        return numbers.stream()
                .limit(limit)
                .collect(Collectors.toList());
    }

    // 11. skip - Skips the first N elements in the stream.
    public List<Integer> skipNumbers(List<Integer> numbers, int skip) {
        return numbers.stream()
                .skip(skip)
                .collect(Collectors.toList());
    }

    // 12. peek - Peeks at elements during stream processing.
    public List<Integer> peekNumbers(List<Integer> numbers, List<Integer> peekedNumbers) {
        return numbers.stream()
                .peek(peekedNumbers::add)
                .collect(Collectors.toList());
    }

    // 13. count - Counts the number of elements in the stream.
    public long countNumbers(List<Integer> numbers) {
        return numbers.stream()
                .count();
    }

    // 14. anyMatch - Checks if any element is greater than a given threshold.
    public boolean anyMatchGreaterThan(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .anyMatch(n -> n > threshold);
    }

    // 15. allMatch - Checks if all elements are even.
    public boolean allMatchEven(List<Integer> numbers) {
        return numbers.stream()
                .allMatch(n -> n % 2 == 0);
    }

    // 16. noneMatch - Checks if no elements are negative.
    public boolean noneMatchNegative(List<Integer> numbers) {
        return numbers.stream()
                .noneMatch(n -> n < 0);
    }

    // 17. findFirst - Finds the first element in the stream.
    public Optional<Integer> findFirst(List<Integer> numbers) {
        return numbers.stream()
                .findFirst();
    }

    // 18. findAny - Finds any element in the stream.
    public Optional<Integer> findAny(List<Integer> numbers) {
        return numbers.stream()
                .findAny();
    }

    // 19. max - Finds the maximum element.
    public Optional<Integer> findMax(List<Integer> numbers) {
        return numbers.stream()
                .max(Integer::compareTo);
    }

    // 20. min - Finds the minimum element.
    public Optional<Integer> findMin(List<Integer> numbers) {
        return numbers.stream()
                .min(Integer::compareTo);
    }

    // 21. toArray - Converts the stream to an array.
    public Integer[] toArray(List<Integer> numbers) {
        return numbers.stream()
                .toArray(Integer[]::new);
    }

    // 22. generate - Generates a list of random numbers.
    public List<Integer> generateRandomNumbers(int limit) {
        Random random = new Random();
        return Stream.generate(random::nextInt)
                .limit(limit)
                .collect(Collectors.toList());
    }

    // 23. iterate - Generates a list of even numbers.
    public List<Integer> generateEvenNumbers(int limit) {
        return Stream.iterate(0, n -> n + 2)
                .limit(limit)
                .collect(Collectors.toList());
    }

    // 24. of - Creates a stream from a fixed set of elements.
    public List<String> createStreamOf(String... elements) {
        return Stream.of(elements)
                .collect(Collectors.toList());
    }

    // 25. concat - Concatenates two lists into one stream.
    public List<Integer> concatStreams(List<Integer> list1, List<Integer> list2) {
        return Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());
    }
}
