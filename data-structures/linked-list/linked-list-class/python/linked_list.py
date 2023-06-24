from node import Node


class LinkedList:
    def __init__(self) -> None:
        """
        Initializes an empty linked list.
        """
        self._head = None
        self._size = 0

    def get_size(self) -> int:
        """
        Returns the size of the linked list.

        Returns:
            The number of nodes in the linked list.
        """
        return self._size

    def insert_node(self, value: str, index: int) -> None:
        """
        Inserts a new node with the given value at the specified index.

        Args:
            value (str): The value to be inserted.
            index (int): The index at which the value should be inserted.

        Raises:
            ValueError: If the index is out of range or the list is empty (index >= 0).

        """
        if index < 0 or index > self._size:
            raise ValueError('Index out of range')

        if self._head == None and index > 0:
            raise ValueError('List is empty, index out of range')

        node = Node(value)
        if index == 0:
            node.set_next(self._head)
            self._head = node
            self._size += 1
        else:
            iterNode = self._head
            i = 0
            while i < index - 1:
                iterNode = iterNode.get_next()
                i += 1

            if index == self._size:
                iterNode.set_next(node)
                self._size += 1
                return

            node.set_next(iterNode.get_next())
            iterNode.set_next(node)
            self._size += 1

    def find(self, value: str) -> bool:
        """
        Searches for a node with the given value in the linked list.

        Args:
            value (str): The value to search for.

        Returns:
            bool: True if the value is found, False otherwise.

        Raises:
            ValueError: If the list is empty.
        """
        if self._head == None:
            raise ValueError("List is empty")

        node = self._head
        while node != None:
            if node.get_value() == value:
                return True
            node = node.get_next()
        return False

    def deleteNode(self, index: int) -> None:
        """
        Deletes the node at the specified index.

        Args:
            index (int): The index of the node to be deleted.

        Raises:
            ValueError: If the index is out of range or the list is empty (index >= 0).
        """
        if index < 0 or index > self._size:
            raise ValueError('Index out of range')

        if self._head == None:
            raise ValueError('List is empty, index out of range')

        if index == 0:
            self._head = self._head.get_next()
            self._size -= 1
            return

        node = self._head
        i = 0
        while i < index - 1:
            node = node.get_next()
            i += 1

        if index == self._size - 1:
            node.set_next(None)
            self._size -= 1
            return

        node.set_next(node.get_next().get_next())
        self._size -= 1
