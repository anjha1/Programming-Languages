""" Consider a list with five different Celsius values. 
Convert all the Celsius=[10,20,31.3,40,39.2] values into Fahrenheit. """
Celsius=[10,20,31.3,40,39.2]
Fahrenheit=[float((9/5)*x+32) for x in Celsius]
print(Fahrenheit)
print("""

SECOND METHOD

""")
t=[]
for i in Celsius:
    F=float((9/5)*i+32)
    t.append(F)
print(t)
