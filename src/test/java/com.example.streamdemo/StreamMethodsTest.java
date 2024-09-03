package com.example.streamdemo;

import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class StreamMethodsTest {
    private StreamMethods streamMethods;

    @BeforeEach
    public void setUp() {
        streamMethods = new StreamMethods();
    }

    @Test
    @Order(1)
    @DisplayName("1. filter - Filters and returns even numbers from a list")
    public void testFilterEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = streamMethods.filterEvenNumbers(numbers);
        List<Integer> expected = Arrays.asList(2, 4, 6);
        assertEquals(expected, evenNumbers);
    }

    @Test
    @Order(2)
    @DisplayName("2. map - Maps a list of integers to their squares")
    public void testMapToSquareNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> squaredNumbers = streamMethods.mapToSquare(numbers);
        List<Integer> expected = Arrays.asList(1, 4, 9, 16, 25);
        assertEquals(expected, squaredNumbers);
    }

    @Test
    @Order(3)
    @DisplayName("3. flatMap - Flattens a list of lists into a single list")
    public void testFlatMapToSingleList() {
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );
        List<Integer> flatList = streamMethods.flatMapToSingleList(listOfLists);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(expected, flatList);
    }

    @Test
    @Order(4)
    @DisplayName("4. forEach - Appends each number in the list to a StringBuilder")
    public void testForEachToAppendString() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        StringBuilder result = new StringBuilder();
        streamMethods.forEachToAppendString(numbers, result);
        String expected = "12345";
        assertEquals(expected, result.toString());
    }

    @Test
    @Order(5)
    @DisplayName("5. collect - Collects elements of a stream into a List")
    public void testCollectToList() {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> collectedList = streamMethods.collectToList(numbers);
        List<Integer> expectedList = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        assertEquals(expectedList, collectedList);
    }

    @Test
    @Order(6)
    @DisplayName("6. collect - Collects elements of a stream into a Set")
    public void testCollectToSet() {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        Set<Integer> collectedSet = streamMethods.collectToSet(numbers);
        Set<Integer> expectedSet = Set.of(1, 2, 3, 4, 5);
        assertTrue(collectedSet.containsAll(expectedSet) && expectedSet.containsAll(collectedSet));
    }


    @Test
    @Order(7)
    @DisplayName("7. reduce - Reduces the list to the sum of its elements")
    public void testReduceSum() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = streamMethods.reduceSum(numbers);
        int expected = 15;
        assertEquals(expected, sum);
    }

    @Test
    @Order(8)
    @DisplayName("8. sorted - Sorts the list of numbers")
    public void testSortedNumbers() {
        List<Integer> numbers = Arrays.asList(5, 3, 1, 4, 2);
        List<Integer> sortedNumbers = streamMethods.sortNumbers(numbers);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, sortedNumbers);
    }

    @Test
    @Order(9)
    @DisplayName("9. distinct - Returns distinct elements from a list")
    public void testDistinctNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> distinctNumbers = streamMethods.distinctNumbers(numbers);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, distinctNumbers);
    }

    @Test
    @Order(10)
    @DisplayName("10. limit - Limits the stream to the first N elements")
    public void testLimitNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> limitedNumbers = streamMethods.limitNumbers(numbers, 3);
        List<Integer> expected = Arrays.asList(1, 2, 3);
        assertEquals(expected, limitedNumbers);
    }

    @Test
    @Order(11)
    @DisplayName("11. skip - Skips the first N elements in the stream")
    public void testSkipNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> skippedNumbers = streamMethods.skipNumbers(numbers, 2);
        List<Integer> expected = Arrays.asList(3, 4, 5);
        assertEquals(expected, skippedNumbers);
    }

    @Test
    @Order(12)
    @DisplayName("12. peek - Peeks at elements during stream processing")
    public void testPeekNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> peekedNumbers = new ArrayList<>();
        List<Integer> collectedNumbers = streamMethods.peekNumbers(numbers, peekedNumbers);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5);
        assertEquals(expected, collectedNumbers);
        assertEquals(expected, peekedNumbers);
    }

    @Test
    @Order(13)
    @DisplayName("13. count - Counts the number of elements in the stream")
    public void testCountNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        long count = streamMethods.countNumbers(numbers);
        long expected = 5;
        assertEquals(expected, count);
    }

    @Test
    @Order(14)
    @DisplayName("14. anyMatch - Checks if any element is greater than a given threshold")
    public void testAnyMatchGreaterThan() {
        List<Integer> numbers = Arrays.asList(5, 8, 12, 15);
        boolean hasGreaterThan10 = streamMethods.anyMatchGreaterThan(numbers, 10);
        assertTrue(hasGreaterThan10);

        List<Integer> smallNumbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean hasGreaterThan10InSmallList = streamMethods.anyMatchGreaterThan(smallNumbers, 10);
        assertFalse(hasGreaterThan10InSmallList);
    }

    @Test
    @Order(15)
    @DisplayName("15. allMatch - Checks if all elements are even")
    public void testAllMatchEvenNumbers() {
        List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8);
        boolean allEven = streamMethods.allMatchEven(evenNumbers);
        assertTrue(allEven);

        List<Integer> mixedNumbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean allEvenInMixedList = streamMethods.allMatchEven(mixedNumbers);
        assertFalse(allEvenInMixedList);
    }

    @Test
    @Order(16)
    @DisplayName("16. noneMatch - Checks if no elements are negative")
    public void testNoneMatchNegativeNumbers() {
        List<Integer> positiveNumbers = Arrays.asList(1, 2, 3, 4, 5);
        boolean noneNegative = streamMethods.noneMatchNegative(positiveNumbers);
        assertTrue(noneNegative);

        List<Integer> mixedNumbers = Arrays.asList(-1, 2, -3, 4, 5);
        boolean noneNegativeInMixedList = streamMethods.noneMatchNegative(mixedNumbers);
        assertFalse(noneNegativeInMixedList);
    }

    @Test
    @Order(17)
    @DisplayName("17. findFirst - Finds the first element in the stream")
    public void testFindFirstNumber() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        Optional<Integer> firstNumber = streamMethods.findFirst(numbers);
        assertTrue(firstNumber.isPresent());
        assertEquals(10, firstNumber.get());

        List<Integer> emptyList = Arrays.asList();
        Optional<Integer> firstInEmptyList = streamMethods.findFirst(emptyList);
        assertFalse(firstInEmptyList.isPresent());
    }

    @Test
    @Order(18)
    @DisplayName("18. findAny - Finds any element in the stream")
    public void testFindAnyNumber() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        Optional<Integer> anyNumber = streamMethods.findAny(numbers);
        assertTrue(anyNumber.isPresent());

        List<Integer> emptyList = Arrays.asList();
        Optional<Integer> anyInEmptyList = streamMethods.findAny(emptyList);
        assertFalse(anyInEmptyList.isPresent());
    }

    @Test
    @Order(19)
    @DisplayName("19. max - Finds the maximum element")
    public void testMaxNumber() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        Optional<Integer> maxNumber = streamMethods.findMax(numbers);
        assertTrue(maxNumber.isPresent());
        assertEquals(50, maxNumber.get());

        List<Integer> emptyList = Arrays.asList();
        Optional<Integer> maxInEmptyList = streamMethods.findMax(emptyList);
        assertFalse(maxInEmptyList.isPresent());
    }

    @Test
    @Order(20)
    @DisplayName("20. min - Finds the minimum element")
    public void testMinNumber() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        Optional<Integer> minNumber = streamMethods.findMin(numbers);
        assertTrue(minNumber.isPresent());
        assertEquals(10, minNumber.get());

        List<Integer> emptyList = Arrays.asList();
        Optional<Integer> minInEmptyList = streamMethods.findMin(emptyList);
        assertFalse(minInEmptyList.isPresent());
    }

    @Test
    @Order(21)
    @DisplayName("21. toArray - Converts the stream to an array")
    public void testToArray() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        Integer[] numberArray = streamMethods.toArray(numbers);
        Integer[] expected = {10, 20, 30, 40, 50};
        assertArrayEquals(expected, numberArray);
    }

    @Test
    @Order(22)
    @DisplayName("22. generate - Generates a list of random numbers")
    public void testGenerateRandomNumbers() {
        List<Integer> randomNumbers = streamMethods.generateRandomNumbers(5);
        assertEquals(5, randomNumbers.size());
    }

    @Test
    @Order(23)
    @DisplayName("23. iterate - Generates a list of even numbers")
    public void testIterateEvenNumbers() {
        List<Integer> evenNumbers = streamMethods.generateEvenNumbers(5);
        List<Integer> expected = Arrays.asList(0, 2, 4, 6, 8);
        assertEquals(expected, evenNumbers);
    }

    @Test
    @Order(24)
    @DisplayName("24. of - Creates a stream from a fixed set of elements")
    public void testStreamOf() {
        List<String> elements = streamMethods.createStreamOf("A", "B", "C");
        List<String> expected = Arrays.asList("A", "B", "C");
        assertEquals(expected, elements);
    }

    @Test
    @Order(25)
    @DisplayName("25. concat - Concatenates two lists into one stream")
    public void testConcatStreams() {
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<Integer> concatenatedList = streamMethods.concatStreams(list1, list2);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 6);
        assertEquals(expected, concatenatedList);
    }
}
