n=int(input("Enter the number:-")) #5
for i in range(1,n+1):
    print(""*(n-i),end="")
    for j in range(i,0,-1):
        print(j,end=" ")
    print("")