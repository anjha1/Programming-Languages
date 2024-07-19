"""                                ROAD MAP

 .append("ELEMENT"), .clear(),v= .count("ELEMENT"), .copy(), .extend(LIST2),
 .index("ELEMENT"), .pop(), .remove("ELEMENT"), .reverse(), .sort(), .split()  """

print(" EXAMPLE")
L1=["sita","gita","anita","sita","gita","meta"]
L2=["sita","gita","anita","sita","gita","meta"]
L3=["snj","anj","mnj","tug","hjgj"]
L4=["snj","anj","mnj","tug","hjgj"]
L5=["snj","anj","mnj","tug","hjgj"]
L6=["snj","anj","mnj","tug","hjgj"]
L1.append("gita")                          # ["sita","gita","anita","sita","gita","meta","gita"]
print(L1)                                  
#    ("clear() EXAMPLE")
L1.clear()                                # []
print(L1)
#    (".count EXAMPLE")
a=L2.count("gita")
print(a)                                  # 2      
#    (".copy() EXAMPLE:-")
b=L2.copy()
print(b)                                  # ["sita","gita","anita","sita","gita","meta"]
#    (".extend(LIST2) EXAMPLE:-")
L2.extend(L3)
print(L2)                          # ["sita","gita","anita","sita","gita","meta","snj","anj","mnj","tug","hjgj"]
#    (" .index('ELEMENT') EXAMPLE")
c=L2.index("meta")
print(c)                          # 5
#     (" .pop() EXAMPLE")
L3.pop()
print(L3)                         # ["snj","anj","mnj","tug"]
#     ("  .remove() EXAMPLE")
L5.remove("anj")                  # ["snj","mnj","tug","hjgj"]
print(L5)
#     (" .reverse() EXAMPLE")
L5.reverse()                     #['hjgj', 'tug', 'mnj', 'snj']
print(L5)
#     (" .sort() EXAMPLE")
L6.sort()                       #[5,88,44,76]
print(L6)                       
