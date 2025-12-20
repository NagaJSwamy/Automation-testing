import math

def is_perfect_sq(x):
    s = int(math.isqrt(x))        # integer square root
    return s * s == x             # True if perfect square

def is_fibonacci(n):
    return (
        is_perfect_sq(5 * n * n + 4) or
        is_perfect_sq(5 * n * n - 4)
    )

# Driver code
num = int(input("Enter a number: "))

if is_fibonacci(num):
    print(f"{num} is a Fibonacci Number")
else:
    print(f"{num} is not a Fibonacci Number")
