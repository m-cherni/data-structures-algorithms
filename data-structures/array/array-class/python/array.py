

import unittest


class Array:
    """
    An array implementation with a fixed capacity.

    Args:
        capacity (int): The maximum number of elements the array can hold.

    Attributes:
        _capacity (int): The maximum capacity of the array.
        _size (int): The current number of elements in the array.
        _values (list): The list storing the elements of the array.

    Methods:
        get_size() -> int:
            Returns the current number of elements in the array.

        append(value: int) -> None:
            Appends the given value to the end of the array.

        remove_at(index: int) -> None:
            Removes the element at the specified index from the array.

        get(index: int) -> int:
            Returns the element at the specified index.

        indexOf(value: int) -> int:
            Returns the index of the first occurrence of the specified value in the array. Returns -1 if not found.
    """

    def __init__(self, capacity: int) -> None:
        """
        Initializes a new instance of the Array class with the specified capacity.

        Args:
            capacity (int): The maximum number of elements the array can hold.

        Attributes:
            _capacity (int): The maximum capacity of the array.
            _size (int): The current number of elements in the array.
            _values (list): The list storing the elements of the array.
        """
        self._capacity = capacity
        self._size = 0
        self._values = [None for i in range(self._capacity)]

    def get_size(self) -> int:
        """
        Returns the current number of elements in the array.

        Returns:
            int: The number of elements in the array.
        """
        return self._size

    def append(self, value: int) -> None:
        """
        Appends the given value to the end of the array.

        Args:
            value (int): The value to be appended to the array.

        Raises:
            ValueError: If the value is not an integer.
        """
        if not isinstance(value, int):
            raise ValueError(f"{value} must be an int")
        if self._size == self._capacity:
            self._values.extend([None for i in range(self._capacity)])
        self._values[self._size] = value
        self._size += 1

    def remove_at(self, index: int) -> None:
        """
        Removes the element at the specified index from the array.

        Args:
            index (int): The index of the element to be removed.

        Raises:
            ValueError: If the index is out of range.
        """
        if index < 0 or index >= self._size:
            raise ValueError("Index not found")
        if (index == self._size - 1):
            self._size -= 1
            return
        for i in range(index, self._size):
            self._values[i] = self._values[i+1]
        self._size -= 1

    def get(self, index: int) -> int:
        """
        Returns the element at the specified index.

        Args:
            index (int): The index of the element to be retrieved.

        Returns:
            int: The value at the specified index.

        Raises:
            ValueError: If the index is out of range.
        """
        if index < 0 or index >= self._size:
            raise ValueError("Index not found")
        return self._values[index]

    def indexOf(self, value: int) -> None:
        """
        Returns the index of the first occurrence of the specified value in the array.

        Args:
            value (int): The value to search for in the array.

        Returns:
            int: The index of the first occurrence of the value, or -1 if not found.

        Raises:
            ValueError: If the value is not an integer.
        """
        if not isinstance(value, int):
            raise ValueError(f"{value} must be an int")
        for i in range(self._size):
            if value == self._values[i]:
                return i
        return -1
