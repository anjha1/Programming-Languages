""" Consider the list with mixed type of elements, such as
L1 = [1,"x",4,5.6,"z", 9,"a", 0, 4]. Create another list using list comprehension 
which consists of only the integer element present within the list L1."""

L1 = [1,"x",4,5.6,"z", 9,"a", 0, 4]
L1=[x for x in L1 if type(x)==int]
print(L1)
print("""

SECOND METHOD

""")
c=[]
for i in L1:
    if type(i)==int:
        c.append(i)
print(c)


