import pytest
from maxchar import max_char_v1


@pytest.mark.parametrize("func, input_string, expected_result", [(max_char_v1, "aaaaaab", "a"),
                                                                 (max_char_v1,
                                                                  "abcccccccccccd", "c"),
                                                                 (max_char_v1, "", "")])
def test_max_char(func, input_string, expected_result):
    result = func(input_string)
    assert result == expected_result
