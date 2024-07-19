# Write a program that prompts a user to enter four numbers, and find the grater number
#among the four number entered.
n1=int(input("Enter the first number:-"))
n2=int(input("Enter the second number:-"))
n3=int(input("Enter the third number:-"))
n4=int(input("Enter the fourth number:-"))
if n1>n2 and n1>n3 and n1>n4:
    print(n1,"i.e first numberis Grater Number amoung of four number")
elif n2>n1 and n2>n3 and n2>n4:
    print(n2,"i.e second number is Grater Number amoung of four number")
elif n3>n1 and n3>n2 and n3>n4:
    print(n3,"i.e third number is Grater Number amoung of four number")
else:
    print(n4,"i.e fourth number is Grater Number amoung of four number")


# Write a program that prompts a user to enter four numbers, and find the grater number
#among the four number entered.
n1=int(input("Enter the first number:-"))
n2=int(input("Enter the second number:-"))
n3=int(input("Enter the third number:-"))
n4=int(input("Enter the fourth number:-"))
sum=n1+n2+n3+n4
for i in range(sum):
    if i==n1 or i==n2 or i==n3 or i ==n4:
        La=i
print(La)