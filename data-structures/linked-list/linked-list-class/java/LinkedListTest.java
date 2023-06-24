public class LinkedListTest {

    public static void main(String[] args) {
        LinkedListTest test = new LinkedListTest();

        test.testGetSize_EmptyList();
        test.testInsertData();
        test.testDeleteData();
        test.testInsertData_IndexOutOfBounds();
        test.testDeleteData_IndexOutOfBounds();
    }

    public void testGetSize_EmptyList() {
        LinkedList list = new LinkedList();
        int size = list.getSize();
        assertEqual(0, size);
    }

    public void testInsertData() {
        LinkedList list = new LinkedList();
        list.insertData("A", 0);
        list.insertData("B", 1);
        list.insertData("C", 2);

        int size = list.getSize();
        assertEqual(3, size);

        boolean foundA = list.find("A");
        boolean foundB = list.find("B");
        boolean foundC = list.find("C");
        assertTrue(foundA);
        assertTrue(foundB);
        assertTrue(foundC);
    }

    public void testDeleteData() {
        LinkedList list = new LinkedList();
        list.insertData("A", 0);
        list.insertData("B", 1);
        list.insertData("C", 2);

        list.deleteData(1);
        int size = list.getSize();
        assertEqual(2, size);

        list.deleteData(1);
        size = list.getSize();
        assertEqual(1, size);

        boolean foundA = list.find("A");
        boolean foundB = list.find("B");
        boolean foundC = list.find("C");
        assertTrue(foundA);
        assertFalse(foundB);
        assertFalse(foundC);
    }

    public void testInsertData_IndexOutOfBounds() {
        LinkedList list = new LinkedList();
        list.insertData("A", 0);
        list.insertData("B", 1);

        // Attempt to insert at an invalid index
        try {
            list.insertData("C", 3);
            // If the exception is not thrown, fail the test
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // The exception is expected, continue with the test
        }
    }

    public void testDeleteData_IndexOutOfBounds() {
        LinkedList list = new LinkedList();
        list.insertData("A", 0);
        list.insertData("B", 1);

        // Attempt to delete at an invalid index
        try {
            list.deleteData(2);
            // If the exception is not thrown, fail the test
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // The exception is expected, continue with the test
        }
    }

    // Helper assertEqual method
    private void assertEqual(int expected, int actual) {
        if (expected != actual) {
            throw new AssertionError("Expected: " + expected + ", but got: " + actual);
        }
    }

    // Helper assertTrue method
    private void assertTrue(boolean condition) {
        if (!condition) {
            throw new AssertionError("Expected: true, but got: false");
        }
    }

    // Helper assertFalse method
    private void assertFalse(boolean condition) {
        if (condition) {
            throw new AssertionError("Expected: false, but got: true");
        }
    }

    // Helper fail method
    private void fail(String message) {
        throw new AssertionError(message);
    }
}
