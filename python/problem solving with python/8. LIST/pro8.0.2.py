"""                                      LIST                                          """
l1=[12,34,67,78,90]
print(l1[1])         #34
print(l1[0:4])       #[12, 34, 67, 78]
print(l1[0:5:2])     #[12, 67, 90]
print(len(l1))       #5
print(max(l1))       #90
print(min(l1))       #12
print(sum(l1))       #281
import random
a=random.shuffle(l1)
print(a)
"""                                  THE LIST OPERATOR                            """

m2=[12,34,76]
m3=[34,25,40]
add=m2+m3         
print(add)           #[12, 34, 76, 34, 25, 40]
mul=3*m3
print(mul)           #[34, 25, 40, 34, 25, 40, 34, 25, 40]
print(34 in m2)      #True
print(100 in m2)     #False
a=[4,6,8]
b=[4,6,8]           #lists are not identical.
print(a in b)       #False
c="anjha"
d="anjha"            # strings are identical.
print(c in d)        #True

