# 1. Hardcoded values with max() function
num1, num2 = 10, 5
print(f"1. max() function: {max(num1, num2)}")


# 2. User input with max()
print("\n2. Enter two numbers for user input:")
u1 = float(input("Enter first number: "))
u2 = float(input("Enter second number: "))
print(f"User input amx(): {max(u1, u2)}")


# 3. if-else comparison
n1, n2 = 10, 5
if n1 > n2:
    print(f"n1: {n1}")
else:
    print(f"n2: {n2}")


# 4. User - defined function
def get_max(a,b):
    return a if a > b else b
print(f"Function: {get_max(10, 5)}")


# 5. Ternary operator
max_val = num1 if num1 > num2 else num2
print(f"Max value: {max_val}")


# 6. Lambda function
max_lambda = lambda a, b: a if a > b else b
print(f"Lambda: {max_lambda(10, 5)}")


# 7. list sort method
nums = [10, 5]
nums.sort()
print(f"Sorted list: {nums[-1]}")



