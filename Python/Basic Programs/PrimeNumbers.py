# Print all prime numbers in an interval using multiple methods

# Common input
x = int(input("Enter start of interval: "))
y = int(input("Enter end of interval: "))
print(f"\nPrime numbers between {x} and {y}:\n")


# 1. Trial division (recommended for small/medium ranges)
def primes_trial(start, end):
    res = []
    for n in range(start, end + 1):
        if n <= 1:
            continue
        is_prime = True
        for i in range(2, int(n ** 0.5) + 1):
            if n % i == 0:
                is_prime = False
                break
        if is_prime:
            res.append(n)
    return res

print("1) Trial division:", primes_trial(x, y) or "No")


# 2. Sieve of Eratosthenes (fast for larger ranges)
def primes_sieve(start, end):
    if end < 2:
        return []
    primes = [True] * (end + 1)
    primes[0] = primes[1] = False

    for i in range(2, int(end ** 0.5) + 1):
        if primes[i]:
            for j in range(i * i, end + 1, i):
                primes[j] = False

    return [i for i in range(start, end + 1) if primes[i]]

print("2) Sieve: ", primes_sieve(x, y) or "No")


# 3. SymPy prime range (requires external library)
import sympy
try:
    from sympy import primerange

    def primes_sympy(start, end):
        return list(primerange(start, end + 1))

    print("3) SymPy: ", primes_sympy(x, y) or "No")
except ImportError:
    print("3) SymPy: SymPy not installed (pip install sympy)")


# 4. Naive approach (educational, slow)
def primes_naive(start, end):
    res = []
    for i in range(start, end + 1):
        if i <= 1:
            continue
        for j in range(2, i // 2 + 1):
            if i % j == 0:
                break
        else:
            res.append(i)
    return res

print("4) Naive: ", primes_naive(x, y) or "No")
