import java.lang.IndexOutOfBoundsException;

/**
 * The {@code Array} class represents a dynamic array data structure that can
 * store integers.
 * It provides methods for appending values, removing values at specified
 * indices,
 * retrieving values by index, and finding the index of a value.
 */
public class Array {
    private int size;
    private int capacity;
    private int[] values;

    /**
     * Constructs a new Array object with the specified capacity.
     *
     * @param capacity the initial capacity of the array
     */
    public Array(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.values = new int[capacity];
    }

    /**
     * Returns the current size of the array.
     *
     * @return the size of the array
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Appends the specified value to the end of the array.
     * If the array is full, it doubles its capacity before appending the value.
     *
     * @param value the value to be appended
     */
    public void append(int value) {
        if (this.capacity == this.size) {
            int[] tempValues = new int[this.capacity * 2];
            System.arraycopy(this.values, 0, tempValues, 0, this.size);
            this.values = tempValues;
            this.capacity *= 2;
        }
        this.values[this.size] = value;
        this.size += 1;
    }

    /**
     * Removes the value at the specified index from the array.
     * If the index is out of range, it prints an error message and does nothing.
     *
     * @param index the index of the value to be removed
     */
    public void removeAt(int index) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of range");
        }
        if (index == this.size - 1) {
            this.size -= 1;
            return;
        }

        System.arraycopy(this.values, index + 1, this.values, index, this.size - index - 1);
        this.size -= 1;
    }

    /**
     * Retrieves the value at the specified index from the array.
     * If the index is out of range, it returns -1.
     *
     * @param index the index of the value to be retrieved
     * @return the value at the specified index, or -1 if the index is out of range
     */
    public int get(int index) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException("Index out of range");
        }

        return this.values[index];
    }

    /**
     * Returns the index of the first occurrence of the specified value in the
     * array.
     * If the value is not found, it returns -1.
     *
     * @param value the value to be searched
     * @return the index of the value, or -1 if the value is not found
     */
    public int indexOf(int value) {
        for (int i = 0; i < this.size; i++) {
            if (values[i] == value) {
                return i;
            }
        }
        return -1;
    }

}
