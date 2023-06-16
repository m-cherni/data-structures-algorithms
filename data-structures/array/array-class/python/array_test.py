

import unittest
from array import Array


class ArrayTestCase(unittest.TestCase):

    def test_array_creation(self):
        # Create an array with capacity 5
        arr = Array(5)

        # Test initial size
        self.assertEqual(arr.get_size(), 0)

    def test_array_append(self):
        # Create an array with capacity 5
        arr = Array(5)

        # Test appending values
        arr.append(10)
        arr.append(20)
        arr.append(30)

        # Test size after appending
        self.assertEqual(arr.get_size(), 3)

        # Test getting values by index
        self.assertEqual(arr.get(0), 10)
        self.assertEqual(arr.get(1), 20)
        self.assertEqual(arr.get(2), 30)

        # Test appending non-integer value raises ValueError
        with self.assertRaises(ValueError):
            arr.append("invalid")

        # Test getting value at out-of-range index raises ValueError
        with self.assertRaises(ValueError):
            arr.get(5)

    def test_array_remove_at(self):
        # Create an array with capacity 5
        arr = Array(5)

        # Test appending values
        arr.append(10)
        arr.append(20)
        arr.append(30)

        # Test index of value
        self.assertEqual(arr.indexOf(20), 1)

        # Test removing value by index
        arr.remove_at(1)

        # Test size after removal
        self.assertEqual(arr.get_size(), 2)

        # Test updated values after removal
        self.assertEqual(arr.get(0), 10)
        self.assertEqual(arr.get(1), 30)

        # Test removing value at out-of-range index raises ValueError
        with self.assertRaises(ValueError):
            arr.remove_at(5)

    def test_array_index_of(self):
        # Create an array with capacity 5
        arr = Array(5)

        # Test appending values
        arr.append(10)
        arr.append(20)
        arr.append(30)

        # Test index of existing value
        self.assertEqual(arr.indexOf(20), 1)

        # Test index of non existing value
        self.assertEqual(arr.indexOf(40), -1)

        # Test searching for non-integer value raises ValueError
        with self.assertRaises(ValueError):
            arr.indexOf("invalid")


if __name__ == '__main__':
    unittest.main()
