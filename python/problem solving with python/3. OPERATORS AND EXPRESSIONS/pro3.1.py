# Read the cost and selling price and object and write a program to 
#find the profit earned by a seller (in rupees). The selling price is greater than the cost price.



sp=int(input("Enter the selling price = "))
cp=int(input("Enter the cost price= "))
print("SELLING PRICE = " , sp)
print("COST PRICE = " , cp)
if sp>cp:
    profit=sp-cp
    print("PROFIT = ", profit)
else:
    print("loss")




