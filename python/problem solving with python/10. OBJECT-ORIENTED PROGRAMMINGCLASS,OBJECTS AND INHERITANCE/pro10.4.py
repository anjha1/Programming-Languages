""" Write a program to calculate the area of a rectangle by assigning the value to the attributes of 
a rectangle, i.e. length and breadth."""
class Rectangle:
    length=0
    breath=0
R1=Rectangle()
print(f"Area of Rectangle is {R1.length*R1.breath}")
R1.length=5
R1.breath=6
print(f"Area of Rectangle is {R1.length*R1.breath}")