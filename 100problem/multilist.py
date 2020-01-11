x=raw_input("Enter two  value seprated by ','")
dimension=x.split(',')
rownum=int(dimension[0])

print(rownum)
colnum=int(dimension[1])

print(colnum)
l=[[ 0 for col in range(colnum)] for row in range(rownum)]
for row in range(rownum):
	for col in range(colnum):
		l[row][col]=row*col


print(l)