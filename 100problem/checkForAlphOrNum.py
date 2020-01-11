string=raw_input("enter alphbet nd no:")
d={"digit":0,"alpha":0}

for s in string:
	if s.isalpha():
		d["alpha"]+=1;
	elif s.isdigit():
		d["digit"]+=1;
	else :
	    pass	


print("digit count",d["digit"])	
print("alpha count",d["alpha"])	