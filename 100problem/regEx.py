import re
list=[]

values=raw_input("enter pass for cheak")
l1=[x for x in values.split(',')]
for s in l1:
	if (len(s) <6 or len(s)>12):
		continue
	else:
		pass

	if( not re.search("[a-z]",s)):
		continue


	if( not re.search("[A-Z]",s)):
		continue

	if( not re.search("[0-9]",s)):
		continue

	if( not re.search("[@#$]",s)):
		continue

    
	list.append(s)	


print(list)		
