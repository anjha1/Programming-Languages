"""  Write a program to calculate the area of a rectangle. Pass the length and breadth of the 
rectangle to the method named Calc_Rect_Area().  """
class Rectangle:
    def Calc_Rect_Area(self,length,breadth):
        print(f"Length of Rectangle is {length}")
        print(f"Breadth of Rectangle is {breadth}")
        return (f"Area of Rectangle is {length*breadth}")
obj=Rectangle()
print(obj.Calc_Rect_Area(4,5))