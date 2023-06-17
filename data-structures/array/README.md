# Introduction to Array

Arrays are one of the most commonly used linear data structures. They consist of a sequence of elements stored in a contiguous memory area, with each element occupying an equal-sized chunk of memory and indexed by contiguous number. The size of each element in the array corresponds to the size of the element being stored. elements can be any object definied in OOP languages or primitive type, such as integers, characters, longs, etc.

There are two types of arrays:

- Static arrays: With static arrays, we need to allocate the appropriate memory space at the creation of the array (compile time). Once created, we cannot change the size of static array. This means that we must know the number of elements we will store in our array in advance.

- Dynamic arrays: Dynamic arrays can theoretically hold an infinite number of elements. We do not need to specify the number of elements at the beginning, and we can dynamically append as many elements as we want to the array.

The behavior of arrays can vary depending on the programming language. Some languages, like C, C++, and Java, only allow arrays to store elements of the same type. This means that all elements in the array must be of the same data type. Other languages, such as Python and JavaScript, provide more flexibility with data types, allowing arrays (e.g., lists) to store a mix of different element types.

It's important to note that the above information is a general description of arrays and their behavior. The specifics may vary depending on the programming language and its implementation of arrays.

# Array Operations

Since we are dealing with memory, the operations that we can perform are of types ALLOCATE, READ, WRITE or DELETE (DEALLOCATE).

In the context of arrays, these operations can be described as follows:

- Lookup an element by its index (READ element from the memory)
- Retrieve an element by a value (READ an element from the memory)
- Add an element to an array (WRITE an element to the memory)
- Delete an element from an array (DELETE an element from the memory)

## Lookup by index

For arrays that contain only one type, the lookup operation has a constant time complexity of O(1). The index of the element to read can be calculated using the formula: array_start_index + ((index - first_index) \* element_size).

For arrays that contain different types of elements, the lookup operation may have a time complexity of O(n). This is because we need to iterate through and sum the sizes of each element stored before the index we are looking for.

## Retrieve element by value

Retrieving an element in an array by its value has a time complexity of O(n). This means that we need to iterate over the array, read each value, and compare it to the value we are searching for. If we find a match, we return the value; otherwise, it means that the value does not exist in the array.
Depending on the array type, some algorithm can reduce the time complexity.

## Insertion

Insertion at the end of the array is an O(1) operation.

Insertion at the beginning or in the middle of the array is an O(n) operation, as it requires shifting the existing elements to make space for the new element.

For dynamic arrays, when we reach the limit of the initially allocated memory space, we need to resize the array. The resizing process involves copying the entire array to a new contiguous memory space, which results in an O(n) time complexity. Even if the insertion is at the end of the array, the operation still requires resizing and copying. This results that for dynamic array insertion at the end may be O(n).

## Deletion

Deletion at the end of the array is an O(1) operation, as it simply involves updating the array length.

Deletion at the beginning or in the middle of the array is an O(n) operation, as it requires shifting the remaining elements to fill the gap left by the deleted element.
