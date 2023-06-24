# Introduction to LinkedList

Linked lists are one of the most commonly used linear data structures. They consist of a sequence of elements, known as nodes, stored in memory. Each node in the linked list contains information stored in a data type and a reference or pointer to the next element in the list. The size of each element in the list corresponds to the size of the stored element plus the size of the pointer.

```
+---+---------+    +-------------+   +---+------+
| 1 | Pointer |--> | 2 | Pointer |-->| 3 | null |
+---+---------+    +---+---------+   +---+------+
```

Unlike arrays, linked lists do not occupy contiguous memory space. The elements or nodes of a linked list may be scattered throughout the memory.

# linked-list Operations

In the context of linked lists, operations can be described as follows:

- Lookup an element by its index (READ element from the memory)
- Retrieve an element by a value (READ an element from the memory)
- Add or insert an element into the linked list (WRITE an element to the memory)
- Delete an element from a linked list (DELETE an element from the memory)

## Lookup by index

As since linked lists do not have the notion of an index and their elements may be scattered in memory, to retrieve a node by index, we need to scan the entire linked list node by node. Each node points to the next one until we reach the desired index.

This operation has a time complexity of O(n) because in the worst-case scenario, we need to scan the entire linked list to retrieve the last element if the index corresponds to the size of the linked list. However, if the linked list has a tail reference, the lookup for the last element is O(1), while the lookup by index remains O(n).

## Retrieve element by value

Retrieving an element in a linked list by its value has a time complexity of O(n). This means that we need to iterate over the linked list, read each value, and compare it to the value we are searching for. If we find a match, we return the value; otherwise, it means that the value does not exist in the linked list.

## Insertion

Insertion at the beginning of the linked list is an O(1) operation.
Insertion at the end of the linked list with a tail reference is an O(1) operation.

Insertion in the middle of the linked list is an O(n) operation. It requires iterating over the linked list until the desired position is reached and updating the pointers. The node at the desired position will point to the new node, which will point to the next node.

## Deletion

Deletion at the beginning of the linked list is an O(1) operation, as it involves updating the head reference.
Deletion at the end of the linked list with a tail reference is an O(1) operation, as it involves updating the tail reference.

Deletion in the middle of the linked list is an O(n) operation. It requires iterating over the linked list until the desired position is reached, updating the pointers to remove the desired element from the linked list.
