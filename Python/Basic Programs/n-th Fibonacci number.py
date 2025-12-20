from math import sqrt

n = int(input("Enter n: "))

# 1) Formula (Binet's formula)
def fib_formula(n):
    phi = (1 + sqrt(5)) / 2
    psi = (1 - sqrt(5)) / 2
    return int((phi**n - psi**n) / sqrt(5))

# 2) Simple recursion
def fib_rec(n):
    if n <= 0:
        return "Incorrect input"
    elif n == 1:
        return 0
    elif n == 2:
        return 1
    else:
        return fib_rec(n-1) + fib_rec(n-2)

# 3) DP with memo array (top‑down)
FibArray = [0, 1]
def fib_dp(n):
    if n < 0:
        return "Incorrect input"
    elif n <= len(FibArray):
        return FibArray[n-1]
    else:
        temp = fib_dp(n-1) + fib_dp(n-2)
        FibArray.append(temp)
        return temp

# 4) DP space optimized (bottom‑up)
def fib_space_opt(n):
    a, b = 0, 1
    if n < 0:
        return "Incorrect input"
    elif n == 0:
        return a
    elif n == 1:
        return b
    for _ in range(2, n):
        a, b = b, a + b
    return b

# 5) Array (iterative)
def fib_array(n):
    if n <= 0:
        return "Incorrect Output"
    data = [0, 1]
    if n > 2:
        for i in range(2, n):
            data.append(data[i-1] + data[i-2])
    return data[n-1]

# 6) Matrix method O(n)
def fib_matrix(n):
    def multiply(F, M):
        x = F[0][0]*M[0][0] + F[0][1]*M[1][0]
        y = F[0][0]*M[0][1] + F[0][1]*M[1][1]
        z = F[1][0]*M[0][0] + F[1][1]*M[1][0]
        w = F[1][0]*M[0][1] + F[1][1]*M[1][1]
        F[0][0], F[0][1], F[1][0], F[1][1] = x, y, z, w

    def power(F, n):
        M = [[1, 1], [1, 0]]
        for _ in range(2, n + 1):
            multiply(F, M)

    if n == 0:
        return 0
    F = [[1, 1], [1, 0]]
    power(F, n - 1)
    return F[0][0]

# 7) Optimized matrix method O(log n)
def fib_matrix_log(n):
    def multiply(F, M):
        x = F[0][0]*M[0][0] + F[0][1]*M[1][0]
        y = F[0][0]*M[0][1] + F[0][1]*M[1][1]
        z = F[1][0]*M[0][0] + F[1][1]*M[1][0]
        w = F[1][0]*M[0][1] + F[1][1]*M[1][1]
        F[0][0], F[0][1], F[1][0], F[1][1] = x, y, z, w

    def power(F, n):
        if n == 0 or n == 1:
            return
        M = [[1, 1], [1, 0]]
        power(F, n // 2)
        multiply(F, F)
        if n % 2 != 0:
            multiply(F, M)

    if n == 0:
        return 0
    F = [[1, 1], [1, 0]]
    power(F, n - 1)
    return F[0][0]

print(f"\nFormula        : {fib_formula(n)}")
print(f"Recursion      : {fib_rec(n)}")
print(f"DP (memo)      : {fib_dp(n)}")
print(f"DP space-opt   : {fib_space_opt(n)}")
print(f"Array method   : {fib_array(n)}")
print(f"Matrix O(n)    : {fib_matrix(n)}")
print(f"Matrix O(log n): {fib_matrix_log(n)}")
