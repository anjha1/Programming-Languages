class Person:
    def __init__(self):
        self.Name = "Bill Gates"  # Public attribute
        self.__BankAccNo = 10101   # Private attribute

    def Display(self):
        print("Name =", self.Name)
        print("Bank Account Number =", self.__BankAccNo)

P = Person()

# Access public attribute outside class
print("Name =", P.Name)

# Try to access private variable outside class, but it fails
# Uncommenting the next line will result in an AttributeError
print("Bank Account Number =", P.__BankAccNo)

P.Display()
