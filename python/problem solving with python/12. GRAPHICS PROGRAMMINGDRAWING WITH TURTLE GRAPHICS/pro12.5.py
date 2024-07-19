"""Write a program to create a circle with specifi cations as:
 (a) Fill circle with gray color 
(b) Display the text message “Circle!” inside the circle."""


# CLASS MANGAEMENT SYSYTEM
class BankStatement:
  def add(self,a,b):
    return (f' addition of{a} and {b} is {a+b}')
obj1 = BankStatement()
obj2 = BankStatement()
print(obj1.add(3,4),id(obj1))
print(obj2.add(2,4),id(obj2))
