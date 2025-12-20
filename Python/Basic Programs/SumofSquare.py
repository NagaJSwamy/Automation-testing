from functools import reduce

n = int(input("Enter n: "))

# 1) Mathematical formula (O(1))
res_formula = n * (n + 1) * (2 * n + 1) // 6

# 2) Generator expression with sum()
res_gen = sum(x * x for x in range(1, n + 1))

# 3) reduce() with lambda
res_reduce = reduce(lambda x, y: x + y * y,
                    range(1, n + 1),
                    0)

# 4) For loop
total = 0
for i in range(1, n + 1):
    total += i * i
res_loop = total

print(f"\nFormula   : {res_formula}")
print(f"Generator : {res_gen}")
print(f"reduce()  : {res_reduce}")
print(f"For loop  : {res_loop}")
