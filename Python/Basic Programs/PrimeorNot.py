from math import sqrt

# 1) Flag variable (recommended)
def is_prime_flag(n):
    if n <= 1:
        return False
    is_prime = True
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            is_prime = False
            break
    return is_prime


# 2) SymPy isprime (external library)
def is_prime_sympy(n):
    try:
        from sympy import isprime
        return isprime(n)
    except ImportError:
        return "SymPy not installed"


# 3) Sieve of Eratosthenes up to n
def is_prime_sieve(n):
    if n < 2:
        return False
    sieve = [True] * (n + 1)
    sieve[0] = sieve[1] = False

    for i in range(2, int(n**0.5) + 1):
        if sieve[i]:
            for j in range(i * i, n + 1, i):
                sieve[j] = False
    return sieve[n]


# 4) Recursive method
def is_prime_recursive(n, i=None):
    if n <= 1:
        return False
    if i is None:
        i = int(sqrt(n) + 1)
    if i == 2:
        return True
    if n % i == 0:
        return False
    return is_prime_recursive(n, i - 1)


# Test with user input
num = int(input("Enter a number: "))

print(f"\nFlag method : {is_prime_flag(num)}")
print(f"SymPy isprime : {is_prime_sympy(num)}")
print(f"Sieve method  : {is_prime_sieve(num)}")
print(f"Recursive method: {is_prime_recursive(num)}")
