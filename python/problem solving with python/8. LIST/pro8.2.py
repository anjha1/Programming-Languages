"""Consider the following mathematical expressions
 A = {: x in {0………9}}
 B = {: x in {0……9}}
 C = {X : x in A and even}
  Write a program to create a list "A" to generate squares  of a number (from 1 to 10),
  list "B" to generate cubes of a number (from 1 to 10) and list "C" with
  those elements that are even and present in list "A"  """
A=[1,2,3,4,5,6,7,8,9,10]
A=[x*x for x in A]
print(A)
B=[1,2,3,4,5,6,7,8,9,10]
B=[i**3 for i in B]
print(B)
C=[1,2,3,4,5,6,7,8,9,10]
C=[y%2==0 for  y in C]
print(C)
D=[x for x in range(1,11) if x%2==0]
print(D)
print("""
      
SECOND METHORD
      
""")
A1=[ x**2 for x in range(1,11) ]
print(A1)
B1=[ x**3 for x in range(1,11) ]
print(B1)
C1=[x%2==0 for x in range(1,11)]
print(C1)
D1=[y for y in range(1,11) if y%2==0]
print(D1)
print("""
      
without list comprehension
      
""")
e=[]
f=[]
for i in list(range(1,11)):
    e.append(i**2)
    f.append(i**3)       
print(e)
print(f)
