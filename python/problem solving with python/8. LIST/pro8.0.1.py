"""                                      LIST                                          """

# *** BASIC
#  CREATING A LIST USING THE CONSTRUCTOR OF THE LIST CLASS:-
L1=list()
print(L1)   #[]
L2=list([10,20,30])
print(L2)        
L3=list(['Aplle',"Orange","Mango","Pine Apple","Banana"])
print(L3)
L4=list(range(0,9))
print(L4)
L5=list("xyz")
print(L5)
L6=list([chr(97),chr(99)])
print(L6)
#  CREATING A LIST WITHOUT USING THE CONSTRUCTOR OF THE LIST CLASS:-
L7=[10,20,30]
print(L7)
L8=['Aplle',"Orange","Mango","Pine Apple","Banana"]
print(L8)
print(L8[0])
print(L8[3])
print(L8[-2])
L1=["RED","BLUE","PINK"]
L1.append("GREEN")
print(L1)
print("""

SECOND METHOD

""")
L=["RED","BLUE","PINK","abc"]
L[len(L):]=["GREEN"] 
print(L)



