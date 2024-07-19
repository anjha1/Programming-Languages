"""  Write a program to calculate the volume of a box."""
class Box:
    def __init__(self):   
        self.width = 5
        self.height = 5
        self.depth = 5
    def calc_vol(self):
        print("Width  = ",self.width)
        print("Height  = ",self.height)
        print("depth  = ",self.depth)
        return self.width * self.height * self.depth
B1=Box()   
print(" The Volume of Cube is ",B1.calc_vol())