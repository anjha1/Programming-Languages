# write a program to display the pattern of numbers given as follows.
"""                                                                
                        1                                             
                        1  2                                             
                        1  2  3                                           
                        1  2  3  4                                           
                        1  2  3                                          
                        1  2                                              
                        1                                                """

num=1
x=num
for i in range(1,5):
    num=num+1
    for j in range(1,num):
        print(j,end=" ")
        x=num+1
    print()
num=5
y=num
for i in range(1,4):
    num=num-1
    for j in range(1,num):
        print(j,end=" ")
        y=num-1
    print()
