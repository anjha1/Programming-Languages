""" Write a program to initialise the value of the attributes 
by making use of the init method."""

class Circle:
    pi = 0                #Attribute pi
    radius = 0             #Attribute radius     
    def __init__(self):
        self.pi = 3.14
        self.radius = 5
    def calc_area(self):
        print("Radius = ",self.radius)
        return self.pi*self.radius**2
C1=Circle()
print(" The area of Circle is ",C1.calc_area())