# Write a program to calculate the salary of a medical representative considering the sales bonus and incentives offered to him are based on the total sales. If the sales exceed or equal to 
#`1,00,000 follow the particulars of Column 1, else follow Column 2.
#                                   Column 1    | Column 2
#                                 Basic = `4000 | Basic = `4000
#                            HRA = 20% of Basic | HRA = 10% of Basic
#                           DA = 110 % of Basic | DA = 110 % of Basic
#                             Conveyance = `500 | Conveyance = `500
#                     Incentive = 10% of Sales  | Incentive = 4% of Sales
#                                 Bonus = `1000 | Bonus = `500



Sales=float(input("Enter Total Sales of the Month:"))
if Sales >= 100000:
 basic = 4000
 hra = 20 * basic/100
 da = 110 * basic/100
 incentive = Sales * 10/100
 bonus = 1000
 conveyance = 500
else:
 basic = 4000
 hra = 10 * basic/100
 da = 110 * basic/100
 incentive = Sales * 4/100
 bonus = 500
 conveyance = 500
salary= basic+hra+da+incentive+bonus+conveyance
print("Salary receipt of employee")
print(" Total Sales = ",Sales)
print(" Basic = ",basic)
print(" HRA = ",hra)
print(" DA = ",da)
print(" Incentive = ",incentive)
print(" Bonus = ",bonus)
print(" Conveyance = ",conveyance)
print(" Gross Salary=",salary)
