# 1. Direct formula (hardcoded)
p, t, r = 8000, 6, 8
si_direct = (p * t * r) / 100
print(f"1. Direct formula: {si_direct}")

# 2. User input
print("\n2. Enter values for user input:")
p_user = float(input("Principal: "))
t_user = float(input("Time (years): "))
r_user = float(input("Rate (%): "))
si_user = (p_user * t_user * r_user) / 100
print(f"User input SI: {si_user}")

# 3. Function method
def simple_interest(p, t, r):
    return (p * t * r) / 100
print(f"3. Function: {simple_interest(8000, 6, 8)}")

# 4. Lambda function
si_lambda = lambda p, t, r: (p * t * r) / 100
print(f"4. Lambda: {si_lambda(8000, 6, 8)}")

# 5. List comprehension
p, t, r = 8000, 6, 8
si_list = [p * t * r / 100][0]
print(f"5. List comp: {si_list}")