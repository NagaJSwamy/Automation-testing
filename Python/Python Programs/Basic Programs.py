# Python Hello World Program
print("Hello World")


# Add Two Numbers
num1 = 5
num2 = 3
result = num1 + num2
print("Sum : ",result)


# Check Even or Odd Number
num = int(input("Enter a number: "))
if num % 2 == 0:
    print("Even Number")
else:
    print("Odd Number")


# Swap Two Variables
a, b = 10, 20
a, b = b, a
print("a:", a, "b:", b)


# Find Factorial of a Number
n = 5
fact = 1
for i in range(1, n+1):
    fact = fact * i
    print("Factorial:",fact)


# Reverse a Number
num = 1234
rev = 0
while num > 0:
    rev = rev * 10 + num % 10
    num = num // 10
    print("Reverse:",rev)


# Program to Check Prime Number
num = 13
if num < 2:
    print("Not Prime")
else:
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            print("Not Prime")
            break
    else:
        print("Prime")


# Program to Find GCD of Two Numbers
def gcd(a, b):
    while b:
        a, b = b, a % b
    return a
print("GCD:",gcd(10, 20))


# Program to Find Sum of Digits
num = 123
sum_digits = 0
while num > 0:
    sum_digits = sum_digits + num % 10
    num = num // 10
print("Sum:",sum_digits)


# Program to Check Armstrong Number
num = 153
order = len(str(num))
total = sum(int(i) ** order for i in str(num))
print("Armstrong" if total == num else "Not Armstrong")