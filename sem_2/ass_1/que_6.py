def encrypt(text):
    # Step 1: Reverse the string
    text = text[::-1]

    # Step 2: Swap adjacent characters
    chars = list(text)

    for i in range(0, len(chars) - 1, 2):
        chars[i], chars[i + 1] = chars[i + 1], chars[i]

    return "".join(chars)


def decrypt(text):
    # Step 1: Swap adjacent characters again
    chars = list(text)

    for i in range(0, len(chars) - 1, 2):
        chars[i], chars[i + 1] = chars[i + 1], chars[i]

    # Step 2: Reverse the string
    return "".join(chars)[::-1]


text = input("Enter a string: ")

encrypted = encrypt(text)
decrypted = decrypt(encrypted)

print("Encrypted:", encrypted)
print("Decrypted:", decrypted)