l=[0,0]
while(True):
	x=raw_input("Enter direction up/down/left/right and no of step seprated by ','")

	if not x:
		break;
	else:
		s=x.split(',')
		if s[0] == 'UP' :
			l[1]=int(l[1])+int(s[1])
		elif s[0] == 'DOWN' :
			l[1]=int(l[1])-int(s[1])
		
		elif s[0] == 'LEFT':
			l[0]=int(l[0])-int(s[1])
		else:
			l[0]=int(l[0])+int(s[1])
			
move=int(l[1])+int(l[0])
print("",move)
      


