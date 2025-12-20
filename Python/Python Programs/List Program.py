# Append Elements
fruits = ["apple", "banana", "cherry"]
fruits.append("orange")
print(fruits)


# Extend List
fruits = ["apple", "banana", "cherry"]
more = ["date", "mango"]
fruits.extend(more)
print(fruits)


# Insert at Position
fruits = ["apple", "banana", "cherry"]
fruits.insert(2, "mango")
print(fruits)


# Remove Element
fruits = ["apple", "banana", "cherry", "banana"]
fruits.remove("banana")
print(fruits)


# Pop List Element
fruits = ["apple", "banana", "cherry"]
popped = fruits.pop(1)
print(popped, fruits)


# Count Occurrences
numbers = [1, 2, 2, 3, 2, 4]
count = numbers.count(2)
print("Occurrences of 2:", count)