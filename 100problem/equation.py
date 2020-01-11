import math

x=raw_input("plaz provide value")
c=50
h=30
l=[];
iteam=[x for x in x.split(',')]
print (iteam)	
for d in iteam:
	l.append(str(int(round(math.sqrt((2*c*float(d))/h)))))

print (",".join(l))		