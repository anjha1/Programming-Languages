# Write a program to display the pattern of stars given as follows:
"""                           
                    *  
                    *  *  
                    *  *  *
                    *  *  *  *              
                    *  *  *  *  *                            """
num=1
x=num
for i in range(1,6):
    num=num+1
    for j in range(1,num):
        print("*",end=" ")
    x=num+1
    print()

# using while loops
print("SECOND METHORD")

i=1
while i<=5:
    j=1
    while j<=i:
        print("*",end=" ")
        j=j+1
    print()
    i=i+1
print("THIRD METHORD")

n=int(input("Enter the number:-"))
for k in range(1,n+1):
    print(" *"*k)

print("FOURTH METHORD")

for m in range(1,n+1):
    print("  "*n,end=(""))
    for p in range(1,m+1):
        print("*",end=" ")
    print()
