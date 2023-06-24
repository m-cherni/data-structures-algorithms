from node import Node


class LinkedListv1:
    """
    A class representing a singly linked list.

    Attributes:
        _head: The head node of the linked list.
        _tail: The tail node of the linked list.
        _size: The size of the linked list.

    Methods:
        __init__(): Initializes an empty linked list.
        get_size() -> int: Returns the size of the linked list.
        push_front(value: str) -> None: Inserts a node with the given value at the front of the linked list.
        push_back(value: str) -> None: Inserts a node with the given value at the end of the linked list.
        delete_front() -> None: Deletes the node at the front of the linked list.
        delete_back() -> None: Deletes the node at the end of the linked list.
        contains(value: str) -> bool: Checks if the linked list contains a node with the given value.
        indexOf(value: str) -> int: Returns the index of the first occurrence of a node with the given value.
    """

    def __init__(self):
        """
        Initializes an empty linked list.
        """
        self._head = None
        self._tail = None
        self._size = 0

    def get_size(self) -> int:
        """
        Returns the size of the linked list.

        Returns:
            The size of the linked list as an integer.
        """
        return self._size

    def push_front(self, value: str) -> None:
        """
        Inserts a node with the given value at the front of the linked list.

        Args:
            value: The value to be inserted in the new node.

        Returns:
            None
        """
        node = Node(value, None)
        if self._head == None:
            self._head = node
            self._tail = node
            self._size += 1
            return

        node.set_next(self._head)
        self._head = node
        self._size += 1

    def push_back(self, value: str) -> None:
        """
        Inserts a node with the given value at the end of the linked list.

        Args:
            value: The value to be inserted in the new node.

        Returns:
            None
        """
        node = Node(value, None)
        if self._head == None:
            self._head = node
            self._tail = node
            self._size += 1
            return

        self._tail.set_next(node)
        self._tail = node
        self._size += 1

    def delete_front(self) -> None:
        """
        Deletes the node at the front of the linked list.

        Returns:
            None

        Raises:
            ValueError: If the linked list is empty.
        """
        if self._head == None:
            raise ValueError('Linked list empty')

        if self._head == self._tail:
            self._head = None
            self._tail = None
            self._size -= 1
            return

        self._head = self._head.get_next()
        self._size -= 1

    def delete_back(self) -> None:
        """
        Deletes the node at the end of the linked list.

        Returns:
            None

        Raises:
            ValueError: If the linked list is empty.
        """
        if self._head == None:
            raise ValueError('Linked list empty')

        if self._head == self._tail:
            self._head = None
            self._tail = None
            self._size -= 1
            return

        node = self._head
        while node.get_next() != self._tail:
            node = node.get_next()

        node.set_next(None)
        self._tail = node
        self._size -= 1

    def contains(self, value: str) -> bool:
        """
        Checks if the linked list contains a node with the given value.

        Args:
            value: The value to search for.

        Returns:
            True if a node with the given value is found, False otherwise.

        Raises:
            ValueError: If the linked list is empty.
        """
        if self._head == None:
            raise ValueError('Linked list is empty')
        node = self._head
        while node != None:
            if value == node.get_value():
                return True
            node = node.get_next()
        return False

    def indexOf(self, value: str) -> int:
        """
        Returns the index of the first occurrence of a node with the given value.

        Args:
            value: The value to search for.

        Returns:
            The index of the node with the given value as an integer. Returns -1 if the value is not found.

        Raises:
            ValueError: If the linked list is empty.
        """
        if self._head == None:
            raise ValueError('Linked list empty')

        node = self._head
        i = 0
        while node != None:
            if node.get_value() == value:
                return i
            node = node.get_next()
            i += 1

        return -1
