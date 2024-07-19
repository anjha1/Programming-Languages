""" Write a program to illustrate the use of the __del__ method."""

class Destructor_Demo:
    def __init__(self):                                 #Constructor
        print("Welcome")
    def __del__(self):                                  #Destructor   
        print("Destructor Executed Successfully")
Ob1=Destructor_Demo()                                   #Instantiation 
Ob2 = Ob1                      
Ob3 = Ob1                                  #Object Ob2 and Ob3 refers to same object 
print(" Id of Ob1 = ",id(Ob1))
print(" Id of Ob2 = ",id(Ob2))
print(" Id of Ob3 = ",id(Ob3))