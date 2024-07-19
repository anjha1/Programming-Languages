"""Write a program to display a greeting message. Create a class named MethodOverloading. 
Defi ne the function greeting() having one parameter Name.  """

class methodOverloading :
    def greeting(self, name=None):
        if name is not None:
            print("Welcome " + name)
        else:
            print("Welcome")
 # Create an object referencing by variable obj
obj = methodOverloading()
 # call the method greeting without parameter
#obj.greeting()
 # call the method with parameter
obj.greeting("Donald Trump")