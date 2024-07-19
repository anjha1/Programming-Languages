"""Write a program using the while loop to print the factorial of a number"""
n=int(input("Enter the number:-"))
i=1
for k in range(1,n+1):
    i=i*k
print("Factorial of",n,"is",i)
