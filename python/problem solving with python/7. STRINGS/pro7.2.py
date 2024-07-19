"""Write a program to traverse every second character of a string using the for loop."""

s="india"
for i in range(0,len(s),2):
    print(s[i],end="")
print()
print("""

SECOND METHORD


""")

t="india"
count=0
while count<len(t):
    print(t[count],end="")
    count=count+2