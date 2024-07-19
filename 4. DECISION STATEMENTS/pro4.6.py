# Write a program to test whether a number is divisible by 5 and 10 or by 2 or 10.
num=int(input("Enter the nuumber :"))
print("Enter number is :",num)
if (num % 5== 0 and num % 10==0):
    print(num,"is divisible by both 5 and 10")
else:
    print(num,"is not divisible either by 5 or 10 ")



