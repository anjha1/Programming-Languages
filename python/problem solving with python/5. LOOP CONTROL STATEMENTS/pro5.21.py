# write a program to display the pattern of numbers given as follows:
"""                        
                1
                1  2
                1  2  3
                1  2  3  4
                1  2  3  4  5
                                                               """


num=1
x=num
for i in range(1,6):
    num=num+1
    for j in range(1,num):
        print(j,end=" ")
        x=num+1
    print()
    i=i+1
print("SECOND METHORD")

n=int(input("Enter the numbrer"))
for m in range(1,n+1):
    print(""*n,end="")
    for k in range(1,m+1):
        print(k,end=" ")
    print()

