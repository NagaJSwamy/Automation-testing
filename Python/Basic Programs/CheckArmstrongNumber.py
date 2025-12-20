# 1. Mathematical method (most optimal)
def is_armstrong_math(num):
    n, power, total = num, len(str(num)), 0
    while n > 0:
        digit = n % 10
        total += digit ** power
        n //= 10
    return total == num

print("1. Math method - 153:", is_armstrong_math(153))
print("1. Math method - 120:", is_armstrong_math(120))

# 2. String conversion method
def is_armstrong_string(num):
    digits = str(num)
    power = len(digits)
    total = sum(int(digit) ** power for digit in digits)
    return total == num

print("2. String method - 153:", is_armstrong_string(153))

# 3. Recursive method
def armstrong_sum(n, power):
    if n == 0:
        return 0
    return (n % 10) ** power + armstrong_sum(n // 10, power)

def is_armstrong_recursive(num):
    power = len(str(num))
    return armstrong_sum(num, power) == num

print("3. Recursive - 1634:", is_armstrong_recursive(1634))

# 4. User input test
print("\n4. Enter number to test:")
num_user = int(input("Number: "))
power_user = len(str(num_user))
total_user = 0
temp = num_user
while temp > 0:
    digit = temp % 10
    total_user += digit ** power_user
    temp //= 10
print(f"User input {num_user}: {'Armstrong' if total_user == num_user else 'Not Armstrong'}")
