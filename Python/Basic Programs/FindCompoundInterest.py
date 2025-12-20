# 1. Exponentiation operator (hardcoded)
p, r, t = 1200, 5.4, 2
a1 = p * (1 + r/100) ** t
ci1 = a1 - p
print(f"1. ** operator: {ci1:.2f}")

# 2. User input with pow()
print("\n2. Enter values:")
p_user = float(input("Principal: "))
r_user = float(input("Rate (%): "))
t_user = float(input("Time (years): "))
a2 = p_user * pow((1 + r_user/100), t_user)
ci2 = a2 - p_user
print(f"User input pow(): {ci2:.2f}")

# 3. Built-in pow() function
a3 = p * pow((1 + r/100), t)
ci3 = a3 - p
print(f"3. pow() function: {ci3:.2f}")

# 4. For loop method
amt = p
for i in range(t):
    amt *= (1 + r/100)
ci4 = amt - p
print(f"4. For loop: {ci4:.2f}")

# 5. Function wrapper
def compound_interest(p, r, t):
    return p * (1 + r/100) ** t - p
print(f"5. Function: {compound_interest(1200, 5.4, 2):.2f}")
