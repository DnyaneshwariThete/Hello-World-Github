def reverse_string(text):
    reversed_text = []

    for i in range(len(text) - 1, -1, -1):
        reversed_text.append(text[i])

    return ''.join(reversed_text)


if __name__ == "__main__":
    name = "Playwright"
    print("Reversed:", reverse_string(name))
