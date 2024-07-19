'''Write a program to prompt a user to read the marks of fi ve different subjects. Calculate the 
total marks and percentage of the marks and display the message according to the range of 
 percentage given in table.
Percentage Message
 per > = 90 Distinction
per > = 80 && per < 90 First Class
per > = 70 && per < 80 Second Class
per > = 60 && per < 70 third Class
per <60 Fai
and each subject having mark<60 print fail in subject'''

sub1=int(input("Enter the 1st sub mark="))
if sub1<60:
    print(sub1,"*","-Fail in sub1")
if sub1<=100 and sub1>=60:
 sub2=int(input("Enter the 2nd sub mark="))
if sub2<60:
    print(sub2,"*","-Fail in sub2")
else:
    print("PLEASE ENTER THE NUMBER IS GREATER THAN EQUAL TO 60 AND LESS THAN EQUAL TO 100\n THAN SHOW YOUR TOTAL PERCENTAGE")
if sub2<=100 and sub2>=60:
    sub3=int(input("Enter the 3rd sub mark="))
if sub3<60:
    print(sub3,"*","-Fail in sub3")
else:
    print("PLEASE ENTER THE NUMBER IS GREATER THAN EQUAL TO 60 AND LESS THAN EQUAL TO 100\n THAN SHOW YOUR TOTAL PERCENTAGE")
if sub3<=100 and sub3>=60:
    sub4=int(input("Enter the 4th sub mark="))
if sub4<60:
    print(sub4,"*","-Fail in sub4")
else:
    print("PLEASE ENTER THE NUMBER IS GREATER THAN EQUAL TO 60 AND LESS THAN EQUAL TO 100\n THAN SHOW YOUR TOTAL PERCENTAGE")
if sub4<=100 and sub4>=60:
    sub5=int(input("Enter the 5th sub mark="))
if sub5<60:
    print(sub5,"*","-Fail in sub5")
else:
    print("PLEASE ENTER THE NUMBER IS GREATER THAN EQUAL TO 60 AND LESS THAN EQUAL TO 100\n THAN SHOW YOUR TOTAL PERCENTAGE")
if sub5<=100 and sub5>=60:
  total_mark=(sub1+sub2+sub3+sub4+sub5)
if total_mark<=500:
    print("Total mark=",total_mark)
per=(total_mark)/(5)
if per>=90:
    print("Distinction")
if per>=80 and per<90:
    print("First class")
if per>=70 and per<80:
    print("second class")
if per>=60 and per<70:
    print("third class")
if per<60:
   print("fail")
   





