# .append("ELEMENT"), .clear(), .count("ELEMENT"), .copy(), .extend(LIST2),
# .index("ELEMENT"), .pop(), .remove(), .reverse(), .sort(), .split()

L1=["RED","BLUE","PINK"]
L1.append("GREEN")
print(L1)                     #['RED', 'BLUE', 'PINK', 'GREEN']
print("""

SECOND METHOD

""")
L=["RED","BLUE","PINK"]
L[len(L):]=["GREEN"]
print(L)                       # ['RED', 'BLUE', 'PINK', 'GREEN']
# .clear()
T1=["RED","BLUE","PINK"]
T1.clear()
print(T1)                      # []
# .count()
M1=["RED","BLUE","PINK","RED","RED"]
C1=M1.count("RED")
print(C1)                      # 3
# .copy()
CV1=["RED","BLUE","PINK"]
V1=CV1.copy()
print(V1)                      # ['RED', 'BLUE', 'PINK']
# .extend(LIST)
List11=[1,2,3]
List12=[4,5,6]
List11.extend(List12)
print(List11)                  # [1, 2, 3, 4, 5, 6]
# .index(ELEMENT)
List13=["A","B","C","D","E","F","J"]
print(List13.index("E"))                # 4
List14=[3,8,0,6,8,90,65,45,67]
U=List14.index(65)                      # 6
print(U)
# .pop()
List15=["A","B","C","D","E","F","J"]     #last element=J
n=List15.pop()
print(n)
# .pop(INDEX)
List16=["A","B","C","D","E","F","J"]   
List16.pop(5)
print(List16)                                 # ["A","B","C","D","E","J"]
# .remove()
List16=["A","B","C","D","E","F","J","C","G","M"]   
List16.remove("C")    #REMOVE THE FIRST OCCURRENCE OF ELEMENT C FROM THE LIST
print(List16)            #['A', 'B', 'D', 'E', 'F', 'J', 'C', 'G', 'M']
# .reverse()
List17=["A","B","C","D","E","F","J","C","G","M"]   
List17.reverse()
print(List17)                         #['M', 'G', 'C', 'J', 'F', 'E', 'D', 'C', 'B', 'A']
# .sort()
List18=[3,8,0,6,8,90,65,45,67]
List18.sort()                     
print(List18)                        #[0, 3, 6, 8, 8, 45, 65, 67, 90]
# .split()
A="Wow !!! I Love Gla IN 1"
B=A.split()
print(B)
# SECOND METHOD .split()
A="Wow !!! I Love Gla IN 1".split()
print(A)
