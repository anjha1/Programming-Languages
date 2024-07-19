

"""                              using for loop                         """
#  WITHOUT USING LIST COMPREHENSION

'''l1=[23,56,73,67,89,74]
for i in range(0,len(l1)):
    l1[i]=l1[i]+100
print(l1) '''


#  USING LIST COMPREHENSION
l1=[23,56,73,67,89,74]
l1=[x+100 for x in l1]
print(l1)