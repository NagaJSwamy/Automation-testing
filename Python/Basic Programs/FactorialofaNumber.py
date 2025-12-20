# 1. For loop
n = 6
fact = 1
for i in range(1, n + 1):
    fact *= i
    print(f"Factorial of {n} is : {fact}")


# 2. User input with while loop
print("\n2. Enter number for while loop:")
num = int(input("Enter number: "))
fact_while = 1
i = 1
while i <= num:
    fact_while *= i
    i += 1
    print(f"while loop of {num} is : {fact_while}")


# 3. Recursive function
def fact_recursive(n):
    return 1 if (n == 1 or n == 0) else n * fact_recursive(n - 1)
print(f"recursive: {fact_recursive(6)}")


# 4. math.factorial
import math
print(f"math.factorial: {math.factorial(6)}")


# 5. numpy.prod()
import numpy as np
n_np = 6
result_np = np.prod([i for i in range(1, n_np + 1)])
print(f"result_np: {result_np}")

