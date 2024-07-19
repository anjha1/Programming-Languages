""" write a program to find the sum of the digits of a given number.
for example if user enter 123.the program should be return(3+2+1),
i.e 6 as the sum of all the digits in a number."""
num=int(input("Enter the number="))
sum=0
rem=0
while num>0:
    rem=num%10    
    num=num//10
    sum=sum+rem
    print(rem,end="")


# sum=sum+num%10    let num=248  than (1)sum=0+8=8,(a)num=24
#         rem=24%10=4                 (2)sum=8+4=12,(b)num=2
#         rem=2%10=2                  (3)sum=12+2=14,(c)num=0
#                                      0>0:stop
#sum=14