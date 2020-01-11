list1=[]
values=str(raw_input("enter binary value seprated by ','"))
list=[ x for x in values.split(",")]
for t in list:
	inta=int(t,2)
	if (inta % 5 ==0):
		list1.append(t)


print(list1)