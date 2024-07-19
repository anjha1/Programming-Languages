# Write the program to calcullate GST .


COST=float(input("Enter the cost= "))
CGST=float(input("Enter the CGST cost on a Product in %= "))
SGST=float(input("Enter the SGST cost on a product in %= "))
a=(CGST/100)*COST
b=(SGST/100)*COST
TOTAL_COST=a+b+COST
print("Cost of the price = ",COST)
print("CGST amount on a product= ",a)
print("SGST amount on a product= ",b)
print("Total Cost= ",TOTAL_COST)

