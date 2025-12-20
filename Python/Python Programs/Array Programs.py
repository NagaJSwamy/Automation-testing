# Maximum in Array
arr = [10, 324, 45, 90, 9808]
max_val = max(arr)
print("Max Value: ", max_val)


# Minimum in Array
arr = [10, 89, 9, 56, 4, 80, 8]
min_val = min(arr)
print("Min Value: ", min_val)


# Sum of Array Elements
arr = [1, 2, 3, 4, 5]
total =sum(arr)
print("Sum of Total Value: ", total)


# Reverse Array Elements
arr = [1, 2, 3, 4, 5]
arr.reverse()
print("Reversed Value: ", arr)


# Merge Array Elements
arr1 = [1, 2, 3, 4, 5]
arr2 = [4, 5, 6, 7, 8]
merged = arr1 + arr2
print("Merged Value: ", merged)


# Remove Duplicates
arr = [1, 2, 3, 2, 3, 4, 3, 5]
unique = list(dict.fromkeys(arr))
print("Unique Value: ", unique)


# Rotate Array
arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
d = 2
rotated = arr[d:] + arr[:d]
print("Rotated Value: ", rotated)


# Second Largest Element
arr = [12, 35, 1, 10, 34, 1]
largest = max(arr)
second = max(x for x in arr if x != largest)
print("Second Largest Value: ", second)