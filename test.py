def reverse_string(text):
    reversed_text = ""

    for i in range(len(text)):
        reversed_text += text[i]

    return reversed_text


name = "Playwright"
print("Reversed:", reverse_string(name))
