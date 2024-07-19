# Write a program to display the pattern of stars given as follows:
"""                           
                    *  
                 *  *  *  
              *  *  *  *  *
           *  *  *  *  *  *  *              
        *  *  *  *  *  *  *  *  *                            """

k=1
i=1
while i<=5:
    b=1
    while b<=5-i:
        print(" ",end=" ")
        b=b+1
    f=1
    while f<=k:
        print("*",end="")
        f=f+i
    k=k+2
    print( )
    i=i+1

"""      *
      **
    **
  **
**   """
