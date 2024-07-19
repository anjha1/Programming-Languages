# Write a program to display multiplication tables from 1 to 5.
for i in range(1,6):
    for j in range(1,11):
        print(format(i*j,"7d"),end=" ")
    print()

