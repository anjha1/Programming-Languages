# write a program to add consective number starting from 1 using the while loop.
n=int(input("enter the number:-"))
count=0
sum=0
while count<=n:
    sum=sum+count
    count=count+1
print("count is",sum)


