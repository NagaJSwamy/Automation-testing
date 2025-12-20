# Create Matrix
# Using nested lists
from sympy import transpose

matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
print(matrix)

# Using NumPy
import numpy as np
matrix_np = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])


# Transpose Matrix
matrix = [[1, 2, 3], [4, 5, 6]]
transpose = [[row[i] for row in matrix] for i in range(len(matrix[0]))]
print(transpose)

# NumPy way
import numpy as np
matrix_np = np.array(matrix)
print(matrix_np.T)


# Add/Subtract Matrices
import numpy as np
A = np.array([[1, 2], [3, 4]])
B = np.array([[5, 6], [7, 8]])

add_result = np.add(A, B)
sub_result = np.subtract(A, B)
print("Addition:\n", add_result)
print("Subtraction:\n", sub_result)


# Matrix Inversion
import numpy as np
A = np.array([[1, 2], [3, 4]])
inverse = np.linalg.inv(A)
print("Inverse:\n", inverse)


# Matrix Trace
import numpy as np
matrix = np.array([[1, 2, 3], [4, 5, 6], [7, 8, 9]])
trace = np.trace(matrix)
print("Trace:\n", trace)