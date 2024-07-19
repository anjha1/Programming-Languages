# Write a program to check whether the number entered is an Armstrong number or not.
#153=1**3+5**3+3**3=153
n=int(input("Enter the number:-"))
sum=0
x=n
while n>0:
    rem=n%10                            #3,5,1
    n=n//10                             #15,1,0
    sum=sum+(rem)**3                    #0+9,9+125,134+1=135
if(x==sum):
    print("The Number",x,"is Armstrong")
else:
    print("The Number",x," is Not Armstrong")
    
