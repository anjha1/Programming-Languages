""" Write a program to demonstrate the use of self with an instance variable to solve the problem 
of variable hiding"""

class prac:
    x=5
    def disp(self,x):
        x=30
        print(f"The value of local variable x is {x}")
        return(f"The value of instance variable x is {self.x}")  #e instance variable. 
obj=prac()
print(obj.disp(50))