"""Write a program to create a list with elements 1,2,3,4 and 5. Display even 
elements of the list using list comprehension. """
list=[1,2,3,4,5]
list=[x**2 for x in list if x%2==0]
print(list)

#without list comprehension
lists=[1,2,3,4,5]
even_numbers=[]
for i in lists:
    if i%2==0:
        even_numbers.append(i)
print(even_numbers)







