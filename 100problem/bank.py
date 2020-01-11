netamount=0;
while(True):
	print("operation and amout 'D' for deposit 'W' for withdrawal")
	s=raw_input("input value");
	if not s:
		break;
	else :	
		value=s.split(',')
		if value[0] == 'D':
			netamount+=int(value[1])
		elif value[0] == 'W' :
			if(netamount == 0):
				print("insufficent balance")
			else :
				netamount-=int(value[1])
				
			
print("Net amount is:",netamount)