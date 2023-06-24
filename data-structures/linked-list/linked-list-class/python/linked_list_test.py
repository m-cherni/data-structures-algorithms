import unittest
from linked_list import LinkedList


class TestLinkedList(unittest.TestCase):
    def setUp(self):
        self.linked_list = LinkedList()

    def test_insert_node(self):
        self.linked_list.insert_node('A', 0)
        self.linked_list.insert_node('B', 1)
        self.linked_list.insert_node('C', 1)
        self.assertEqual(self.linked_list.get_size(), 3)
        self.assertEqual(self.linked_list.find('A'), True)
        self.assertEqual(self.linked_list.find('B'), True)
        self.assertEqual(self.linked_list.find('C'), True)

    def test_delete_node(self):
        self.linked_list.insert_node('A', 0)
        self.linked_list.insert_node('B', 1)
        self.linked_list.insert_node('C', 2)
        self.assertEqual(self.linked_list.get_size(), 3)
        self.linked_list.deleteNode(0)
        self.assertEqual(self.linked_list.get_size(), 2)
        self.linked_list.deleteNode(1)
        self.assertEqual(self.linked_list.get_size(), 1)
        self.assertEqual(self.linked_list.find('A'), False)
        self.assertEqual(self.linked_list.find('C'), False)

    def test_insert_node_at_beginning(self):
        self.linked_list.insert_node('A', 0)
        self.assertEqual(self.linked_list.get_size(), 1)
        self.assertEqual(self.linked_list.find('A'), True)

    def test_insert_node_at_end(self):
        self.linked_list.insert_node('A', 0)
        self.linked_list.insert_node('B', 1)
        self.linked_list.insert_node('C', 2)
        self.linked_list.insert_node('D', 3)
        self.assertEqual(self.linked_list.get_size(), 4)
        self.assertEqual(self.linked_list.find('D'), True)

    def test_delete_node_at_beginning(self):
        self.linked_list.insert_node('A', 0)
        self.linked_list.insert_node('B', 1)
        self.linked_list.deleteNode(0)
        self.assertEqual(self.linked_list.get_size(), 1)
        self.assertEqual(self.linked_list.find('A'), False)

    def test_delete_node_at_end(self):
        self.linked_list.insert_node('A', 0)
        self.linked_list.insert_node('B', 1)
        self.linked_list.insert_node('C', 2)
        self.linked_list.deleteNode(2)
        self.assertEqual(self.linked_list.get_size(), 2)
        self.assertEqual(self.linked_list.find('C'), False)

    def test_delete_node_at_the_middle(self):
        self.linked_list.insert_node('A', 0)
        self.linked_list.insert_node('B', 1)
        self.linked_list.insert_node('C', 2)
        self.linked_list.insert_node('D', 3)
        self.assertEqual(self.linked_list.get_size(), 4)
        self.linked_list.deleteNode(2)
        self.assertEqual(self.linked_list.get_size(), 3)
        self.assertEqual(self.linked_list.find('C'), False)
        self.linked_list.deleteNode(1)
        self.assertEqual(self.linked_list.get_size(), 2)
        self.assertEqual(self.linked_list.find('B'), False)


# Run the tests
if __name__ == '__main__':
    unittest.main()
