# Tuple Size
import sys
tup = (1, 2, 'hello', 3.14)
size = sys.getsizeof(tup)
print(f"Tuple size: {size} bytes")


# Max/Min K Elements
def max_min_k(tup, k):
    lst = sorted(tup)
    return tuple(lst[:k] + lst[-k:])

numbers = (13, 10, 23, 2, 5, 6, 12)
print(max_min_k(numbers, 2))


# List of Number-Cube Tuples
numbers = [1, 2, 3, 4, 5]
tuple_list = [(n, n**3) for n in numbers]
print(tuple_list)


# Add Tuple to List
my_list = [1, 2, 3]
new_tuple = (4, 5)
my_list.append(new_tuple)
print(my_list)

# Or extend elements
my_list.extend(new_tuple)
print(my_list)