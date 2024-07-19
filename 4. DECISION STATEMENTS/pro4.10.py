# Write a program that prompts a user to enter two different numbers. Perform basic arithmetic operations based on the choices.
num1=int(input("Enter the first number="))
num2=int(input("Enter the second number="))
choice=int(input("Enter the choice="))
Addition=num1+num2
Subtraction=num1-num2
Multiplication=num1*num2
Division=num1/num2
if choice==1:
    print("1) Addition=",Addition)
if choice==2:
    print("2)Subtraction=",Subtraction)
if choice==3:
    print("3)Multiplication=",Multiplication)
if choice>=4:
    print("4)Division=",Division)
    
