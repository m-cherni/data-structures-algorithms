public class ArrayTest {

    public static void main(String[] args) {
        ArrayTest arrayTest = new ArrayTest();

        // Test the append method
        arrayTest.testAppend();

        // Test the removeAt method
        arrayTest.testRemoveAt();

        // Test the get method
        arrayTest.testGet();

        // Test the indexOf method
        arrayTest.testIndexOf();
    }

    public void testAppend() {
        Array array = new Array(5);
        array.append(10);
        array.append(20);
        array.append(30);

        // Check if the size is updated correctly
        assert array.getSize() == 3;

        // Check if the values are stored correctly
        assert array.get(0) == 10;
        assert array.get(1) == 20;
        assert array.get(2) == 30;
    }

    public void testRemoveAt() {
        Array array = new Array(5);
        array.append(10);
        array.append(20);
        array.append(30);

        // Remove an element at index 1
        array.removeAt(1);

        // Check if the size is updated correctly
        assert array.getSize() == 2;

        // Check if the values are updated correctly
        assert array.get(0) == 10;
        assert array.get(1) == 30;

        // Try to remove an element at an invalid index
        try {
            array.removeAt(5); // Index out of range

            // If the exception is not thrown, fail the test
            throw new AssertionError("Expected IndexOutOfBoundsException, but no exception was thrown.");
        } catch (IndexOutOfBoundsException e) {
            // Exception was thrown as expected
        }

    }

    public void testGet() {
        Array array = new Array(5);
        array.append(10);
        array.append(20);
        array.append(30);

        // Get the element at index 1
        int element = array.get(1);

        // Check if the element is retrieved correctly
        assert element == 20;

        // Try to get an element at an invalid index
        try {
            array.get(5); // Index out of range

            // If the exception is not thrown, fail the test
            throw new AssertionError("Expected IndexOutOfBoundsException, but no exception was thrown.");
        } catch (IndexOutOfBoundsException e) {
            // Exception was thrown as expected
        }
    }

    public void testIndexOf() {
        Array array = new Array(5);
        array.append(10);
        array.append(20);
        array.append(30);

        // Get the index of element 20
        int index = array.indexOf(20);

        // Check if the index is correct
        assert index == 1;

        // Get the index of an element that doesn't exist
        int invalidIndex = array.indexOf(40);

        // Check if the index is correct
        assert invalidIndex == -1;
    }
}
