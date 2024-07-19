"""Write a program to print all the letters from word1 that also appear in word2.
 Example: Word1 = USA North America
 word2= USA South America
""" 
Word1 = "USA North America"
word2= "USA South America"
for i in Word1:
    if i in word2:
        print(i,end="")
