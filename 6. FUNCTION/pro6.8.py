"""Write a program to illustrate the use of default values in a function’s defi nition"""

# Input
A, B, H = map(int, input().split())

# Check Ann's sleep schedule
if H < A:
    print("Deficiency")
elif H > B:
    print("Excess")
else:
    print("Normal")
