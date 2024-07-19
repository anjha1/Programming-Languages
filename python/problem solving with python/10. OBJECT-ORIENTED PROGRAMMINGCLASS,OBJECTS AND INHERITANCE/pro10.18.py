""" Write a program to calculate the area of a rectangle by 
passing an object as parameter to method."""

class Rectangle:
    length = 0
    breadth = 0
    def __init__(self, l , w):
        self.length = l
        self.breadth  = w
    def Calc_Area(self, obj):
        print(" Length = ",obj.length)
        print(" Breadth = ",obj.breadth)
        return  obj.length * obj.breadth
Obj1 = Rectangle(10,20)
Obj2 = Rectangle(11,2)
print("The area of Rectangle is ", Obj1.Calc_Area(Obj2))