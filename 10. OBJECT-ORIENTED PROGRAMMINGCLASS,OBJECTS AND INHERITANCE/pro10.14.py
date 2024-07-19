""" Write a simple program using the init method."""
class Circle:
    def __init__(self,pi):
        self.pi = pi
    def calc_area(self,radius):
        return self.pi*radius**2
C1=Circle(3.14)
print("The area of Circle is ",C1.calc_area(5))