"""Write a program to create two methods, i.e. Method_A() and Method_B(). Call 
Method_A() from Method_B() using self."""
class Self_Demo:
    def Method_A(self):
        print('In Method A') 
        print('wow got a called from A!!!')
    def Method_B(self):
        print('In Method B calling Method A')
        self.Method_A()  #Calling Method_A
Q=Self_Demo()
Q.Method_B()  #calling Method_B