"""Write a program to create a class named Circle. Pass the parameter radius to the method 
named Calc _ Area() and calculate the area of the circle. """
import math
class Cricle:
    def Calc_Area(Self,radius):
        Self.radius=radius
        print (f"Area of Rectangle is {math.pi*radius**2}")
obj=Cricle()
print(obj.Calc_Area(8))