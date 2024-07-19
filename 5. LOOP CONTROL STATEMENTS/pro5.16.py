"""Write a program to print fibonacci series up to 8.
First_Number=0
Second_Number=1
Fibonacii Series=0 1 1 2 3 5 8 13 21 34 55"""

n=eval(input("Enter the number:-"))
x=0
y=1
z=0
while z<=n:
    print(z,end=" ")           
    x=y                        # x=1,0,1,1,2
    y=z                        # y=0,1,1,2,3
    z=x+y                      # z=1,1,2,3,5
print(z) 
