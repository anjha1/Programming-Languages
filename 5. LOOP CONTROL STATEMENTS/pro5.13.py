# Write a program to calculate the sum of number from 1 to 20 
# which are not divisible 2,3 or 5.
sum=0
for i in range (1,20):
    if i%2==0 or i%3==0 or i%5==0 :
        print(end="")
    else:
        print(i)
        sum=sum+i
print("sum is",sum)

