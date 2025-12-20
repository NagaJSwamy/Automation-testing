n = int(input("Enter n: "))

# 1) Mathematical formula: ((n(n+1))/2)^2
res_formula = ((n * (n + 1)) // 2) ** 2

# 2) Brute force loop
res_loop = 0
for i in range(1, n + 1):
    res_loop += i ** 3

# 3) Generator expression
res_gen = sum(i**3 for i in range(1, n + 1))

# 4) Enumerate list
res_enum = sum((i + 1) ** 3 for i, _ in enumerate(range(n)))

print(f"\nFormula   : {res_formula}")
print(f"For loop  : {res_loop}")
print(f"Generator : {res_gen}")
print(f"Enumerate : {res_enum}")
