"""Write a program to illustrate the use of private. """

class Person:
    def __init__(self):
        self.Name = "Bill Gates"  #Public attribute
        self.__BankAccNo =10101   #Private attribute
    def Display(self):
        print("Name = ",self.Name)
        print("Bank Account Number = ",self.__BankAccNo)
        
P = Person()                          #Access public attribute outside class
print(" Name =  ",P.Name) 
P.Display()                            #Try to access private variable outside class but fails
print("Salary = ",P.__BankAccNo)
P.Display()