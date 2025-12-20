import math
import numpy as np

# 1. math.pi (recommended)
r = 5
area1 = math.pi * (r ** 2)
print(f"1. math.pi: {area1:.2f}")

# 2. User input with math.pi
print("\n2. Enter radius:")
r_user = float(input("Radius: "))
area2 = math.pi * (r_user ** 2)
print(f"User input: {area2:.2f}")

# 3. math.pow()
area3 = math.pi * math.pow(r, 2)
print(f"3. math.pow(): {area3:.2f}")

# 4. numpy.pi
area4 = np.pi * (r ** 2)
print(f"4. numpy.pi: {area4:.2f}")

# 5. Hardcoded PI
PI = 3.142
area5 = PI * (r * r)
print(f"5. Hardcoded PI: {area5:.2f}")
