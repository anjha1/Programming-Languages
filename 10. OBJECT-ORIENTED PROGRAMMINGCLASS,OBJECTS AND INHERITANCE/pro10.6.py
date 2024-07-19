"""Write a program to create a class named Circle. Pass the parameter radius to the method 
named Calc _ Area() and calculate the area of the circle. """
import math    
class Circle:
    def Calc_Area(self,radius):
        print("radius = ",radius)
        return math.pi*radius**2
ob1 = Circle()    
print("Area of circle is ",ob1.Calc_Area(5))