# Extract Unique Values
from numpy.ma.extras import unique

data = {'A': [1, 2, 3], 'B': [2, 4, 5], 'C': [3, 5]}
unique_vals = list(set(val for dict_item in data.values() for val in dict_item))
print("Unique Values : ",unique_vals)


# Sum All Items
scores = {'math': 95, 'science': 87, 'english': 92}
total = sum(scores.values())
print("Total:", total)


# Remove Key
student = {'name': 'Alice', 'age': 25, 'grade': 'A'}
if 'grade' in student:
    del student['grade']
print(student)


# Sort Using itemgetter
from operator import itemgetter
students = [{'name': 'Bob', 'age': 22}, {'name': 'Alice', 'age': 20}, {'name': 'Charlie', 'age': 24}]
sorted_students = sorted(students, key=itemgetter('age'))
print(sorted_students)


# Sort Using Lambda
students = [{'name': 'Bob', 'age': 22}, {'name': 'Alice', 'age': 20}, {'name': 'Charlie', 'age': 24}]
sorted_students = sorted(students, key=lambda x: x['age'])
print(sorted_students)