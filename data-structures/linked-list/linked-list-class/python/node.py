

class Node:
    def __init__(self, value: str, next=None) -> None:
        self._value = value
        self._next = next

    def get_value(self) -> str:
        return self._value

    def set_value(self, value: str) -> None:
        self._value = value

    def get_next(self) -> object:
        return self._next

    def set_next(self, next: object) -> None:
        self._next = next
