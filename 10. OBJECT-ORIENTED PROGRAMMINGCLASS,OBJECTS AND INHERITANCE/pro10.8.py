"""  Write a program for variable hiding"""
class prac:
    x=5
    def disp(self,x):
        x=30
        print(f"The value of local variable x is {x}")
        return(f"The value of instance variable x is {x}")
obj=prac()
print(obj.disp(50))

