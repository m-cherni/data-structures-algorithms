def max_char_v1(s):
    chars_count_dict = {}
    max = 0
    result = s
    for c in s:
        chars_count_dict[c] = chars_count_dict.get(c, 0) + 1
        if chars_count_dict[c] > max:
            max = chars_count_dict[c]
            result = c
    return result


if __name__ == "__main__":
    print(max_char_v1("aaaaabfghhhhhhhhhhhhhhhhjhb"))
