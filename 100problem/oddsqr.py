str=raw_input("enter the no seprated by ','")
list=[]
for x in str.split(','):
	if int(x)%2 !=0:
		list.append(int(x)*int(x))

print(list)		

