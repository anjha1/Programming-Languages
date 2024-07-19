# Write a program to prompt a user to enter a day of the week. If the entered day of the week is 
# between 1 and 7 then display the respective name of the day.

day=int(input("Enter the day:"))
if day==1:
    print("MONDAY")
if day==2:
    print("TUESDAY")
if day==3:
    print("WEDNESDAY")
if day==4:
    print("THURSDAY")
if day==5:
    print("FRIDAY")
if day==6:
    print("SATURDAY")
if day==7:
    print("SUNDAY")
else:
    print("please enter the day between 1 to 7")


