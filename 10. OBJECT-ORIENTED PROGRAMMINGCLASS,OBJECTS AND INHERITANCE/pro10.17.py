""" Write a program to pass an object as parameter to a method."""
class Test:
    a = 0
    b = 0
    def __init__(self, x , y):
        self.a = x
        self.b = y
    def equals(self, obj):
        if(obj.a == self.a and obj.b == self.b):
            return True
        else:
            return False
Obj1 = Test(10,20)    
Obj2 = Test(10,20)
Obj3 = Test(12,90)
print("Obj1 == Obj2 ",Obj1.equals(Obj2))
print(" Obj1 == Obj3 ",Obj1.equals(Obj3))