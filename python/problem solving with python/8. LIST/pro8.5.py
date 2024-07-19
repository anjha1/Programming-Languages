"""Create a list of 5 elements. Pass the list to a function 
and print the contents of the list inside the function. """

def p(L1):
    for num in L1:
        print(num,end=" ")
L1=[45,78,98,76,54,34]
p(L1)
print("""   without using function     """)

for i in L1:
    print(i,end=" ")