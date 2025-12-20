# N-th multiple of m in Fibonacci series
# Example: n = 4, m = 3 → 987

# 1) Iterative approach
def nth_multiple_iterative(n, m):
    a, b, count = 0, 1, 0
    while True:
        a, b = b, a + b
        if b % m == 0:
            count += 1
            if count == n:
                return b


# 2) Dynamic Programming (list)
def nth_multiple_dp(n, m):
    fib = [0, 1]
    count = 0
    while True:
        fib.append(fib[-1] + fib[-2])
        if fib[-1] % m == 0:
            count += 1
            if count == n:
                return fib[-1]


# 3) Recursive with memoization
def fib_memo(k, memo={0: 0, 1: 1}):
    if k not in memo:
        memo[k] = fib_memo(k - 1, memo) + fib_memo(k - 2, memo)
    return memo[k]

def nth_multiple_recursive(n, m):
    count, idx = 0, 2
    while True:
        value = fib_memo(idx)
        if value % m == 0:
            count += 1
            if count == n:
                return value
        idx += 1


# Driver code
n = int(input("Enter n (which multiple): "))
m = int(input("Enter m (divisor): "))

print("\nIterative      :", nth_multiple_iterative(n, m))
print("DP (list)      :", nth_multiple_dp(n, m))
print("Recursive+memo :", nth_multiple_recursive(n, m))
