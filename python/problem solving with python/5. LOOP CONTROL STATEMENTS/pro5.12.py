# write a program to print even number from 0 to n and find their sum.
n=int(input("Enter the number"))
sum=0
for i in range(0,n+1):
    if i%2==0:
        print("Even number is ",i)
        sum=sum+i
print("sum of all even number is",sum)



