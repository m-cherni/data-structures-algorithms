import java.util.NoSuchElementException;

class LinkedListv1Test {
    public static void main(String[] args) {
        LinkedListv1Test test = new LinkedListv1Test();
        test.runTests();
    }

    public void runTests() {
        testPushFront();
        testPushBack();
        testDeleteFront();
        testDeleteBack();
        testContains();
        testIndexOf();
    }

    public void testPushFront() {
        LinkedListv1 list = new LinkedListv1();
        list.pushFront("C");
        list.pushFront("B");
        list.pushFront("A");

        assert list.getSize() == 3;
        assert list.contains("A");
        assert list.contains("B");
        assert list.contains("C");
        assert list.indexOf("A") == 0;
        assert list.indexOf("B") == 1;
        assert list.indexOf("C") == 2;
    }

    public void testPushBack() {
        LinkedListv1 list = new LinkedListv1();
        list.pushBack("A");
        list.pushBack("B");
        list.pushBack("C");

        assert list.getSize() == 3;
        assert list.contains("A");
        assert list.contains("B");
        assert list.contains("C");
        assert list.indexOf("A") == 0;
        assert list.indexOf("B") == 1;
        assert list.indexOf("C") == 2;
    }

    public void testDeleteFront() {
        LinkedListv1 list = new LinkedListv1();
        list.pushFront("C");
        list.pushFront("B");
        list.pushFront("A");

        list.deleteFront();
        assert list.getSize() == 2;
        assert !list.contains("A");
        assert list.contains("B");
        assert list.contains("C");
        assert list.indexOf("B") == 0;
        assert list.indexOf("C") == 1;

        list.deleteFront();
        assert list.getSize() == 1;
        assert !list.contains("A");
        assert !list.contains("B");
        assert list.contains("C");
        assert list.indexOf("C") == 0;

        list.deleteFront();
        assert list.getSize() == 0;
        assert !list.contains("A");
        assert !list.contains("B");
        assert !list.contains("C");

        try {
            list.deleteFront();
            assert false; // The previous line should throw an exception, so this line should not be
                          // reached
        } catch (NoSuchElementException e) {
            assert true; // An exception should be thrown
        }
    }

    public void testDeleteBack() {
        LinkedListv1 list = new LinkedListv1();
        list.pushBack("A");
        list.pushBack("B");
        list.pushBack("C");

        list.deleteBack();
        assert list.getSize() == 2;
        assert list.contains("A");
        assert list.contains("B");
        assert !list.contains("C");
        assert list.indexOf("A") == 0;
        assert list.indexOf("B") == 1;

        list.deleteBack();
        assert list.getSize() == 1;
        assert list.contains("A");
        assert !list.contains("B");
        assert !list.contains("C");
        assert list.indexOf("A") == 0;

        list.deleteBack();
        assert list.getSize() == 0;
        assert !list.contains("A");
        assert !list.contains("B");
        assert !list.contains("C");

        try {
            list.deleteBack();
            assert false; // The previous line should throw an exception, so this line should not be
                          // reached
        } catch (NoSuchElementException e) {
            assert true; // An exception should be thrown
        }
    }

    public void testContains() {
        LinkedListv1 list = new LinkedListv1();
        list.pushBack("A");
        list.pushBack("B");
        list.pushBack("C");

        assert list.contains("A");
        assert list.contains("B");
        assert list.contains("C");
        assert !list.contains("D");
    }

    public void testIndexOf() {
        LinkedListv1 list = new LinkedListv1();
        list.pushBack("A");
        list.pushBack("B");
        list.pushBack("C");

        assert list.indexOf("A") == 0;
        assert list.indexOf("B") == 1;
        assert list.indexOf("C") == 2;
        assert list.indexOf("D") == -1;
    }
}
