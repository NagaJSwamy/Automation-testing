# 1. Hardcoded values with + operator
num1, num2 = 5, 3
print(f"1. Hardcoded + operator: {num1} + {num2} = {num1 + num2}")


# 2. User input with +operator
print("\n2. Enter two numbers for user input:")
u1 = float(input("Enter first number: "))
u2 = float(input("Enter second number: "))
print(f"User input + operator: {u1} + {u2} = {u1 + u2}")


# 3. += operator (modifies first number)
n1, n2 = 5, 3
n1 += n2
print(f"+= operator: {n1}")


# 4. User - defined function
def add(a, b):
    return a + b
print(f"Function: {add(5, 3)}")


# 5. operator.add()
import operator
print(f"Operator.add(): {operator.add(5, 3)}")


# 6. Lambda function
add_lambda = lambda a, b: a + b
print(f"Lambda: {add_lambda(5, 3)}")


# 7. sum() on list
print(f"sum(): {sum([5, 3])}")



