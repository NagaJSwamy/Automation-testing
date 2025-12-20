# 1) Hardcoded character
c = 'g'
print("1) Hardcoded char:", c, "->", ord(c))

# 2) User input (single character)
ch = input("\n2) Enter a character: ")[0]      # take only first char
print(f"ASCII of '{ch}' is {ord(ch)}")

# 3) ASCII values for a full string
text = input("\n3) Enter a string: ")
ascii_list = [ord(ch) for ch in text]
print("ASCII list:", ascii_list)

# 4) Print ASCII table for A–Z
print("\n4) ASCII table A–Z:")
for ch in range(ord('A'), ord('Z') + 1):
    print(chr(ch), "->", ch, end="  ")
print()

# 5) Print ASCII table for digits 0–9
print("\n5) ASCII table 0–9:")
for ch in range(ord('0'), ord('9') + 1):
    print(chr(ch), "->", ch, end="  ")
print()
