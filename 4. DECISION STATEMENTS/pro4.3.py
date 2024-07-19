# Write a program which prompts a user to enter the radius of a circle. 
# If the radius is greater than zero then calculate and print the area and circumference of the circle.

radius=eval(input("Enter the radius of circle="))
from math import pi
area=pi*radius**2
circumference=2*pi*radius
if radius>0:
    print(area)
    print(circumference)




