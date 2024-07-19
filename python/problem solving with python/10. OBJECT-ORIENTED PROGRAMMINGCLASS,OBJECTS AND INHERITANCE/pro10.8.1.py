import math
class Cricle:
    def Calc_Area(self,radius):
        self.radius=0
        print(f"Area of Rectangle is {math.pi*radius**2}")
obj=Cricle()
print(obj.Calc_Area(8))