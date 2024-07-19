""" Write a program to demonstrate the use of the isinstance() method. """

class A:
    pass
 class B:
    pass
 class C:
    pass 
Ob1=A()        #Instance of Class A
Ob2=B()        #Instance of Class B  
Ob3=C()        #Instance of Class C    
#Lets make use of isinstance method to check the type.
isinstance(Ob1,A)
True
isinstance(Ob1,B)
False
isinstance(Ob2,B)
True
isinstance(Ob2,C)
False
isinstance(Ob3,B)
False
isinstance(Ob3,C)
True 