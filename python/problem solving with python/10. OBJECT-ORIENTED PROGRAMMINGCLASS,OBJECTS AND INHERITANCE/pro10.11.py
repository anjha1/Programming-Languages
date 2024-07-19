""" Write a program to display the attributes present in a given class"""

class DisplayDemo:
    Name = ""         #Attribute
    Age = ""        #Attribute
    def read(self):
        Name=input("Enter Name of student: ")
        print("Name = ",Name)
        Age=input("Enter Age of the Student:")
        print("Age = ",Age)
D1 = DisplayDemo()  
D1.read()