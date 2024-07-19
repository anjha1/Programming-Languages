# check if the number entered is prime or not.
k=True
num=int(input("Enter the number:-"))
for i in range(2,num):
    if num%i==0:
        k=False
    break
if k==True or num==1:
    print("Prime")
else:
    print("Not Prime")