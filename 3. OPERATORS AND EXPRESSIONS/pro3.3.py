# Write a program to calculate simple interest (SI).Read the principle, rate of interest and number of years from the user
#si = p*r*year/100

p=eval(input("Enter the Principle Amount= "))
r=eval(input("Enter the Rate of interest= "))
year=int(input("Enter the Year= "))
SI=int(p*r*year/100)
print("Simple Interest " , SI)
