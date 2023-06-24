import unittest
from node import Node
from linked_list_v1 import LinkedListv1


class LinkedListv1Test(unittest.TestCase):
    def setUp(self):
        self.list = LinkedListv1()

    def test_push_front(self):
        self.list.push_front('A')
        self.assertEqual(self.list.get_size(), 1)
        self.assertEqual(self.list.indexOf('A'), 0)

        self.list.push_front('B')
        self.assertEqual(self.list.get_size(), 2)
        self.assertEqual(self.list.indexOf('B'), 0)
        self.assertEqual(self.list.indexOf('A'), 1)

    def test_push_back(self):
        self.list.push_back('A')
        self.assertEqual(self.list.get_size(), 1)
        self.assertEqual(self.list.indexOf('A'), 0)

        self.list.push_back('B')
        self.assertEqual(self.list.get_size(), 2)
        self.assertEqual(self.list.indexOf('A'), 0)
        self.assertEqual(self.list.indexOf('B'), 1)

    def test_delete_front(self):
        self.list.push_front('A')
        self.list.delete_front()
        self.assertEqual(self.list.get_size(), 0)

        self.list.push_front('A')
        self.list.push_front('B')
        self.list.delete_front()
        self.assertEqual(self.list.get_size(), 1)
        self.assertEqual(self.list.indexOf('B'), -1)
        self.assertEqual(self.list.indexOf('A'), 0)

    def test_delete_back(self):
        self.list.push_back('A')
        self.list.delete_back()
        self.assertEqual(self.list.get_size(), 0)

        self.list.push_back('A')
        self.list.push_back('B')
        self.list.push_back('C')
        self.list.delete_back()
        self.assertEqual(self.list.get_size(), 2)
        self.assertEqual(self.list.indexOf('A'), 0)
        self.assertEqual(self.list.indexOf('B'), 1)
        self.assertEqual(self.list.indexOf('C'), -1)

    def test_contains(self):
        self.assertRaises(ValueError, self.list.contains, 'A')
        self.list.push_front('A')
        self.assertTrue(self.list.contains('A'))
        self.assertFalse(self.list.contains('C'))

    def test_indexOf(self):
        self.assertRaises(ValueError, self.list.indexOf, 'A')
        self.list.push_front('A')
        self.assertEqual(self.list.indexOf('A'), 0)
        self.assertEqual(self.list.indexOf('B'), -1)

    def test_edge_cases(self):
        self.assertRaises(ValueError, self.list.delete_front)
        self.assertRaises(ValueError, self.list.delete_back)
        self.assertRaises(ValueError, self.list.contains, 'A')
        self.assertRaises(ValueError, self.list.indexOf, 'A')

    def tearDown(self):
        self.list = None


if __name__ == '__main__':
    unittest.main()
