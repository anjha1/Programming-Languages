""" Write a program to display the reverse of the number entered.
for example, if a user enters 12345. the program should return(54321),
i.e the reverse of the number entered."""

n=int(input("Enter the number:-"))
rem=0
while n>0:
    rem=n%10
    n=n//10
    print(rem,end="")
    
