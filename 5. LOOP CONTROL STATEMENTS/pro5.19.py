""" Write a program to display the pattern of stars given as follows


                    *  *  *  *  * 
                    *  *  *  *
                    *  *  *  
                    *  *
                    *                                           """

num=7
x=num
for i in range(1,6):
    num=num-1
    for j in range(1,num):
        print("*",end=" ")
        x=num-1
    print()

print("SECOND METHORD")
n=int(input("Enter the number:-"))
for k in range(1,n+1):
    print(" *"*(n+1-k))
print("THIRD METHORD")
for l in range(5,0,-1):
    print(" *"*(l))
